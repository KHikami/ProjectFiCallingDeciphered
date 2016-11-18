package p000;

public enum pas implements nww {
    NEW_DATA(0),
    NO_DATA(1),
    FAILED(2);
    
    private static final nwx<pas> f34845d = null;
    private final int f34847e;

    static {
        f34845d = new pat();
    }

    public final int mo4132a() {
        return this.f34847e;
    }

    public static pas m40133a(int i) {
        switch (i) {
            case 0:
                return NEW_DATA;
            case 1:
                return NO_DATA;
            case 2:
                return FAILED;
            default:
                return null;
        }
    }

    private pas(int i) {
        this.f34847e = i;
    }
}
