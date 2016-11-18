package defpackage;

public enum pas implements nww {
    NEW_DATA(0),
    NO_DATA(1),
    FAILED(2);
    
    private static final nwx<pas> d = null;
    private final int e;

    static {
        d = new pat();
    }

    public final int a() {
        return this.e;
    }

    public static pas a(int i) {
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
        this.e = i;
    }
}
