import java.io.*;
import java.net.*;

public class ProcessA extends ProcessHW {
    private ServerSocket serverServer;

    public ProcessA() {
        try {
            token = 1;
            id = "A";
            NUM_LIGHTWEIGHTS = 3;
            answersLW = 0;
            socketSC = new Socket[NUM_LIGHTWEIGHTS];
            serverServer = new ServerSocket(8080);
            serverClient = new ServerSocket(3030);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    protected void makeConnections() {
        try {
            socketSS = serverServer.accept();
            for (int i = 0; i < NUM_LIGHTWEIGHTS; i++) {
                socketSC[i] = serverClient.accept();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
