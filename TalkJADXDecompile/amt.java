import android.widget.ImageView.ScaleType;

final /* synthetic */ class amt {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        b = new int[amq.values().length];
        try {
            b[amq.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            b[amq.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            b[amq.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            b[amq.IMMEDIATE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        a = new int[ScaleType.values().length];
        try {
            a[ScaleType.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[ScaleType.CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
        try {
            a[ScaleType.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
        }
        try {
            a[ScaleType.FIT_START.ordinal()] = 4;
        } catch (NoSuchFieldError e8) {
        }
        try {
            a[ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError e9) {
        }
    }
}
