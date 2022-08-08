import net.pterodactylus.fcp.ClientHello;
import net.pterodactylus.fcp.FcpConnection;

import java.io.IOException;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        FcpConnection connection = new FcpConnection("127.0.0.1");
        connection.connect();
        FCPListenerImpl im = new FCPListenerImpl();
        connection.addFcpListener(im);
        ClientHello ch = new ClientHello("PowerDonags");
        connection.sendMessage(ch);
        Thread.sleep(2000);
        connection.close();
    }
}
