package defpackage;

/* renamed from: cfy */
final /* synthetic */ class cfy {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        b = new int[bxo.values().length];
        try {
            b[bxo.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            b[bxo.PHOTO.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            b[bxo.STICKER.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            b[bxo.LOCATION.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        a = new int[bxt.values().length];
        try {
            a[bxt.AUDIO_CALL.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[bxt.VIDEO_CALL.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
    }
}
