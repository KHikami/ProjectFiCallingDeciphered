package p000;

public final class lzl extends nyx<lzl> {
    public lzm[] f27007a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31288b(nyt);
    }

    public lzl() {
        m31289d();
    }

    private lzl m31289d() {
        this.f27007a = lzm.m31294d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27007a != null && this.f27007a.length > 0) {
            for (nzf nzf : this.f27007a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27007a != null && this.f27007a.length > 0) {
            for (nzf nzf : this.f27007a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lzl m31288b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f27007a == null) {
                        a = 0;
                    } else {
                        a = this.f27007a.length;
                    }
                    Object obj = new lzm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27007a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzm();
                    nyt.a(obj[a]);
                    this.f27007a = obj;
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
