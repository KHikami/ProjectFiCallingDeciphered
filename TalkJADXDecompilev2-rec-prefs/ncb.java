package p000;

public final class ncb extends nyx<ncb> {
    public int f29483a;
    public ncc[] f29484b;

    public /* synthetic */ nzf m34275a(nyt nyt) {
        return m34274b(nyt);
    }

    public ncb() {
        this.f29483a = nzf.UNSET_ENUM_VALUE;
        this.f29484b = ncc.m34279d();
        this.cachedSize = -1;
    }

    public void m34276a(nyu nyu) {
        if (this.f29483a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f29483a);
        }
        if (this.f29484b != null && this.f29484b.length > 0) {
            for (nzf nzf : this.f29484b) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34277b() {
        int b = super.b();
        if (this.f29483a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f29483a);
        }
        if (this.f29484b == null || this.f29484b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29484b) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private ncb m34274b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29483a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f29484b == null) {
                        a = 0;
                    } else {
                        a = this.f29484b.length;
                    }
                    Object obj = new ncc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29484b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ncc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ncc();
                    nyt.m37101a(obj[a]);
                    this.f29484b = obj;
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
