final class dlw implements dhx {
    final /* synthetic */ boolean a;
    final /* synthetic */ dhw b;
    final /* synthetic */ dlu c;

    dlw(dlu dlu, boolean z, dhw dhw) {
        this.c = dlu;
        this.a = z;
        this.b = dhw;
    }

    public void a(itl itl) {
        boolean z = !itl.l() && this.a;
        if (this.b.a() != z) {
            this.b.a(z);
        }
    }

    public void a(did did) {
        boolean z = true;
        if (this.c.a.r() != null) {
            z = false;
        }
        if (this.b.a() != z) {
            this.b.a(z);
        }
    }
}
