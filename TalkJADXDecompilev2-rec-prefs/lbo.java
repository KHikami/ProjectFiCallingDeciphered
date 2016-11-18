package p000;

public final class lbo extends nyx<lbo> {
    public laa f24499a;
    public lbp f24500b;
    public laa[] f24501c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28499b(nyt);
    }

    public lbo() {
        this.f24501c = laa.m28320d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24499a != null) {
            nyu.b(1, this.f24499a);
        }
        if (this.f24500b != null) {
            nyu.b(2, this.f24500b);
        }
        if (this.f24501c != null && this.f24501c.length > 0) {
            for (nzf nzf : this.f24501c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24499a != null) {
            b += nyu.d(1, this.f24499a);
        }
        if (this.f24500b != null) {
            b += nyu.d(2, this.f24500b);
        }
        if (this.f24501c == null || this.f24501c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f24501c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private lbo m28499b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24499a == null) {
                        this.f24499a = new laa();
                    }
                    nyt.a(this.f24499a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f24500b == null) {
                        this.f24500b = new lbp();
                    }
                    nyt.a(this.f24500b);
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f24501c == null) {
                        a = 0;
                    } else {
                        a = this.f24501c.length;
                    }
                    Object obj = new laa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24501c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new laa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new laa();
                    nyt.a(obj[a]);
                    this.f24501c = obj;
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
