package defpackage;

public enum ogy implements nww {
    SPAN_UNKNOWN(0),
    SPAN_LOCAL(1),
    SPAN_CLIENT_HALF(2),
    SPAN_SERVER_HALF(3);
    
    private static final nwx<ogy> e = null;
    private final int f;

    static {
        e = new ogz();
    }

    public final int a() {
        return this.f;
    }

    public static ogy a(int i) {
        switch (i) {
            case 0:
                return SPAN_UNKNOWN;
            case 1:
                return SPAN_LOCAL;
            case 2:
                return SPAN_CLIENT_HALF;
            case 3:
                return SPAN_SERVER_HALF;
            default:
                return null;
        }
    }

    private ogy(int i) {
        this.f = i;
    }
}
