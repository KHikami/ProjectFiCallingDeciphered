package defpackage;

final /* synthetic */ class mpm {
    static final /* synthetic */ int[] a = new int[mop.values().length];

    static {
        try {
            a[mop.INLINE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[mop.REWRITE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[mop.THROW.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
