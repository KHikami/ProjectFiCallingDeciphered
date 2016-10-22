package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: day */
public final class day {
    private static cyk a;

    public static HashMap a(Map map) {
        return new HashMap(map);
    }

    public static LinkedHashMap a() {
        return new LinkedHashMap();
    }

    public static Entry a(Object obj, Object obj2) {
        return new czs(obj, obj2);
    }

    static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    static {
        a = new cyk(czf.a, "=");
    }

    static String b(Map map) {
        StringBuilder append = czf.a(map.size()).append('{');
        a.a(append, map.entrySet().iterator());
        return append.append('}').toString();
    }
}
