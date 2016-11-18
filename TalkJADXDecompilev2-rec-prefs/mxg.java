package p000;

public final class mxg extends nyx<mxg> {
    public mxh f28674a;
    public Long f28675b;
    public mxi f28676c;
    public mxo[] f28677d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33315b(nyt);
    }

    public mxg() {
        m33316d();
    }

    private mxg m33316d() {
        this.f28674a = null;
        this.f28675b = null;
        this.f28676c = null;
        this.f28677d = mxo.m33357d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28674a != null) {
            nyu.b(1, this.f28674a);
        }
        if (this.f28675b != null) {
            nyu.b(2, this.f28675b.longValue());
        }
        if (this.f28676c != null) {
            nyu.b(3, this.f28676c);
        }
        if (this.f28677d != null && this.f28677d.length > 0) {
            for (nzf nzf : this.f28677d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28674a != null) {
            b += nyu.d(1, this.f28674a);
        }
        if (this.f28675b != null) {
            b += nyu.f(2, this.f28675b.longValue());
        }
        if (this.f28676c != null) {
            b += nyu.d(3, this.f28676c);
        }
        if (this.f28677d == null || this.f28677d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f28677d) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private mxg m33315b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28674a == null) {
                        this.f28674a = new mxh();
                    }
                    nyt.a(this.f28674a);
                    continue;
                case 16:
                    this.f28675b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    if (this.f28676c == null) {
                        this.f28676c = new mxi();
                    }
                    nyt.a(this.f28676c);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f28677d == null) {
                        a = 0;
                    } else {
                        a = this.f28677d.length;
                    }
                    Object obj = new mxo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28677d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxo();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mxo();
                    nyt.a(obj[a]);
                    this.f28677d = obj;
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
