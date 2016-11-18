package p000;

public final class krb extends nyx<krb> {
    private static volatile krb[] f22851e;
    public kqd f22852a;
    public kpi f22853b;
    public String f22854c;
    public Integer f22855d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27149b(nyt);
    }

    public static krb[] m27150d() {
        if (f22851e == null) {
            synchronized (nzc.c) {
                if (f22851e == null) {
                    f22851e = new krb[0];
                }
            }
        }
        return f22851e;
    }

    public krb() {
        m27151g();
    }

    private krb m27151g() {
        this.f22852a = null;
        this.f22853b = null;
        this.f22854c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22852a != null) {
            nyu.b(1, this.f22852a);
        }
        if (this.f22853b != null) {
            nyu.b(2, this.f22853b);
        }
        if (this.f22854c != null) {
            nyu.a(3, this.f22854c);
        }
        if (this.f22855d != null) {
            nyu.a(4, this.f22855d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22852a != null) {
            b += nyu.d(1, this.f22852a);
        }
        if (this.f22853b != null) {
            b += nyu.d(2, this.f22853b);
        }
        if (this.f22854c != null) {
            b += nyu.b(3, this.f22854c);
        }
        if (this.f22855d != null) {
            return b + nyu.f(4, this.f22855d.intValue());
        }
        return b;
    }

    private krb m27149b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22852a == null) {
                        this.f22852a = new kqd();
                    }
                    nyt.a(this.f22852a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22853b == null) {
                        this.f22853b = new kpi();
                    }
                    nyt.a(this.f22853b);
                    continue;
                case wi.dx /*26*/:
                    this.f22854c = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            this.f22855d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
