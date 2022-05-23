public class MCserver extends Server {
    private String version;

    public MCserver() {
        super();
        version = "";
    }

    public MCserver(boolean isOnlineU) {
        super(isOnlineU);
        version = "";
    }

    public MCserver(boolean isOnlineU, int pingU, int playersU, String versionU) {
        super(isOnlineU,pingU,playersU);
        version = versionU;
    }
}
