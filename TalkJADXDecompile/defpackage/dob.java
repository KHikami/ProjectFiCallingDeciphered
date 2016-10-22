package defpackage;

/* renamed from: dob */
final class dob extends ijj {
    final /* synthetic */ dny a;

    dob(dny dny) {
        this.a = dny;
    }

    public /* bridge */ /* synthetic */ void a(nzf nzf, nzf nzf2) {
        a((lyh) nzf2);
    }

    public void a() {
        this.a.g = (lyh) this.a.f.b().values().iterator().next();
        a(true);
    }

    private void a(lyh lyh) {
        this.a.g = lyh;
        a(false);
    }

    private void a(boolean z) {
        iil.b("Expected non-null", this.a.g);
        dnd dnd = this.a.e;
        if (!gwb.b(this.a.g.i)) {
            this.a.e = dnd.OPEN;
        } else if (gwb.a(this.a.g.s) == 2) {
            this.a.e = dnd.KNOCKABLE;
        } else if (gwb.a(this.a.g.u) == 2) {
            this.a.e = dnd.DOMAIN_WITH_EXTERNAL;
        } else if (gwb.a(this.a.g.b) == 2) {
            this.a.e = dnd.DOMAIN_RESTRICTED;
        } else {
            this.a.e = dnd.INVITED_ONLY;
        }
        if (dnd != this.a.e) {
            for (dnb a : this.a.d) {
                a.a(this.a.e, z);
            }
        }
    }
}
