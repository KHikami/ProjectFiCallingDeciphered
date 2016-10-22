package defpackage;

/* renamed from: dhr */
public final /* synthetic */ class dhr {
    static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        b = new int[isr.values().length];
        try {
            b[isr.BLUETOOTH_TURNING_OFF.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            b[isr.BLUETOOTH_TURNING_ON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            b[isr.BLUETOOTH_ON.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            b[isr.SPEAKERPHONE_ON.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            b[isr.EARPIECE_ON.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            b[isr.WIRED_HEADSET_ON.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        a = new int[itn.values().length];
        try {
            a[itn.INSUFFICIENT_BANDWIDTH_FOR_VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
        }
        try {
            a[itn.SUFFICIENT_BANDWIDTH_FOR_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
        }
    }
}
