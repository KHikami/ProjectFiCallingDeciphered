package defpackage;

/* renamed from: gnr */
final class gnr implements bnq {
    final /* synthetic */ gno a;

    gnr(gno gno) {
        this.a = gno;
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (this.a.d == bnn) {
            this.a.d = null;
            if (!z) {
                return;
            }
            if (gjo != null) {
                this.a.b(new gol(gjo));
                return;
            }
            iil.b("Expected non-null", (Object) gkt);
            iil.b("Expected non-null", gkt.e());
            iil.a("Expected null", this.a.e);
            this.a.e = gkt;
            this.a.a(this.a.e.e());
            this.a.d(0);
        } else if (gkt != null) {
            gkt.b();
        }
    }
}
