package p000;

import java.util.Map.Entry;

abstract class mkg<K, V> extends mks<Entry<K, V>> {
    abstract mjx<K, V> mo3864b();

    mkg() {
    }

    public int size() {
        return mo3864b().size();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object obj2 = mo3864b().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    boolean mo3822e() {
        return mo3864b().mo3850d();
    }

    boolean V_() {
        return mo3864b().mo3891i();
    }

    public int hashCode() {
        return mo3864b().hashCode();
    }

    Object writeReplace() {
        return new mkh(mo3864b());
    }
}
