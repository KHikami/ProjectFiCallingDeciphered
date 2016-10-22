import java.util.Locale;
import java.util.logging.Logger;

public final class mfd {
    private static final Logger a;
    private static final mfc b;

    static {
        a = Logger.getLogger(mfd.class.getName());
        b = new mfc();
    }

    private mfd() {
    }

    static long a() {
        return System.nanoTime();
    }

    static String a(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }
}
