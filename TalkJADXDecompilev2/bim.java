package defpackage;

public final /* synthetic */ class bim {
    public static final /* synthetic */ int[] a = new int[bhy.values().length];
    public static final /* synthetic */ int[] b = new int[bhp.values().length];

    static {
        try {
            b[bhp.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            b[bhp.HIGH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            b[bhp.NETWORK.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[bhy.START.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[bhy.PROCESS_DELAYED.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
        }
    }
}
