/* compiled from: PG */
public final class dj {
    final dk a;

    dj(dk dkVar) {
        this.a = dkVar;
    }

    final db a(String str) {
        return this.a.d.b(str);
    }

    public final void a() {
        this.a.d.j = false;
    }

    public final boolean b() {
        return this.a.d.f();
    }

    public final void a(boolean z) {
        dk dkVar = this.a;
        dkVar.f = z;
        if (dkVar.g != null && dkVar.i) {
            dkVar.i = false;
            if (z) {
                dkVar.g.d();
            } else {
                dkVar.g.c();
            }
        }
    }
}
