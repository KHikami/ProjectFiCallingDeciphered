import java.math.RoundingMode;

final /* synthetic */ class mrv {
    static final /* synthetic */ int[] a;

    static {
        a = new int[RoundingMode.values().length];
        try {
            a[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[RoundingMode.FLOOR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[RoundingMode.UP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[RoundingMode.CEILING.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[RoundingMode.HALF_DOWN.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            a[RoundingMode.HALF_EVEN.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
    }
}
