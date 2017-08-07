package tech.hyhy.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 
 * @author jon
 * http://blog.csdn.net/ameyume/article/details/8146143
 */
public class ServerSoket {
	public static final String SERVERIP = "192.168.0.126";
	public static final int SERVERPORT = 51706;

	static void serverTest() {
		try {
			ServerSocket serverSocket = new ServerSocket(SERVERPORT);
			while (true) {
				Socket client = serverSocket.accept();
				System.out.println("S : Receiving...");

				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())),
						true);
				String str = in.readLine();
				if (str != null) {
					out.println("You sent to server message is:" + str);
					out.flush();

//					File file = new File("/home/jon/桌面/blog.txt");
//					FileOutputStream fops = new FileOutputStream(file);
//					byte[] b = str.getBytes();
//					for (int i = 0; i < b.length; i++) {
//						fops.write(b[i]);
//					}
					System.out.println("S :Received: " + str);
				} else {
					System.out.println("Not receiver anything form client ");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();

		exec.execute(new Runnable() {

			@Override
			public void run() {
				serverTest();
			}
		});
	}

}
