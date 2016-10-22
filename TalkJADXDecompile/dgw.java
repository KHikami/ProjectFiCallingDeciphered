final /* synthetic */ class dgw {
    static final /* synthetic */ int[] a;

    static {
        a = new int[dgy.values().length];
        try {
            a[dgy.OUTGOING_AUDIO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[dgy.OUTGOING_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[dgy.STILL_JOINING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[dgy.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
