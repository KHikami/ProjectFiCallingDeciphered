package p000;

public final class mxl extends nyx<mxl> {
    public mxm[] f28686a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33340b(nyt);
    }

    public mxl() {
        m33341d();
    }

    private mxl m33341d() {
        this.f28686a = mxm.m33346d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28686a != null && this.f28686a.length > 0) {
            for (nzf nzf : this.f28686a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28686a != null && this.f28686a.length > 0) {
            for (nzf nzf : this.f28686a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private mxl m33340b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28686a == null) {
                        a = 0;
                    } else {
                        a = this.f28686a.length;
                    }
                    Object obj = new mxm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28686a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mxm();
                    nyt.a(obj[a]);
                    this.f28686a = obj;
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
