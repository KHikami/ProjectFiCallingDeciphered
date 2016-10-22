package defpackage;

/* renamed from: cev */
final class cev implements dkp {
    final /* synthetic */ cdr a;

    cev(cdr cdr) {
        this.a = cdr;
    }

    public void a(boolean z, boolean z2) {
        if (!z2) {
            boolean z3;
            cdr cdr = this.a;
            if (z) {
                z3 = false;
            } else {
                z3 = true;
            }
            cdr.b(z3);
            if (z) {
                giw.a(this.a.getView());
            } else {
                giw.a(this.a.getView(), false);
            }
        }
        gmx gmx = gmx.a;
        if (gmx != null) {
            gmx.a(z);
        }
    }
}
