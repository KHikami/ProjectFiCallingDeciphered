package p000;

public final class klm extends nyx<klm> {
    private static volatile klm[] f22260h;
    public klk f22261a;
    public String f22262b;
    public String f22263c;
    public String f22264d;
    public String f22265e;
    public String f22266f;
    public kmm f22267g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26405b(nyt);
    }

    public static klm[] m26406d() {
        if (f22260h == null) {
            synchronized (nzc.c) {
                if (f22260h == null) {
                    f22260h = new klm[0];
                }
            }
        }
        return f22260h;
    }

    public klm() {
        m26407g();
    }

    private klm m26407g() {
        this.f22261a = null;
        this.f22262b = null;
        this.f22263c = null;
        this.f22264d = null;
        this.f22265e = null;
        this.f22266f = null;
        this.f22267g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22261a != null) {
            nyu.b(1, this.f22261a);
        }
        if (this.f22262b != null) {
            nyu.a(2, this.f22262b);
        }
        if (this.f22263c != null) {
            nyu.a(3, this.f22263c);
        }
        if (this.f22265e != null) {
            nyu.a(4, this.f22265e);
        }
        if (this.f22264d != null) {
            nyu.a(5, this.f22264d);
        }
        if (this.f22267g != null) {
            nyu.b(6, this.f22267g);
        }
        if (this.f22266f != null) {
            nyu.a(7, this.f22266f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22261a != null) {
            b += nyu.d(1, this.f22261a);
        }
        if (this.f22262b != null) {
            b += nyu.b(2, this.f22262b);
        }
        if (this.f22263c != null) {
            b += nyu.b(3, this.f22263c);
        }
        if (this.f22265e != null) {
            b += nyu.b(4, this.f22265e);
        }
        if (this.f22264d != null) {
            b += nyu.b(5, this.f22264d);
        }
        if (this.f22267g != null) {
            b += nyu.d(6, this.f22267g);
        }
        if (this.f22266f != null) {
            return b + nyu.b(7, this.f22266f);
        }
        return b;
    }

    private klm m26405b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22261a == null) {
                        this.f22261a = new klk();
                    }
                    nyt.a(this.f22261a);
                    continue;
                case wi.dH /*18*/:
                    this.f22262b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22263c = nyt.j();
                    continue;
                case 34:
                    this.f22265e = nyt.j();
                    continue;
                case 42:
                    this.f22264d = nyt.j();
                    continue;
                case 50:
                    if (this.f22267g == null) {
                        this.f22267g = new kmm();
                    }
                    nyt.a(this.f22267g);
                    continue;
                case 58:
                    this.f22266f = nyt.j();
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
