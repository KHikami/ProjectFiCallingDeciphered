public final class ioo extends inw {
    private final iok h;

    public ioo(iok iok) {
        super("Invalid");
        this.h = iok;
    }

    protected String a() {
        return this.h == null ? "NoSource" : this.h.f();
    }

    public boolean d() {
        itp r = this.h.r();
        if (this.h.g() == 0 || r.b() == 0 || r.c() == 0) {
            return false;
        }
        a(this.h.i());
        a(this.h.g(), r.b(), r.c(), this.h.h());
        a(r.g());
        b(r.f());
        if (this.h.o() == -1) {
            a(r.b(), r.c(), false);
        } else {
            a(this.h.o(), this.h.p(), this.h.q());
        }
        return super.d();
    }
}
