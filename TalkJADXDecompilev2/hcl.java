package defpackage;

import java.lang.reflect.Array;

public final class hcl<M extends hck<M>, T> {
    public final int a;
    public final Class<T> b;
    public final int c;
    public final boolean d;

    private int b(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += c(Array.get(obj, i2));
            }
        }
        return i;
    }

    private void b(Object obj, hcj hcj) {
        try {
            hcj.c(this.c);
            switch (this.a) {
                case 10:
                    int i = this.c >>> 3;
                    hcj.a((hcq) obj);
                    hcj.d(i, 4);
                    return;
                case 11:
                    hcj.b((hcq) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    private int c(Object obj) {
        int i = this.c >>> 3;
        switch (this.a) {
            case 10:
                return (hcj.b(i) << 1) + ((hcq) obj).f();
            case 11:
                return hcj.b(i, (hcq) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.a);
        }
    }

    private void c(Object obj, hcj hcj) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                b(obj2, hcj);
            }
        }
    }

    int a(Object obj) {
        return this.d ? b(obj) : c(obj);
    }

    void a(Object obj, hcj hcj) {
        if (this.d) {
            c(obj, hcj);
        } else {
            b(obj, hcj);
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
        return this.a == hcl.a && this.b == hcl.b && this.c == hcl.c && this.d == hcl.d;
    }

    public int hashCode() {
        return (this.d ? 1 : 0) + ((((((this.a + 1147) * 31) + this.b.hashCode()) * 31) + this.c) * 31);
    }
}
