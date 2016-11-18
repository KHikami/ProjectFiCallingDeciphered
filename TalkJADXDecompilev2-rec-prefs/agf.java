package p000;

public final class agf extends nyx<agf> {
    public static final nyy<ozo, agf> f591a = nyy.a(11, agf.class, 196484970);
    private static final agf[] f592d = new agf[0];
    public C0006c f593b;
    public C0005b[] f594c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m1043b(nyt);
    }

    public agf() {
        m1044d();
    }

    private agf m1044d() {
        this.f593b = null;
        this.f594c = C0005b.m4516a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f593b != null) {
            nyu.b(1, this.f593b);
        }
        if (this.f594c != null && this.f594c.length > 0) {
            for (nzf nzf : this.f594c) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f593b != null) {
            b += nyu.d(1, this.f593b);
        }
        if (this.f594c == null || this.f594c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f594c) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private agf m1043b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f593b == null) {
                        this.f593b = new C0006c();
                    }
                    nyt.a(this.f593b);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f594c == null) {
                        a = 0;
                    } else {
                        a = this.f594c.length;
                    }
                    Object obj = new C0005b[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f594c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0005b();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new C0005b();
                    nyt.a(obj[a]);
                    this.f594c = obj;
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
