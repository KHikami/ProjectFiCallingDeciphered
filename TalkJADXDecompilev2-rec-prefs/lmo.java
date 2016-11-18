package p000;

public final class lmo extends nyx<lmo> {
    private static volatile lmo[] f25589e;
    public Integer f25590a;
    public Integer f25591b;
    public Integer f25592c;
    public String f25593d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29513b(nyt);
    }

    public static lmo[] m29514d() {
        if (f25589e == null) {
            synchronized (nzc.c) {
                if (f25589e == null) {
                    f25589e = new lmo[0];
                }
            }
        }
        return f25589e;
    }

    public lmo() {
        this.f25590a = null;
        this.f25591b = null;
        this.f25592c = null;
        this.f25593d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25590a != null) {
            nyu.a(1, this.f25590a.intValue());
        }
        if (this.f25591b != null) {
            nyu.a(2, this.f25591b.intValue());
        }
        if (this.f25592c != null) {
            nyu.a(3, this.f25592c.intValue());
        }
        if (this.f25593d != null) {
            nyu.a(4, this.f25593d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25590a != null) {
            b += nyu.f(1, this.f25590a.intValue());
        }
        if (this.f25591b != null) {
            b += nyu.f(2, this.f25591b.intValue());
        }
        if (this.f25592c != null) {
            b += nyu.f(3, this.f25592c.intValue());
        }
        if (this.f25593d != null) {
            return b + nyu.b(4, this.f25593d);
        }
        return b;
    }

    private lmo m29513b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25590a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25591b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f25592c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f25593d = nyt.j();
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
