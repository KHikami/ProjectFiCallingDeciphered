package defpackage;

final /* synthetic */ class fvc {
    static final /* synthetic */ int[] a = new int[fvd.values().length];

    static {
        try {
            a[fvd.LOCAL_SMS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[fvd.GV_SMS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[fvd.GV_VOICEMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[fvd.MESSAGE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
