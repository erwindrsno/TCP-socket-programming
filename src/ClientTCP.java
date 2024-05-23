import java.io.*;
import java.net.*;


public class ClientTCP {
    public static void main(String[] args){
        String sentence;
        String modifiedSentence;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try{
            Socket clientSocket = new Socket("127.0.0.1", 6789);
            System.out.println("Connected to Server");

            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            System.out.print("Message to Server : ");

            String Sentence = input.readLine();

            outToServer.writeBytes(Sentence + '\n');

            modifiedSentence = inFromServer.readLine();

            System.out.println("Server : " + modifiedSentence);

            clientSocket.close();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
