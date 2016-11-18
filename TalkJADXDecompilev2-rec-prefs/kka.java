package p000;

public final class kka extends nyx<kka> {
    private static volatile kka[] f22021c;
    public Integer f22022a;
    public String f22023b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26191b(nyt);
    }

    public static kka[] m26192d() {
        if (f22021c == null) {
            synchronized (nzc.c) {
                if (f22021c == null) {
                    f22021c = new kka[0];
                }
            }
        }
        return f22021c;
    }

    public kka() {
        m26193g();
    }

    private kka m26193g() {
        this.f22023b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22022a != null) {
            nyu.a(1, this.f22022a.intValue());
        }
        if (this.f22023b != null) {
            nyu.a(2, this.f22023b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22022a != null) {
            b += nyu.f(1, this.f22022a.intValue());
        }
        if (this.f22023b != null) {
            return b + nyu.b(2, this.f22023b);
        }
        return b;
    }

    private kka m26191b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f22022a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f22023b = nyt.j();
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
