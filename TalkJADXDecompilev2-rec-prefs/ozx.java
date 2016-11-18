package p000;

public enum ozx implements nww {
    CHANGE_UNKNOWN(0),
    ENABLE(1),
    DISABLE(2);
    
    private static final nwx<ozx> f34735d = null;
    private final int f34737e;

    static {
        f34735d = new ozy();
    }

    public final int mo4132a() {
        return this.f34737e;
    }

    public static ozx m40075a(int i) {
        switch (i) {
            case 0:
                return CHANGE_UNKNOWN;
            case 1:
                return ENABLE;
            case 2:
                return DISABLE;
            default:
                return null;
        }
    }

    private ozx(int i) {
        this.f34737e = i;
    }
}
