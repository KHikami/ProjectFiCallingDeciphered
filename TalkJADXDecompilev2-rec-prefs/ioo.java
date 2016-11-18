package p000;

public final class ioo extends inw {
    private final iok f18591h;

    public ioo(iok iok) {
        super("Invalid");
        this.f18591h = iok;
    }

    protected String mo3344a() {
        return this.f18591h == null ? "NoSource" : this.f18591h.mo3277f();
    }

    public boolean mo3345d() {
        itp r = this.f18591h.m22366r();
        if (this.f18591h.mo3278g() == 0 || r.m23263b() == 0 || r.m23265c() == 0) {
            return false;
        }
        m22403a(this.f18591h.mo3280i());
        m22400a(this.f18591h.mo3278g(), r.m23263b(), r.m23265c(), this.f18591h.mo3279h());
        m22402a(r.m23269g());
        m22405b(r.m23268f());
        if (this.f18591h.m22363o() == -1) {
            m22401a(r.m23263b(), r.m23265c(), false);
        } else {
            m22401a(this.f18591h.m22363o(), this.f18591h.m22364p(), this.f18591h.m22365q());
        }
        return super.mo3345d();
    }
}
