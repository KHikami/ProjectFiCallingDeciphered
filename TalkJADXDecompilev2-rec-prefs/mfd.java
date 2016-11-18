package p000;

import java.util.Locale;
import java.util.logging.Logger;

public final class mfd {
    private static final Logger f27606a = Logger.getLogger(mfd.class.getName());
    private static final mfc f27607b = new mfc();

    private mfd() {
    }

    static long m31981a() {
        return System.nanoTime();
    }

    static String m31982a(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    public static boolean m31983a(String str) {
        return str == null || str.isEmpty();
    }
}
