import java.net.DatagramSocket;

public class MCserver extends Server {
    private String version;
    private boolean isOnline;
    private int ping;

    public MCserver() {
        super();
        version = "";
    }

    public MCserver(String ipU) {
        super(ipU);
        version = "";
    }

    public MCserver(int pingU, int playersU, String versionU, String ipU) {
        super(pingU,playersU, ipU);
        version = versionU;
    }

//Not Fully Implemented
/*
    private static int packetPing(String ip) {
        int port = 25564;
        private DatagramSocket socket = null;
        while(socket == null) {
			socket = new DatagramSocket(port);
			++port;
		}
		InetAddress address = InetAddress.getByName(ip);
		DatagramPacket packet1 = new DatagramPacket(input, input.length, address, queryPort);
		socket.send(packet1);
    }
*/
}
