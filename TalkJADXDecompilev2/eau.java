package defpackage;

final /* synthetic */ class eau {
    static final /* synthetic */ int[] a = new int[fwx.values().length];

    static {
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
