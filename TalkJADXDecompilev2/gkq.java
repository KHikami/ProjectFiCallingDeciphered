package defpackage;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class gkq<V> extends LinkedHashMap<edo, V> {
    private static final long serialVersionUID = 1;

    public boolean containsKey(Object obj) {
        if (obj == null || !(obj instanceof edo)) {
            return false;
        }
        edo edo = (edo) obj;
        for (edo a : keySet()) {
            if (edo.a(a)) {
                return true;
            }
        }
        return false;
    }

    public V get(Object obj) {
        if (obj == null || !(obj instanceof edo)) {
            return null;
        }
        edo edo = (edo) obj;
        for (Entry entry : entrySet()) {
            if (edo.a((edo) entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public V remove(Object obj) {
        if (obj == null || !(obj instanceof edo)) {
            return null;
        }
        Object obj2;
        edo edo = (edo) obj;
        for (Entry key : entrySet()) {
            obj2 = (edo) key.getKey();
            if (edo.a((edo) obj2)) {
                break;
            }
        }
        obj2 = null;
        return obj2 != null ? super.remove(obj2) : null;
    }
}
