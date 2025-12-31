import java.net.*;
import java.io.*;

public class ChatClient {
    public static void main(String args[]){
        try {


        // 1. Server se connect karein
        Socket s = new Socket("localhost", 8847);
        System.out.println("Server se connect ho gaye! Pehla message type karein:");

        // 2. Streams banayein
        DataInputStream din = new DataInputStream(s.getInputStream()); // Server ki baat sunne ke liye
        DataOutputStream dout = new DataOutputStream(s.getOutputStream()); // Server ko bolne ke liye

        // Keyboard se type karne ke liye
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strClient = "", strServer = "";

        // 3. Chat Loop
        while (!strClient.equals("stop")) {
            // Pehle Client (Aap) message type karega
            System.out.print("Aap (Client): ");
            strClient = br.readLine();
            dout.writeUTF(strClient);
            dout.flush();

            // Ab Server ka reply wait karein
            strServer = din.readUTF();
            System.out.println("Server ne kaha: " + strServer);
        }

        // 4. Close connections
        dout.close();
        s.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
