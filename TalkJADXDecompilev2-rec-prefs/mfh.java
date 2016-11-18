package p000;

import java.io.Serializable;

final class mfh<T> implements Serializable, mfe<T> {
    private static final long serialVersionUID = 0;
    private final T f27610a;

    mfh(T t) {
        this.f27610a = t;
    }

    public boolean mo3735a(T t) {
        return this.f27610a.equals(t);
    }

    public int hashCode() {
        return this.f27610a.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mfh)) {
            return false;
        }
        return this.f27610a.equals(((mfh) obj).f27610a);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27610a);
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append("Predicates.equalTo(").append(valueOf).append(")").toString();
    }
}
