package defpackage;

final class dkw extends dkj {
    final /* synthetic */ dkv b;

    dkw(dkv dkv) {
        this.b = dkv;
        super(dkv);
    }

    public void b(String str) {
        if (gwb.m(this.b.a.a(), str)) {
            dkv dkv = this.b;
            iil.a("Expected condition to be true", dkv.a.j());
            dkv.j();
            dkv.f.a(dkv.a.a());
            dkv.i.setContentDescription(dkv.a.b());
        }
    }

    public void c(itl itl) {
        if (this.b.a != null && this.b.a.a().equals(itl.a())) {
            this.b.o();
        }
    }
}
