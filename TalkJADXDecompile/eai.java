public enum eai {
    UNKNOWN(true),
    DISCONNECTED(false),
    CAPTIVE_PORTAL(false),
    CONNECTED(true);
    
    private final boolean e;

    private eai(boolean z) {
        this.e = z;
    }

    public boolean a() {
        return this.e;
    }
}
