package p000;

import java.io.Serializable;
import java.util.Arrays;

public final class mfv<T> implements iyr, Serializable {
    private static final long serialVersionUID = 0;
    final T f27631a;

    public mfv(T t) {
        this.f27631a = t;
    }

    public T mo3325a() {
        return this.f27631a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mfv)) {
            return false;
        }
        return mez.m31976b(this.f27631a, ((mfv) obj).f27631a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27631a});
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27631a);
        return new StringBuilder(String.valueOf(valueOf).length() + 22).append("Suppliers.ofInstance(").append(valueOf).append(")").toString();
    }
}
