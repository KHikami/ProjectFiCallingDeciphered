package p000;

public final class ltx extends nyx<ltx> {
    public lty[] f26428a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30521b(nyt);
    }

    public ltx() {
        m30522d();
    }

    private ltx m30522d() {
        this.f26428a = lty.m30527d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26428a != null && this.f26428a.length > 0) {
            for (nzf nzf : this.f26428a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26428a != null && this.f26428a.length > 0) {
            for (nzf nzf : this.f26428a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private ltx m30521b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f26428a == null) {
                        a = 0;
                    } else {
                        a = this.f26428a.length;
                    }
                    Object obj = new lty[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26428a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lty();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lty();
                    nyt.a(obj[a]);
                    this.f26428a = obj;
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
