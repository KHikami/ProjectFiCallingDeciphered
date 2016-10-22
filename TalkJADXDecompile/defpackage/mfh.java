package defpackage;

import java.io.Serializable;

/* renamed from: mfh */
final class mfh<T> implements Serializable, mfe<T> {
    private static final long serialVersionUID = 0;
    private final T a;

    mfh(T t) {
        this.a = t;
    }

    public boolean a(T t) {
        return this.a.equals(t);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mfh)) {
            return false;
        }
        return this.a.equals(((mfh) obj).a);
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append("Predicates.equalTo(").append(valueOf).append(")").toString();
    }
}
