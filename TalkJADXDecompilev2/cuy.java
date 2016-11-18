package defpackage;

final /* synthetic */ class cuy {
    static final /* synthetic */ int[] a = new int[isq.values().length];
    static final /* synthetic */ int[] b = new int[isr.values().length];

    static {
        try {
            b[isr.EARPIECE_ON.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            b[isr.SPEAKERPHONE_ON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[isq.BLUETOOTH_HEADSET.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[isq.SPEAKERPHONE.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[isq.WIRED_HEADSET.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[isq.EARPIECE.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
        }
    }
}
