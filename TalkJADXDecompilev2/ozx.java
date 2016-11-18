package defpackage;

public enum ozx implements nww {
    CHANGE_UNKNOWN(0),
    ENABLE(1),
    DISABLE(2);
    
    private static final nwx<ozx> d = null;
    private final int e;

    static {
        d = new ozy();
    }

    public final int a() {
        return this.e;
    }

    public static ozx a(int i) {
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
        this.e = i;
    }
}
