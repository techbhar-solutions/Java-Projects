
import java.net.*;
import java.io.*;
public class MyClient {
    public static void  main(String[] args){
        try {
            Socket ss = new Socket("localhost",8847);
            DataOutputStream dout = new DataOutputStream(ss.getOutputStream());
            dout.writeUTF("hii");
            System.out.println("Message Sent!");

            dout.flush();
            dout.close();
            ss.close();
        }
        catch (Exception e){
            System.out.println("Server Nahi Mila! Pahle Server Ko Run Karo");
            System.out.println(e);
        }
    }
}
