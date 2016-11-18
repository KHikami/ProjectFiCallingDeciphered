package defpackage;

import java.util.Map;

public final class dzg {
    private static final Map<String, dzh> a = new ky();

    public static dzh a(String str) {
        dzh dzh;
        synchronized (a) {
            dzh = (dzh) a.get(str);
            if (dzh == null) {
                dzh = new dzh(str);
                a.put(str, dzh);
            }
        }
        return dzh;
    }
}
