public class MCserver extends Server {
    private String version;

    public MCserver() {
        super();
        version = "";
    }

    public MCserver(boolean isOnlineU, String ipU) {
        super(isOnlineU, ipU);
        version = "";
    }

    public MCserver(boolean isOnlineU, int pingU, int playersU, String versionU, String ipU) {
        super(isOnlineU,pingU,playersU, ipU);
        version = versionU;
    }
}
