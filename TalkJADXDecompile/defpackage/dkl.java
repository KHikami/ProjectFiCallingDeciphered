package defpackage;

/* renamed from: dkl */
final class dkl extends isi {
    final /* synthetic */ dkf a;

    dkl(dkf dkf) {
        this.a = dkf;
    }

    public void a(isy isy) {
        isy.a(this.a);
    }

    public void a(boolean z) {
        glk.a("Babel_calls", "onFocused for %s", this.a.m());
        this.a.k = true;
        this.a.l = z;
        this.a.e.h();
        this.a.f.a(this.a.a);
        this.a.j();
    }

    public void a() {
        glk.a("Babel_calls", "onUnfocused for %s", this.a.m());
        this.a.k = false;
        this.a.l = false;
        this.a.j();
    }
}
