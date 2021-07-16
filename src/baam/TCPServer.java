package baam;

import java.io.*;
import java.net.*;
public class TCPServer {
    public static void main(String [] args) throws Exception
    {
        Socket s;
        int port = 9000;
        try (ServerSocket ss = new ServerSocket(port)) {
			System.out.println("Waiting for client");
			s = ss.accept();
		}
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        String s1  = br.readLine();
        System.out.println("String sent by client: " +s1);
	
       String s2 = s1.toUpperCase();
        pw.println(s2);
        pw.flush();
    }
}
