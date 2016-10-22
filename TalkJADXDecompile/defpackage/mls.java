package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: mls */
public final class mls {
    static final mew a;

    static <K> met<Entry<K, ?>, K> a() {
        return mlv.KEY;
    }

    static <V> met<Entry<?, V>, V> b() {
        return mlv.VALUE;
    }

    public static <K, V> HashMap<K, V> c() {
        return new HashMap();
    }

    public static <K, V> HashMap<K, V> a(int i) {
        return new HashMap(mls.b(i));
    }

    public static int b(int i) {
        if (i < 3) {
            gwb.d(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static <K, V> LinkedHashMap<K, V> c(int i) {
        return new LinkedHashMap(mls.b(i));
    }

    public static <K, V> Entry<K, V> a(K k, V v) {
        return new mjn(k, v);
    }

    static <K, V> Entry<K, V> a(Entry<? extends K, ? extends V> entry) {
        bm.a((Object) entry);
        return new mlt(entry);
    }

    static <K, V> mny<Entry<K, V>> c(Iterator<Entry<K, V>> it) {
        return new mlu(it);
    }

    static <V> V a(Map<?, V> map, Object obj) {
        V v = null;
        bm.a((Object) map);
        try {
            v = map.get(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return v;
    }

    static boolean b(Map<?, ?> map, Object obj) {
        boolean z = false;
        bm.a((Object) map);
        try {
            z = map.containsKey(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return z;
    }

    static <V> V c(Map<?, V> map, Object obj) {
        V v = null;
        bm.a((Object) map);
        try {
            v = map.remove(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return v;
    }

    static boolean d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    static {
        a = miv.a.c("=");
    }

    static String a(Map<?, ?> map) {
        StringBuilder append = miv.a(map.size()).append('{');
        a.a(append, (Map) map);
        return append.append('}').toString();
    }

    static <K> K b(Entry<K, ?> entry) {
        return entry == null ? null : entry.getKey();
    }

    static <K, V> Iterator<K> a(Iterator<Entry<K, V>> it) {
        return mlj.a((Iterator) it, mlv.KEY);
    }

    static <K, V> Iterator<V> b(Iterator<Entry<K, V>> it) {
        return mlj.a((Iterator) it, mlv.VALUE);
    }
}
