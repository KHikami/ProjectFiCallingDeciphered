package defpackage;

/* renamed from: eau */
final /* synthetic */ class eau {
    static final /* synthetic */ int[] a;

    static {
        a = new int[fwx.values().length];
        try {
            a[fwx.QUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[fwx.SENDING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[fwx.FAILED_TO_SEND.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
