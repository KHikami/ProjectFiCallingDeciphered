import java.util.concurrent.TimeUnit;

final /* synthetic */ class mfu {
    static final /* synthetic */ int[] a;

    static {
        a = new int[TimeUnit.values().length];
        try {
            a[TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[TimeUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[TimeUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[TimeUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            a[TimeUnit.DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
    }
}
