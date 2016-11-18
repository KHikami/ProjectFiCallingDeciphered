package defpackage;

import java.util.Map.Entry;

abstract class mkg<K, V> extends mks<Entry<K, V>> {
    abstract mjx<K, V> b();

    mkg() {
    }

    public int size() {
        return b().size();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object obj2 = b().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    boolean e() {
        return b().d();
    }

    boolean V_() {
        return b().i();
    }

    public int hashCode() {
        return b().hashCode();
    }

    Object writeReplace() {
        return new mkh(b());
    }
}
