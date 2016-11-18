package p000;

public enum pal implements nww {
    RESTRICTED(0),
    DENIED(1),
    AVAILABLE(2);
    
    private static final nwx<pal> f34819d = null;
    private final int f34821e;

    static {
        f34819d = new pam();
    }

    public final int mo4132a() {
        return this.f34821e;
    }

    public static pal m40118a(int i) {
        switch (i) {
            case 0:
                return RESTRICTED;
            case 1:
                return DENIED;
            case 2:
                return AVAILABLE;
            default:
                return null;
        }
    }

    private pal(int i) {
        this.f34821e = i;
    }
}
