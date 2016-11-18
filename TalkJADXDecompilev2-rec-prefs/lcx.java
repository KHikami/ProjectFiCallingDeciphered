package p000;

public final class lcx extends nyx<lcx> {
    public lcz[] f24626a;
    public lcz f24627b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28675b(nyt);
    }

    public lcx() {
        m28676d();
    }

    private lcx m28676d() {
        this.f24626a = lcz.m28687d();
        this.f24627b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24626a != null && this.f24626a.length > 0) {
            for (nzf nzf : this.f24626a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f24627b != null) {
            nyu.b(2, this.f24627b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24626a != null && this.f24626a.length > 0) {
            for (nzf nzf : this.f24626a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f24627b != null) {
            return b + nyu.d(2, this.f24627b);
        }
        return b;
    }

    private lcx m28675b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24626a == null) {
                        a = 0;
                    } else {
                        a = this.f24626a.length;
                    }
                    Object obj = new lcz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24626a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcz();
                    nyt.a(obj[a]);
                    this.f24626a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f24627b == null) {
                        this.f24627b = new lcz();
                    }
                    nyt.a(this.f24627b);
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
