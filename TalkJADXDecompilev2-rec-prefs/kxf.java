package p000;

public final class kxf extends nyx<kxf> {
    private static volatile kxf[] f23835g;
    public String f23836a;
    public kxb f23837b;
    public Integer f23838c;
    public kxd f23839d;
    public kxg f23840e;
    public kxc f23841f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27906b(nyt);
    }

    public static kxf[] m27907d() {
        if (f23835g == null) {
            synchronized (nzc.c) {
                if (f23835g == null) {
                    f23835g = new kxf[0];
                }
            }
        }
        return f23835g;
    }

    public kxf() {
        m27908g();
    }

    private kxf m27908g() {
        this.f23836a = null;
        this.f23837b = null;
        this.f23839d = null;
        this.f23840e = null;
        this.f23841f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23836a != null) {
            nyu.a(1, this.f23836a);
        }
        if (this.f23837b != null) {
            nyu.b(2, this.f23837b);
        }
        if (this.f23838c != null) {
            nyu.a(3, this.f23838c.intValue());
        }
        if (this.f23839d != null) {
            nyu.b(4, this.f23839d);
        }
        if (this.f23840e != null) {
            nyu.b(5, this.f23840e);
        }
        if (this.f23841f != null) {
            nyu.b(6, this.f23841f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23836a != null) {
            b += nyu.b(1, this.f23836a);
        }
        if (this.f23837b != null) {
            b += nyu.d(2, this.f23837b);
        }
        if (this.f23838c != null) {
            b += nyu.f(3, this.f23838c.intValue());
        }
        if (this.f23839d != null) {
            b += nyu.d(4, this.f23839d);
        }
        if (this.f23840e != null) {
            b += nyu.d(5, this.f23840e);
        }
        if (this.f23841f != null) {
            return b + nyu.d(6, this.f23841f);
        }
        return b;
    }

    private kxf m27906b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23836a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f23837b == null) {
                        this.f23837b = new kxb();
                    }
                    nyt.a(this.f23837b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23838c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f23839d == null) {
                        this.f23839d = new kxd();
                    }
                    nyt.a(this.f23839d);
                    continue;
                case 42:
                    if (this.f23840e == null) {
                        this.f23840e = new kxg();
                    }
                    nyt.a(this.f23840e);
                    continue;
                case 50:
                    if (this.f23841f == null) {
                        this.f23841f = new kxc();
                    }
                    nyt.a(this.f23841f);
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
