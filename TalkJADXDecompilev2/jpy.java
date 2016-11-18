package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

final class jpy {
    private final Map<String, List<String>> a;

    public jpy(Map<String, List<String>> map) {
        this.a = Collections.unmodifiableMap(jpy.a((Map) map));
    }

    public List<String> a(String str) {
        return (List) this.a.get(jpy.b(str));
    }

    private static Map<String, List<String>> a(Map<String, List<String>> map) {
        Map<String, List<String>> hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(jpy.b(str), (List) map.get(str));
        }
        return hashMap;
    }

    private static String b(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }
}
