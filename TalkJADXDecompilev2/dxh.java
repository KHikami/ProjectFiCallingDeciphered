package defpackage;

import java.util.Map;

final class dxh {
    long a;
    String b;
    String c;
    Long d;
    Long e;
    String f;
    String g;
    boolean h;
    int i;
    bjh j;
    String k;
    float l;
    final Map<String, dxm> m = new ky();
    final Map<String, dxj> n = new ky();

    dxh() {
    }

    boolean a() {
        for (dxi dxi : this.m.values()) {
            if (dxi.f) {
                return true;
            }
        }
        for (dxi dxi2 : this.n.values()) {
            if (dxi2.f) {
                return true;
            }
        }
        return false;
    }

    private Object[] b() {
        return new Object[]{Boolean.valueOf(this.h), Integer.valueOf(this.i), this.b, this.c, this.d, this.e, this.f, this.g, this.j, this.m, this.n, this.k, Float.valueOf(this.l)};
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof dxh) && gwb.h(b(), ((dxh) obj).b());
    }

    public int hashCode() {
        return gwb.c(b());
    }
}
