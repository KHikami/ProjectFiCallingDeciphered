package p000;

import java.lang.reflect.Array;

public final class hcl<M extends hck<M>, T> {
    public final int f16608a;
    public final Class<T> f16609b;
    public final int f16610c;
    public final boolean f16611d;

    private int m19316b(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += m19318c(Array.get(obj, i2));
            }
        }
        return i;
    }

    private void m19317b(Object obj, hcj hcj) {
        try {
            hcj.m19314c(this.f16610c);
            switch (this.f16608a) {
                case 10:
                    int i = this.f16610c >>> 3;
                    hcj.m19309a((hcq) obj);
                    hcj.m19315d(i, 4);
                    return;
                case 11:
                    hcj.m19312b((hcq) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f16608a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    private int m19318c(Object obj) {
        int i = this.f16610c >>> 3;
        switch (this.f16608a) {
            case 10:
                return (hcj.m19279b(i) << 1) + ((hcq) obj).m19209f();
            case 11:
                return hcj.m19280b(i, (hcq) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.f16608a);
        }
    }

    private void m19319c(Object obj, hcj hcj) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                m19317b(obj2, hcj);
            }
        }
    }

    int m19320a(Object obj) {
        return this.f16611d ? m19316b(obj) : m19318c(obj);
    }

    void m19321a(Object obj, hcj hcj) {
        if (this.f16611d) {
            m19319c(obj, hcj);
        } else {
            m19317b(obj, hcj);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcl)) {
            return false;
        }
        hcl hcl = (hcl) obj;
        return this.f16608a == hcl.f16608a && this.f16609b == hcl.f16609b && this.f16610c == hcl.f16610c && this.f16611d == hcl.f16611d;
    }

    public int hashCode() {
        return (this.f16611d ? 1 : 0) + ((((((this.f16608a + 1147) * 31) + this.f16609b.hashCode()) * 31) + this.f16610c) * 31);
    }
}
