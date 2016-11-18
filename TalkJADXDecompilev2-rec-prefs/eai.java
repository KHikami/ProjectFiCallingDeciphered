package p000;

public enum eai {
    UNKNOWN(true),
    DISCONNECTED(false),
    CAPTIVE_PORTAL(false),
    CONNECTED(true);
    
    private final boolean f11009e;

    private eai(boolean z) {
        this.f11009e = z;
    }

    public boolean m13284a() {
        return this.f11009e;
    }
}
