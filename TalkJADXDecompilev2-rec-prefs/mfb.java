package p000;

import java.io.Serializable;

public final class mfb<A, B> implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final A f27604a;
    public final B f27605b;

    public static <A, B> mfb<A, B> m31979a(A a, B b) {
        return new mfb(a, b);
    }

    private mfb(A a, B b) {
        this.f27604a = a;
        this.f27605b = b;
    }

    private A m31978a() {
        return this.f27604a;
    }

    private B m31980b() {
        return this.f27605b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mfb)) {
            return false;
        }
        mfb mfb = (mfb) obj;
        if (mez.m31976b(m31978a(), mfb.m31978a()) && mez.m31976b(m31980b(), mfb.m31980b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f27604a == null ? 0 : this.f27604a.hashCode();
        if (this.f27605b != null) {
            i = this.f27605b.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        String valueOf = String.valueOf(m31978a());
        String valueOf2 = String.valueOf(m31980b());
        return new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()).append("(").append(valueOf).append(", ").append(valueOf2).append(")").toString();
    }
}
