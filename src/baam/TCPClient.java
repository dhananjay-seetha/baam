package baam;


	import java.io.*;
	import java.net.*;

	public class TCPClient {
	    public static void main(String [] args) throws Exception
	    {
	        int port = 9000;
	        Socket s;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        s = new Socket(InetAddress.getLocalHost(),port);
	        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
	        BufferedReader brl = new BufferedReader(new InputStreamReader(s.getInputStream()));
	        System.out.print("Enter  string: ");
	        String str = br.readLine();
	        pw.println(str);
	        pw.flush();
		   
	        String msg = brl.readLine();
	        System.out.print(msg);
	    }
	}

