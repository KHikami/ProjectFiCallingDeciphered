final /* synthetic */ class bqc {
    static final /* synthetic */ int[] a;

    static {
        a = new int[bxt.values().length];
        try {
            a[bxt.HANGOUTS_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[bxt.SMS_MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[bxt.AUDIO_CALL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[bxt.VIDEO_CALL.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
