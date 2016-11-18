package p000;

public final class loc extends nyx<loc> {
    private static volatile loc[] f25849g;
    public ofu[] f25850a;
    public lsv f25851b;
    public lsq f25852c;
    public lqt f25853d;
    public lwj f25854e;
    public lud f25855f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29711b(nyt);
    }

    public static loc[] m29712d() {
        if (f25849g == null) {
            synchronized (nzc.c) {
                if (f25849g == null) {
                    f25849g = new loc[0];
                }
            }
        }
        return f25849g;
    }

    public loc() {
        m29713g();
    }

    private loc m29713g() {
        this.f25850a = ofu.d();
        this.f25851b = null;
        this.f25852c = null;
        this.f25853d = null;
        this.f25854e = null;
        this.f25855f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25850a != null && this.f25850a.length > 0) {
            for (nzf nzf : this.f25850a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25851b != null) {
            nyu.b(2, this.f25851b);
        }
        if (this.f25852c != null) {
            nyu.b(3, this.f25852c);
        }
        if (this.f25853d != null) {
            nyu.b(4, this.f25853d);
        }
        if (this.f25854e != null) {
            nyu.b(5, this.f25854e);
        }
        if (this.f25855f != null) {
            nyu.b(6, this.f25855f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25850a != null && this.f25850a.length > 0) {
            for (nzf nzf : this.f25850a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f25851b != null) {
            b += nyu.d(2, this.f25851b);
        }
        if (this.f25852c != null) {
            b += nyu.d(3, this.f25852c);
        }
        if (this.f25853d != null) {
            b += nyu.d(4, this.f25853d);
        }
        if (this.f25854e != null) {
            b += nyu.d(5, this.f25854e);
        }
        if (this.f25855f != null) {
            return b + nyu.d(6, this.f25855f);
        }
        return b;
    }

    private loc m29711b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25850a == null) {
                        a = 0;
                    } else {
                        a = this.f25850a.length;
                    }
                    Object obj = new ofu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25850a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ofu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ofu();
                    nyt.a(obj[a]);
                    this.f25850a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f25851b == null) {
                        this.f25851b = new lsv();
                    }
                    nyt.a(this.f25851b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f25852c == null) {
                        this.f25852c = new lsq();
                    }
                    nyt.a(this.f25852c);
                    continue;
                case 34:
                    if (this.f25853d == null) {
                        this.f25853d = new lqt();
                    }
                    nyt.a(this.f25853d);
                    continue;
                case 42:
                    if (this.f25854e == null) {
                        this.f25854e = new lwj();
                    }
                    nyt.a(this.f25854e);
                    continue;
                case 50:
                    if (this.f25855f == null) {
                        this.f25855f = new lud();
                    }
                    nyt.a(this.f25855f);
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
