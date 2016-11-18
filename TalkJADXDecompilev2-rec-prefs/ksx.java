package p000;

public final class ksx extends nyx<ksx> {
    private static volatile ksx[] f23178e;
    public Integer f23179a;
    public Integer f23180b;
    public Integer f23181c;
    public String f23182d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27389b(nyt);
    }

    public static ksx[] m27390d() {
        if (f23178e == null) {
            synchronized (nzc.c) {
                if (f23178e == null) {
                    f23178e = new ksx[0];
                }
            }
        }
        return f23178e;
    }

    public ksx() {
        m27391g();
    }

    private ksx m27391g() {
        this.f23179a = null;
        this.f23180b = null;
        this.f23181c = null;
        this.f23182d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23179a.intValue());
        nyu.a(2, this.f23180b.intValue());
        nyu.a(3, this.f23181c.intValue());
        if (this.f23182d != null) {
            nyu.a(4, this.f23182d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = ((super.mo147b() + nyu.f(1, this.f23179a.intValue())) + nyu.f(2, this.f23180b.intValue())) + nyu.f(3, this.f23181c.intValue());
        if (this.f23182d != null) {
            return b + nyu.b(4, this.f23182d);
        }
        return b;
    }

    private ksx m27389b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23179a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f23180b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f23181c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f23182d = nyt.j();
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
