package baam;
import java.net.*;
import java.io.*;

public class arpServer {
    public static void main(String args[]) throws IOException {
        ServerSocket ss = new ServerSocket(56);
        Socket s = ss.accept();
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        String iparr[] = { "199.10.10.4", "10.0.0.3", "132.10.34.56" };
        String macarr[] = { "00-0c-6e-5c-3c-63", "02-11-B6-F3-EF-21", "03-12-B3-F3-EF-18" };
        String str = in.readLine();
        System.out.println("Ip Address received from server" + str);
        int flag = 0;
        for (int i = 0; i < 3; i++) {
            if (str.equals(iparr[i]) == true) {
                flag = 1;
                String str1 = macarr[i];
                out.writeBytes(str1 + "\n");
                break;
            }
        }
        if (flag == 0)
            System.out.println("Given IPAddress is not in the network");
        s.close();
    }
}