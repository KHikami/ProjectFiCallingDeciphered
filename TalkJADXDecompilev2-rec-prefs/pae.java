package p000;

public enum pae implements nww {
    CONNECTIVITY_UNKNOWN(0),
    OFFLINE(1),
    WIFI(2),
    CELL(3);
    
    private static final nwx<pae> f34781e = null;
    private final int f34783f;

    static {
        f34781e = new paf();
    }

    public final int mo4132a() {
        return this.f34783f;
    }

    public static pae m40095a(int i) {
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
        this.f34783f = i;
    }
}
