/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import java.io.*;
import java.net.*;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Server Started..");
		// create server socket
		ServerSocket ss = new ServerSocket(9083);
		// store the socket object of server which is created on getting request
		// from client
		Socket soc = ss.accept();

		System.out.println("server says connection established");
		// Input channel to get data from client
		InputStream in = soc.getInputStream();// for incoming messages
		OutputStream out = soc.getOutputStream();// for outgoing messages

		// To read data
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader nis = new BufferedReader(isr);

		String str = nis.readLine();

		while (!str.equals(".")) {
			System.out.println("Server recieved this " + str);
			str = nis.readLine();
		}

		System.out.println("I/P and O/p Objects created");
		System.out.println("Server signing OFF.");
	}

}
