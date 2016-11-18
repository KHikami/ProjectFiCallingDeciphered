package p000;

public final class lqf extends nyx<lqf> {
    private static volatile lqf[] f26101d;
    public Integer f26102a;
    public Double f26103b;
    public String f26104c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30018b(nyt);
    }

    public static lqf[] m30019d() {
        if (f26101d == null) {
            synchronized (nzc.c) {
                if (f26101d == null) {
                    f26101d = new lqf[0];
                }
            }
        }
        return f26101d;
    }

    public lqf() {
        m30020g();
    }

    private lqf m30020g() {
        this.f26103b = null;
        this.f26104c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26102a != null) {
            nyu.a(1, this.f26102a.intValue());
        }
        if (this.f26103b != null) {
            nyu.a(2, this.f26103b.doubleValue());
        }
        if (this.f26104c != null) {
            nyu.a(3, this.f26104c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26102a != null) {
            b += nyu.f(1, this.f26102a.intValue());
        }
        if (this.f26103b != null) {
            this.f26103b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.f26104c != null) {
            return b + nyu.b(3, this.f26104c);
        }
        return b;
    }

    private lqf m30018b(nyt nyt) {
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
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f26102a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dK /*17*/:
                    this.f26103b = Double.valueOf(nyt.b());
                    continue;
                case wi.dx /*26*/:
                    this.f26104c = nyt.j();
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
