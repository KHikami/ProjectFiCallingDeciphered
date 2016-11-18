package defpackage;

public enum pae implements nww {
    CONNECTIVITY_UNKNOWN(0),
    OFFLINE(1),
    WIFI(2),
    CELL(3);
    
    private static final nwx<pae> e = null;
    private final int f;

    static {
        e = new paf();
    }

    public final int a() {
        return this.f;
    }

    public static pae a(int i) {
        switch (i) {
            case 0:
                return CONNECTIVITY_UNKNOWN;
            case 1:
                return OFFLINE;
            case 2:
                return WIFI;
            case 3:
                return CELL;
            default:
                return null;
        }
    }

    private pae(int i) {
        this.f = i;
    }
}
