package p000;

import java.io.Serializable;
import java.util.Comparator;

final class miw<T> extends mms<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> f27803a;

    miw(Comparator<T> comparator) {
        this.f27803a = (Comparator) bm.m6122a((Object) comparator);
    }

    public int compare(T t, T t2) {
        return this.f27803a.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof miw)) {
            return false;
        }
        return this.f27803a.equals(((miw) obj).f27803a);
    }

    public int hashCode() {
        return this.f27803a.hashCode();
    }

    public String toString() {
        return this.f27803a.toString();
    }
}
