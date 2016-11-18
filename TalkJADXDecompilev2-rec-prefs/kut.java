package p000;

public final class kut extends nyx<kut> {
    private static volatile kut[] f23500f;
    public Double f23501a;
    public Double f23502b;
    public String f23503c;
    public String f23504d;
    public String f23505e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27615b(nyt);
    }

    public static kut[] m27616d() {
        if (f23500f == null) {
            synchronized (nzc.c) {
                if (f23500f == null) {
                    f23500f = new kut[0];
                }
            }
        }
        return f23500f;
    }

    public kut() {
        m27617g();
    }

    private kut m27617g() {
        this.f23501a = null;
        this.f23502b = null;
        this.f23503c = null;
        this.f23504d = null;
        this.f23505e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23501a != null) {
            nyu.a(1, this.f23501a.doubleValue());
        }
        if (this.f23502b != null) {
            nyu.a(2, this.f23502b.doubleValue());
        }
        if (this.f23503c != null) {
            nyu.a(3, this.f23503c);
        }
        if (this.f23504d != null) {
            nyu.a(4, this.f23504d);
        }
        if (this.f23505e != null) {
            nyu.a(5, this.f23505e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23501a != null) {
            this.f23501a.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.f23502b != null) {
            this.f23502b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.f23503c != null) {
            b += nyu.b(3, this.f23503c);
        }
        if (this.f23504d != null) {
            b += nyu.b(4, this.f23504d);
        }
        if (this.f23505e != null) {
            return b + nyu.b(5, this.f23505e);
        }
        return b;
    }

    private kut m27615b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f23501a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.f23502b = Double.valueOf(nyt.b());
                    continue;
                case wi.dx /*26*/:
                    this.f23503c = nyt.j();
                    continue;
                case 34:
                    this.f23504d = nyt.j();
                    continue;
                case 42:
                    this.f23505e = nyt.j();
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
