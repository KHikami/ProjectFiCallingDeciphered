package defpackage;

import java.io.Serializable;
import java.util.Arrays;

public final class mfv<T> implements iyr, Serializable {
    private static final long serialVersionUID = 0;
    final T a;

    public mfv(T t) {
        this.a = t;
    }

    public T a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mfv)) {
            return false;
        }
        return mez.b(this.a, ((mfv) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 22).append("Suppliers.ofInstance(").append(valueOf).append(")").toString();
    }
}
