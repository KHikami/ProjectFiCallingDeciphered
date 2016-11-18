package p000;

public final class hdx<O extends gua> {
    private final gtz<O> f16709a;
    private final O f16710b;

    public gue<?> m19445a() {
        return this.f16709a.m18606c();
    }

    public String m19446b() {
        return this.f16709a.m18607d();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hdx)) {
            return false;
        }
        hdx hdx = (hdx) obj;
        return gwb.m2186e(this.f16709a, hdx.f16709a) && gwb.m2186e(this.f16710b, hdx.f16710b);
    }

    public int hashCode() {
        return gwb.m1517a(this.f16709a, this.f16710b);
    }
}
