package defpackage;

import java.util.Comparator;

final class moz implements Comparator<Object> {
    moz() {
    }

    public int compare(Object obj, Object obj2) {
        Enum a = mpa.a(obj);
        Enum a2 = mpa.a(obj2);
        return a == a2 ? a.a(obj, obj2) : a.compareTo(a2);
    }
}
