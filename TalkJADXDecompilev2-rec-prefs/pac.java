package p000;

public enum pac implements nww {
    ASSET_UNKNOWN(0),
    PHOTO(1),
    VIDEO(2);
    
    private static final nwx<pac> f34774d = null;
    private final int f34776e;

    static {
        f34774d = new pad();
    }

    public final int mo4132a() {
        return this.f34776e;
    }

    public static pac m40092a(int i) {
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
        this.f34776e = i;
    }
}
