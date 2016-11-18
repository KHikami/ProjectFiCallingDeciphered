package p000;

import java.util.Map;

public final class dzg {
    private static final Map<String, dzh> f10894a = new ky();

    public static dzh m13144a(String str) {
        dzh dzh;
        synchronized (f10894a) {
            dzh = (dzh) f10894a.get(str);
            if (dzh == null) {
                dzh = new dzh(str);
                f10894a.put(str, dzh);
            }
        }
        return dzh;
    }
}
