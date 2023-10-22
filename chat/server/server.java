import Java.io.*;
import java.net.*;
import java.util.*;

public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server started");
            ServerSocket s = new ServerSocket(9806);
            Socket soc = s.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            System.out.println("Client said: " + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//command to install jdk on windows powershell
// choco install jdk8
// with admin rigths
// choco install jdk8 -y