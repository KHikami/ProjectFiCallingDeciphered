package p000;

public final class nfm extends nyx<nfm> {
    public nfl[] f29687a;

    public /* synthetic */ nzf m34699a(nyt nyt) {
        return m34697b(nyt);
    }

    public nfm() {
        m34698d();
    }

    private nfm m34698d() {
        this.f29687a = nfl.m34692d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34700a(nyu nyu) {
        if (this.f29687a != null && this.f29687a.length > 0) {
            for (nzf nzf : this.f29687a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34701b() {
        int b = super.b();
        if (this.f29687a != null && this.f29687a.length > 0) {
            for (nzf nzf : this.f29687a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nfm m34697b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f29687a == null) {
                        a = 0;
                    } else {
                        a = this.f29687a.length;
                    }
                    Object obj = new nfl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29687a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nfl();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nfl();
                    nyt.m37101a(obj[a]);
                    this.f29687a = obj;
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
