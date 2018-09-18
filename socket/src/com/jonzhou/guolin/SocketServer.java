package com.jonzhou.guolin;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * https://www.imooc.com/video/4879
 */
public class SocketServer {
    public static void main(String[] args) {
        SocketServer socketServer = new SocketServer();
        socketServer.startServer();
    }

    private void startServer() {
        BufferedReader reader = null;
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedWriter writer =null;
        try {
            serverSocket = new ServerSocket(6666);
            System.out.println("server started....");
            socket = serverSocket.accept();
            System.out.println("client  " + socket.hashCode() + "connected");

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String receivedMsg;
            while ((receivedMsg = reader.readLine()) != null) {
                System.out.println(receivedMsg);
                writer.write("server reply: " + receivedMsg + "\n");
                writer.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
                reader.close();
                serverSocket.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
