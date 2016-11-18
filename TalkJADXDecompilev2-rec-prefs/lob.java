package p000;

public final class lob extends nyx<lob> {
    public ltb f25847a;
    public lqj[] f25848b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29706b(nyt);
    }

    public lob() {
        m29707d();
    }

    private lob m29707d() {
        this.f25847a = null;
        this.f25848b = lqj.m30041d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25848b != null && this.f25848b.length > 0) {
            for (nzf nzf : this.f25848b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f25847a != null) {
            nyu.b(3, this.f25847a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25848b != null && this.f25848b.length > 0) {
            for (nzf nzf : this.f25848b) {
                if (nzf != null) {
                    b += nyu.d(2, nzf);
                }
            }
        }
        if (this.f25847a != null) {
            return b + nyu.d(3, this.f25847a);
        }
        return b;
    }

    private lob m29706b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f25848b == null) {
                        a = 0;
                    } else {
                        a = this.f25848b.length;
                    }
                    Object obj = new lqj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25848b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqj();
                    nyt.a(obj[a]);
                    this.f25848b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f25847a == null) {
                        this.f25847a = new ltb();
                    }
                    nyt.a(this.f25847a);
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
