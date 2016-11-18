package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class mls {
    static final mew f27894a = miv.f27802a.m31966c("=");

    static <K> met<Entry<K, ?>, K> m32482a() {
        return mlv.KEY;
    }

    static <V> met<Entry<?, V>, V> m32486b() {
        return mlv.VALUE;
    }

    public static <K, V> HashMap<K, V> m32489c() {
        return new HashMap();
    }

    public static <K, V> HashMap<K, V> m32478a(int i) {
        return new HashMap(mls.m32483b(i));
    }

    public static int m32483b(int i) {
        if (i < 3) {
            gwb.m2121d(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static <K, V> LinkedHashMap<K, V> m32490c(int i) {
        return new LinkedHashMap(mls.m32483b(i));
    }

    public static <K, V> Entry<K, V> m32480a(K k, V v) {
        return new mjn(k, v);
    }

    static <K, V> Entry<K, V> m32481a(Entry<? extends K, ? extends V> entry) {
        bm.m6122a((Object) entry);
        return new mlt(entry);
    }

    static <K, V> mny<Entry<K, V>> m32491c(Iterator<Entry<K, V>> it) {
        return new mlu(it);
    }

    static <V> V m32476a(Map<?, V> map, Object obj) {
        V v = null;
        bm.m6122a((Object) map);
        try {
            v = map.get(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return v;
    }

    static boolean m32487b(Map<?, ?> map, Object obj) {
        boolean z = false;
        bm.m6122a((Object) map);
        try {
            z = map.containsKey(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return z;
    }

    static <V> V m32488c(Map<?, V> map, Object obj) {
        V v = null;
        bm.m6122a((Object) map);
        try {
            v = map.remove(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return v;
    }

    static boolean m32492d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    static String m32477a(Map<?, ?> map) {
        StringBuilder append = miv.m32228a(map.size()).append('{');
        f27894a.m31972a(append, (Map) map);
        return append.append('}').toString();
    }

    static <K> K m32484b(Entry<K, ?> entry) {
        return entry == null ? null : entry.getKey();
    }

    static <K, V> Iterator<K> m32479a(Iterator<Entry<K, V>> it) {
        return mlj.m32457a((Iterator) it, mlv.KEY);
    }

    static <K, V> Iterator<V> m32485b(Iterator<Entry<K, V>> it) {
        return mlj.m32457a((Iterator) it, mlv.VALUE);
    }
}
