package defpackage;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: daf */
abstract class daf extends dao {
    abstract czy a();

    daf() {
    }

    public int size() {
        return a().size();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object obj2 = a().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    boolean e() {
        return a().g();
    }

    public int hashCode() {
        return a().hashCode();
    }

    Object writeReplace() {
        return new dag(a());
    }
}
