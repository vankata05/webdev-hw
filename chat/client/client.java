import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class EchoClient {
    try {
        System.out.println("Client started");
        Socket soc = new Socket("localhost", 9806);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String str = userInput.readLine();
        PrintStream ps = new PrintStream(soc.getOutputStream());
        ps.println(str);
    }catch(Exception e){
        e.printStackTrace();
    }
}