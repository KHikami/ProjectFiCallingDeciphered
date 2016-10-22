public final class hdx<O extends gua> {
    private final gtz<O> a;
    private final O b;

    public gue<?> a() {
        return this.a.c();
    }

    public String b() {
        return this.a.d();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hdx)) {
            return false;
        }
        hdx hdx = (hdx) obj;
        return gwb.e(this.a, hdx.a) && gwb.e(this.b, hdx.b);
    }

    public int hashCode() {
        return gwb.a(this.a, this.b);
    }
}
