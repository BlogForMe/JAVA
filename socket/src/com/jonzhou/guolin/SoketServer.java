package com.jonzhou.guolin;

import com.jonzhou.guolin.util.AndroidRunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SoketServer {
    /**
     * 程序入口
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(30000);
        System.out.println("等待客户端连入...");
        while(true){
            //等待客户端连入
            Socket socket = serverSocket.accept();
            new Thread(new AndroidRunnable(socket)).start();
        }
    }
}
