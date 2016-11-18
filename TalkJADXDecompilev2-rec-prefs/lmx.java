package p000;

public final class lmx extends nyx<lmx> {
    public lmy[] f25713a;
    public Long f25714b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29554b(nyt);
    }

    public lmx() {
        this.f25713a = lmy.m29559d();
        this.f25714b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25713a != null && this.f25713a.length > 0) {
            for (nzf nzf : this.f25713a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25714b != null) {
            nyu.b(2, this.f25714b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25713a != null && this.f25713a.length > 0) {
            for (nzf nzf : this.f25713a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f25714b != null) {
            return b + nyu.f(2, this.f25714b.longValue());
        }
        return b;
    }

    private lmx m29554b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25713a == null) {
                        a = 0;
                    } else {
                        a = this.f25713a.length;
                    }
                    Object obj = new lmy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25713a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lmy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lmy();
                    nyt.a(obj[a]);
                    this.f25713a = obj;
                    continue;
                case 16:
                    this.f25714b = Long.valueOf(nyt.e());
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
