package p000;

import java.io.Serializable;
import java.util.Collection;

final class mfg<T> implements Serializable, mfe<T> {
    private static final long serialVersionUID = 0;
    private final Collection<?> f27609a;

    mfg(Collection<?> collection) {
        this.f27609a = (Collection) bm.m6122a((Object) collection);
    }

    public boolean mo3735a(T t) {
        boolean z = false;
        try {
            z = this.f27609a.contains(t);
        } catch (NullPointerException e) {
        } catch (ClassCastException e2) {
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mfg)) {
            return false;
        }
        return this.f27609a.equals(((mfg) obj).f27609a);
    }

    public int hashCode() {
        return this.f27609a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27609a);
        return new StringBuilder(String.valueOf(valueOf).length() + 15).append("Predicates.in(").append(valueOf).append(")").toString();
    }
}
