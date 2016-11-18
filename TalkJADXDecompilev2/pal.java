package defpackage;

public enum pal implements nww {
    RESTRICTED(0),
    DENIED(1),
    AVAILABLE(2);
    
    private static final nwx<pal> d = null;
    private final int e;

    static {
        d = new pam();
    }

    public final int a() {
        return this.e;
    }

    public static pal a(int i) {
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
        this.e = i;
    }
}
