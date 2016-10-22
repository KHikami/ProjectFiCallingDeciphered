package defpackage;

/* renamed from: eji */
public final /* synthetic */ class eji {
    public static final /* synthetic */ int[] a;

    static {
        a = new int[jcb.values().length];
        try {
            a[jcb.VALID.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[jcb.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[jcb.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
