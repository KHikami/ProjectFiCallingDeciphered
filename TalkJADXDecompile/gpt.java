public final /* synthetic */ class gpt {
    public static final /* synthetic */ int[] a;

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
            a[fwx.UPLOADING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[fwx.AWAIT_READY.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[fwx.ON_SERVER.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[fwx.FAILED_TO_SEND.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
    }
}
