package defpackage;

/* renamed from: dst */
final /* synthetic */ class dst {
    static final /* synthetic */ int[] a;

    static {
        a = new int[dsk.values().length];
        try {
            a[dsk.STICKER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[dsk.VIDEO_CALL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[dsk.AUDIO_CALL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[dsk.INVITE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[dsk.PEOPLE_LIST.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[dsk.EDIT_PARTICIPANTS.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
    }
}
