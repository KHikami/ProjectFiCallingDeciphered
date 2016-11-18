package defpackage;

public enum pac implements nww {
    ASSET_UNKNOWN(0),
    PHOTO(1),
    VIDEO(2);
    
    private static final nwx<pac> d = null;
    private final int e;

    static {
        d = new pad();
    }

    public final int a() {
        return this.e;
    }

    public static pac a(int i) {
        switch (i) {
            case 0:
                return ASSET_UNKNOWN;
            case 1:
                return PHOTO;
            case 2:
                return VIDEO;
            default:
                return null;
        }
    }

    private pac(int i) {
        this.e = i;
    }
}
