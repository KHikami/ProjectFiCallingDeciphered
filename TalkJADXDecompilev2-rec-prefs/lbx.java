package p000;

public final class lbx extends nyx<lbx> {
    public String f24527a;
    public laa[] f24528b;
    public oez f24529c;
    public Long f24530d;
    public String f24531e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28535b(nyt);
    }

    public lbx() {
        this.f24527a = null;
        this.f24528b = laa.m28320d();
        this.f24530d = null;
        this.f24531e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24527a != null) {
            nyu.a(1, this.f24527a);
        }
        if (this.f24528b != null && this.f24528b.length > 0) {
            for (nzf nzf : this.f24528b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f24529c != null) {
            nyu.b(3, this.f24529c);
        }
        if (this.f24530d != null) {
            nyu.b(4, this.f24530d.longValue());
        }
        if (this.f24531e != null) {
            nyu.a(5, this.f24531e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24527a != null) {
            b += nyu.b(1, this.f24527a);
        }
        if (this.f24528b != null && this.f24528b.length > 0) {
            int i = b;
            for (nzf nzf : this.f24528b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f24529c != null) {
            b += nyu.d(3, this.f24529c);
        }
        if (this.f24530d != null) {
            b += nyu.f(4, this.f24530d.longValue());
        }
        if (this.f24531e != null) {
            return b + nyu.b(5, this.f24531e);
        }
        return b;
    }

    private lbx m28535b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24527a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f24528b == null) {
                        a = 0;
                    } else {
                        a = this.f24528b.length;
                    }
                    Object obj = new laa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24528b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new laa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new laa();
                    nyt.a(obj[a]);
                    this.f24528b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f24529c == null) {
                        this.f24529c = new oez();
                    }
                    nyt.a(this.f24529c);
                    continue;
                case 32:
                    this.f24530d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.f24531e = nyt.j();
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
