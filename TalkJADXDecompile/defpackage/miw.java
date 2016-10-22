package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: miw */
final class miw<T> extends mms<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> a;

    miw(Comparator<T> comparator) {
        this.a = (Comparator) bm.a((Object) comparator);
    }

    public int compare(T t, T t2) {
        return this.a.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof miw)) {
            return false;
        }
        return this.a.equals(((miw) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
