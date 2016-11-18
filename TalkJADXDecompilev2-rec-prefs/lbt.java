package p000;

public final class lbt extends nyx<lbt> {
    public laa f24513a;
    public laa[] f24514b;
    public lbp f24515c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28519b(nyt);
    }

    public lbt() {
        this.f24514b = laa.m28320d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24513a != null) {
            nyu.b(4, this.f24513a);
        }
        if (this.f24514b != null && this.f24514b.length > 0) {
            for (nzf nzf : this.f24514b) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.f24515c != null) {
            nyu.b(6, this.f24515c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24513a != null) {
            b += nyu.d(4, this.f24513a);
        }
        if (this.f24514b != null && this.f24514b.length > 0) {
            int i = b;
            for (nzf nzf : this.f24514b) {
                if (nzf != null) {
                    i += nyu.d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f24515c != null) {
            return b + nyu.d(6, this.f24515c);
        }
        return b;
    }

    private lbt m28519b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 34:
                    if (this.f24513a == null) {
                        this.f24513a = new laa();
                    }
                    nyt.a(this.f24513a);
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f24514b == null) {
                        a = 0;
                    } else {
                        a = this.f24514b.length;
                    }
                    Object obj = new laa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24514b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new laa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new laa();
                    nyt.a(obj[a]);
                    this.f24514b = obj;
                    continue;
                case 50:
                    if (this.f24515c == null) {
                        this.f24515c = new lbp();
                    }
                    nyt.a(this.f24515c);
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
