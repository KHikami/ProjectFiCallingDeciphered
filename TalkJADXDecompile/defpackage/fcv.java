package defpackage;

/* renamed from: fcv */
final /* synthetic */ class fcv {
    static final /* synthetic */ int[] a;

    static {
        a = new int[bxt.values().length];
        try {
            a[bxt.SMS_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[bxt.AUDIO_CALL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
    }
}
