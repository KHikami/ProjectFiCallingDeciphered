final class cvs extends ijj {
    final /* synthetic */ cvr a;

    cvs(cvr cvr) {
        this.a = cvr;
    }

    public /* synthetic */ void a(nzf nzf, nzf nzf2) {
        b((lym) nzf2);
    }

    public /* synthetic */ void b(nzf nzf) {
        c((lym) nzf);
    }

    private void a(lym lym) {
        d(lym);
    }

    private void b(lym lym) {
        d(lym);
    }

    private void c(lym lym) {
        this.a.c.remove(lym.b);
        this.a.a(lym.b);
    }

    private void d(lym lym) {
        if (!lym.b.equals(this.a.d.a().b)) {
            if (gwb.b(lym.q)) {
                this.a.c.add(lym.b);
            } else {
                this.a.c.remove(lym.b);
            }
            this.a.a(lym.b);
        }
    }
}
