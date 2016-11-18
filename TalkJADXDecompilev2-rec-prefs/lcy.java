package p000;

public final class lcy extends nyx<lcy> {
    private static volatile lcy[] f24628g;
    public lcz f24629a;
    public String f24630b;
    public String f24631c;
    public lco f24632d;
    public String f24633e;
    public String f24634f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28680b(nyt);
    }

    public static lcy[] m28681d() {
        if (f24628g == null) {
            synchronized (nzc.c) {
                if (f24628g == null) {
                    f24628g = new lcy[0];
                }
            }
        }
        return f24628g;
    }

    public lcy() {
        m28682g();
    }

    private lcy m28682g() {
        this.f24629a = null;
        this.f24630b = null;
        this.f24631c = null;
        this.f24632d = null;
        this.f24633e = null;
        this.f24634f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24629a != null) {
            nyu.b(1, this.f24629a);
        }
        if (this.f24630b != null) {
            nyu.a(2, this.f24630b);
        }
        if (this.f24631c != null) {
            nyu.a(3, this.f24631c);
        }
        if (this.f24632d != null) {
            nyu.b(4, this.f24632d);
        }
        if (this.f24633e != null) {
            nyu.a(5, this.f24633e);
        }
        if (this.f24634f != null) {
            nyu.a(6, this.f24634f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24629a != null) {
            b += nyu.d(1, this.f24629a);
        }
        if (this.f24630b != null) {
            b += nyu.b(2, this.f24630b);
        }
        if (this.f24631c != null) {
            b += nyu.b(3, this.f24631c);
        }
        if (this.f24632d != null) {
            b += nyu.d(4, this.f24632d);
        }
        if (this.f24633e != null) {
            b += nyu.b(5, this.f24633e);
        }
        if (this.f24634f != null) {
            return b + nyu.b(6, this.f24634f);
        }
        return b;
    }

    private lcy m28680b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24629a == null) {
                        this.f24629a = new lcz();
                    }
                    nyt.a(this.f24629a);
                    continue;
                case wi.dH /*18*/:
                    this.f24630b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24631c = nyt.j();
                    continue;
                case 34:
                    if (this.f24632d == null) {
                        this.f24632d = new lco();
                    }
                    nyt.a(this.f24632d);
                    continue;
                case 42:
                    this.f24633e = nyt.j();
                    continue;
                case 50:
                    this.f24634f = nyt.j();
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
