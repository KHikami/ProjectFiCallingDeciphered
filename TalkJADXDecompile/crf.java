final /* synthetic */ class crf {
    static final /* synthetic */ int[] a;

    static {
        a = new int[isr.values().length];
        try {
            a[isr.SPEAKERPHONE_ON.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[isr.EARPIECE_ON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[isr.BLUETOOTH_ON.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[isr.BLUETOOTH_TURNING_OFF.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[isr.BLUETOOTH_TURNING_ON.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[isr.WIRED_HEADSET_ON.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
    }
}
