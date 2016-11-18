package p000;

public final class nbx extends nyx<nbx> {
    public nby[] f29468a;

    public /* synthetic */ nzf m34245a(nyt nyt) {
        return m34244b(nyt);
    }

    public nbx() {
        this.f29468a = nby.m34249d();
        this.cachedSize = -1;
    }

    public void m34246a(nyu nyu) {
        if (this.f29468a != null && this.f29468a.length > 0) {
            for (nzf nzf : this.f29468a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34247b() {
        int b = super.b();
        if (this.f29468a != null && this.f29468a.length > 0) {
            for (nzf nzf : this.f29468a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nbx m34244b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f29468a == null) {
                        a = 0;
                    } else {
                        a = this.f29468a.length;
                    }
                    Object obj = new nby[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29468a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nby();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nby();
                    nyt.m37101a(obj[a]);
                    this.f29468a = obj;
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
