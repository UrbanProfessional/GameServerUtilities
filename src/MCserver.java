public class MCserver extends Server {
    private String version;

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
}
