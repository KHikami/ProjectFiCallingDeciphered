package p000;

public final class oqi extends nyx<oqi> {
    private static volatile oqi[] f33747j;
    public Float f33748a;
    public Float f33749b;
    public String f33750c;
    public String f33751d;
    public String f33752e;
    public String f33753f;
    public String f33754g;
    public String f33755h;
    public Boolean f33756i;

    public /* synthetic */ nzf m39177a(nyt nyt) {
        return m39174b(nyt);
    }

    public static oqi[] m39175d() {
        if (f33747j == null) {
            synchronized (nzc.f31309c) {
                if (f33747j == null) {
                    f33747j = new oqi[0];
                }
            }
        }
        return f33747j;
    }

    public oqi() {
        m39176g();
    }

    private oqi m39176g() {
        this.f33748a = null;
        this.f33749b = null;
        this.f33750c = null;
        this.f33751d = null;
        this.f33752e = null;
        this.f33753f = null;
        this.f33754g = null;
        this.f33755h = null;
        this.f33756i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39178a(nyu nyu) {
        if (this.f33748a != null) {
            nyu.m37167a(1, this.f33748a.floatValue());
        }
        if (this.f33749b != null) {
            nyu.m37167a(2, this.f33749b.floatValue());
        }
        if (this.f33750c != null) {
            nyu.m37170a(3, this.f33750c);
        }
        if (this.f33751d != null) {
            nyu.m37170a(4, this.f33751d);
        }
        if (this.f33752e != null) {
            nyu.m37170a(5, this.f33752e);
        }
        if (this.f33753f != null) {
            nyu.m37170a(7, this.f33753f);
        }
        if (this.f33754g != null) {
            nyu.m37170a(8, this.f33754g);
        }
        if (this.f33755h != null) {
            nyu.m37170a(9, this.f33755h);
        }
        if (this.f33756i != null) {
            nyu.m37172a(10, this.f33756i.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39179b() {
        int b = super.b();
        if (this.f33748a != null) {
            this.f33748a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f33749b != null) {
            this.f33749b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f33750c != null) {
            b += nyu.m37137b(3, this.f33750c);
        }
        if (this.f33751d != null) {
            b += nyu.m37137b(4, this.f33751d);
        }
        if (this.f33752e != null) {
            b += nyu.m37137b(5, this.f33752e);
        }
        if (this.f33753f != null) {
            b += nyu.m37137b(7, this.f33753f);
        }
        if (this.f33754g != null) {
            b += nyu.m37137b(8, this.f33754g);
        }
        if (this.f33755h != null) {
            b += nyu.m37137b(9, this.f33755h);
        }
        if (this.f33756i == null) {
            return b;
        }
        this.f33756i.booleanValue();
        return b + (nyu.m37154h(10) + 1);
    }

    private oqi m39174b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f33748a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f33749b = Float.valueOf(nyt.m37106c());
                    continue;
                case wi.dx /*26*/:
                    this.f33750c = nyt.m37117j();
                    continue;
                case 34:
                    this.f33751d = nyt.m37117j();
                    continue;
                case 42:
                    this.f33752e = nyt.m37117j();
                    continue;
                case 58:
                    this.f33753f = nyt.m37117j();
                    continue;
                case 66:
                    this.f33754g = nyt.m37117j();
                    continue;
                case 74:
                    this.f33755h = nyt.m37117j();
                    continue;
                case 80:
                    this.f33756i = Boolean.valueOf(nyt.m37116i());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
