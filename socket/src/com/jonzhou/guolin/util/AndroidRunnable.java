package com.jonzhou.guolin.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;


public class AndroidRunnable implements Runnable {
    public Socket socket = null;

    public AndroidRunnable(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        System.out.println("客户端连入成功...");
        String line = "";
        InputStream input = null;
        OutputStream output = null;
        BufferedReader bff = null;
//        JSONObject result = new JSONObject();// 需要导入json的多个jar包，http://download.csdn.net/detail/u011381488/6457097
        try {
            // 向客户端发送信息
            output = socket.getOutputStream();
            input = socket.getInputStream();
            bff = new BufferedReader(new InputStreamReader(input));

            // 获取客户端的信息
            while ((line = bff.readLine()) != null) {
                System.out.println("接收到客户端的消息为：" + line);
                socket.shutdownInput();// 半闭socket
                // 向客户端发送消息
//                JSONObject jsonObject = JSONObject.fromObject(line);
//                String username = jsonObject.getString("username");
//                String password = jsonObject.getString("password");
//                // 验证用户名、密码
//                if (username.equals("123") && password.equals("456")) {
//                    result.put("state", "0");
//                    result.put("msg", "登录成功");
//                } else {
//                    result.put("state", "1");
//                    result.put("msg", "密码错误");
//                }
                String result = "呵呵";
                System.out.println("向客户端发送的消息为：" + result.toString());
                OutputStream out = socket.getOutputStream();
                out.write(result.toString().getBytes());
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭输入输出流
            try {
                output.close();
                bff.close();
                input.close();
                socket.close();// socket最后关闭
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
