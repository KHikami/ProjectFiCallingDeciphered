package p000;

public final class nfy extends nyx<nfy> {
    public nqb[] f29741a;
    public Boolean f29742b;
    public Boolean f29743c;

    public /* synthetic */ nzf m34761a(nyt nyt) {
        return m34759b(nyt);
    }

    public nfy() {
        m34760d();
    }

    private nfy m34760d() {
        this.f29741a = nqb.m36116d();
        this.f29742b = null;
        this.f29743c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34762a(nyu nyu) {
        if (this.f29742b != null) {
            nyu.m37172a(1, this.f29742b.booleanValue());
        }
        if (this.f29743c != null) {
            nyu.m37172a(2, this.f29743c.booleanValue());
        }
        if (this.f29741a != null && this.f29741a.length > 0) {
            for (nzf nzf : this.f29741a) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34763b() {
        int b = super.b();
        if (this.f29742b != null) {
            this.f29742b.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29743c != null) {
            this.f29743c.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f29741a == null || this.f29741a.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29741a) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private nfy m34759b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29742b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f29743c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f29741a == null) {
                        a = 0;
                    } else {
                        a = this.f29741a.length;
                    }
                    Object obj = new nqb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29741a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nqb();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nqb();
                    nyt.m37101a(obj[a]);
                    this.f29741a = obj;
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
