package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		// 1. ServerSocket instance
		ServerSocket severSocket = new ServerSocket();

		// 2. Bind
		// Ip, portNum setting
		// 192.168.35.145, 10001
		severSocket.bind(new InetSocketAddress("192.168.35.145", 10001));

		System.out.println("[서버 시작]");
		System.out.println("=========================================");
		System.out.println("[연결 대기 중..]");

		// 3. Accept
		Socket socket = severSocket.accept();
		System.out.println("[연결 완료]");

		// 5-2.메시지 수신 Stream
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		// 5-3.메시지 송신 Stream
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		while (true) {
			// 5-2.메시지 수신
			String msg = br.readLine();// Client에서 수신한 메시지

			if (msg == null) {
				break;
			}
			System.out.println("[Client]: " + msg);

			// 5-3.메시지 송신
			bw.write(msg);
			bw.newLine();
			bw.flush();
		}

		br.close();
		bw.close();

		System.out.println("=========================================");
		System.out.println("[서버 종료]");

		severSocket.close();

	}

}
