package p000;

public final class kjs extends nyx<kjs> {
    private static volatile kjs[] f21974e;
    public klk f21975a;
    public String f21976b;
    public String f21977c;
    public String f21978d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26143b(nyt);
    }

    public static kjs[] m26144d() {
        if (f21974e == null) {
            synchronized (nzc.c) {
                if (f21974e == null) {
                    f21974e = new kjs[0];
                }
            }
        }
        return f21974e;
    }

    public kjs() {
        m26145g();
    }

    private kjs m26145g() {
        this.f21975a = null;
        this.f21976b = null;
        this.f21977c = null;
        this.f21978d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21975a != null) {
            nyu.b(1, this.f21975a);
        }
        if (this.f21976b != null) {
            nyu.a(2, this.f21976b);
        }
        if (this.f21977c != null) {
            nyu.a(3, this.f21977c);
        }
        if (this.f21978d != null) {
            nyu.a(4, this.f21978d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21975a != null) {
            b += nyu.d(1, this.f21975a);
        }
        if (this.f21976b != null) {
            b += nyu.b(2, this.f21976b);
        }
        if (this.f21977c != null) {
            b += nyu.b(3, this.f21977c);
        }
        if (this.f21978d != null) {
            return b + nyu.b(4, this.f21978d);
        }
        return b;
    }

    private kjs m26143b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21975a == null) {
                        this.f21975a = new klk();
                    }
                    nyt.a(this.f21975a);
                    continue;
                case wi.dH /*18*/:
                    this.f21976b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f21977c = nyt.j();
                    continue;
                case 34:
                    this.f21978d = nyt.j();
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
