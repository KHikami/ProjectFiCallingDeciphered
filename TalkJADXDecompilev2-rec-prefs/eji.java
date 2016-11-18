package p000;

public final /* synthetic */ class eji {
    public static final /* synthetic */ int[] f11643a = new int[jcb.values().length];

    static {
        try {
            f11643a[jcb.VALID.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f11643a[jcb.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f11643a[jcb.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
