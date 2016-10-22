package defpackage;

/* renamed from: bld */
final /* synthetic */ class bld {
    static final /* synthetic */ int[] a;

    static {
        a = new int[bjy.values().length];
        try {
            a[bjy.CARRIER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[bjy.GV.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[bjy.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
