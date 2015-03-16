/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.net.*;
import java.io.*;
import javax.print.DocFlavor.READER;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Client signing ON.");

		// Create socket object of client
		Socket soc = new Socket("192.168.0.18", 9083);

		System.out.println("Client says connection established");
		// Code for creating output channel to server
		InputStream in = soc.getInputStream(); // for incoming messages
		OutputStream out = soc.getOutputStream(); // for outgoing messages
		// Code for writing data
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter nos = new PrintWriter(bw, true);
		// keyboard input
		BufferedReader kin = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("Start Chat: (Enter . to log off) \n");
		String read = new String();
		while (!(read.equals("."))) {

			read = kin.readLine();
			// send to server using nos ob
			nos.println(read);

		}

		System.out.println("I/P and O/p Objects created");
		System.out.println("Client signing OFF.");
	}

}
