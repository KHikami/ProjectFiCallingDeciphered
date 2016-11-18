package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

final class jpy {
    private final Map<String, List<String>> f20757a;

    public jpy(Map<String, List<String>> map) {
        this.f20757a = Collections.unmodifiableMap(jpy.m24977a((Map) map));
    }

    public List<String> m24979a(String str) {
        return (List) this.f20757a.get(jpy.m24978b(str));
    }

    private static Map<String, List<String>> m24977a(Map<String, List<String>> map) {
        Map<String, List<String>> hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(jpy.m24978b(str), (List) map.get(str));
        }
        return hashMap;
    }

    private static String m24978b(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }
}
