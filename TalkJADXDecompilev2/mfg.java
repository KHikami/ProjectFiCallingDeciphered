package defpackage;

import java.io.Serializable;
import java.util.Collection;

final class mfg<T> implements Serializable, mfe<T> {
    private static final long serialVersionUID = 0;
    private final Collection<?> a;

    mfg(Collection<?> collection) {
        this.a = (Collection) bm.a((Object) collection);
    }

    public boolean a(T t) {
        boolean z = false;
        try {
            z = this.a.contains(t);
        } catch (NullPointerException e) {
        } catch (ClassCastException e2) {
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mfg)) {
            return false;
        }
        return this.a.equals(((mfg) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 15).append("Predicates.in(").append(valueOf).append(")").toString();
    }
}
