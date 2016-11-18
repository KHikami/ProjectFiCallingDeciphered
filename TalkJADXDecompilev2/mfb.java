package defpackage;

import java.io.Serializable;

public final class mfb<A, B> implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final A a;
    public final B b;

    public static <A, B> mfb<A, B> a(A a, B b) {
        return new mfb(a, b);
    }

    private mfb(A a, B b) {
        this.a = a;
        this.b = b;
    }

    private A a() {
        return this.a;
    }

    private B b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mfb)) {
            return false;
        }
        mfb mfb = (mfb) obj;
        if (mez.b(a(), mfb.a()) && mez.b(b(), mfb.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.a == null ? 0 : this.a.hashCode();
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        String valueOf = String.valueOf(a());
        String valueOf2 = String.valueOf(b());
        return new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()).append("(").append(valueOf).append(", ").append(valueOf2).append(")").toString();
    }
}
