package defpackage;

/* renamed from: fjk */
final /* synthetic */ class fjk {
    static final /* synthetic */ int[] a;

    static {
        a = new int[fjl.values().length];
        try {
            a[fjl.NO_DELAY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[fjl.HASH_SYNC_DELAY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[fjl.MAX_DELAY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
