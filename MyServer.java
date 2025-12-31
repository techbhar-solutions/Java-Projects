import java.net.*;
import java.io.*;

public class MyServer {
    public static void main(String[] args){
        try {
             System.out.println("Server Start ho raha hai.. Client ka wait kar raha hu...");
             ServerSocket ss = new ServerSocket(8847);
             Socket s = ss.accept();

             System.out.println("Client Connect Ho Gaya!");
             DataInputStream dis = new DataInputStream(s.getInputStream());
             String message = (String) dis.readUTF();
             System.out.println("Client ne Kaha: "+message);
            ss.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
