package p000;

public final class kkb extends nyx<kkb> {
    private static volatile kkb[] f22024e;
    public klk f22025a;
    public Long f22026b;
    public String f22027c;
    public String f22028d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26197b(nyt);
    }

    public static kkb[] m26198d() {
        if (f22024e == null) {
            synchronized (nzc.c) {
                if (f22024e == null) {
                    f22024e = new kkb[0];
                }
            }
        }
        return f22024e;
    }

    public kkb() {
        m26199g();
    }

    private kkb m26199g() {
        this.f22025a = null;
        this.f22026b = null;
        this.f22027c = null;
        this.f22028d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22025a != null) {
            nyu.b(1, this.f22025a);
        }
        if (this.f22026b != null) {
            nyu.b(2, this.f22026b.longValue());
        }
        if (this.f22027c != null) {
            nyu.a(3, this.f22027c);
        }
        if (this.f22028d != null) {
            nyu.a(4, this.f22028d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22025a != null) {
            b += nyu.d(1, this.f22025a);
        }
        if (this.f22026b != null) {
            b += nyu.f(2, this.f22026b.longValue());
        }
        if (this.f22027c != null) {
            b += nyu.b(3, this.f22027c);
        }
        if (this.f22028d != null) {
            return b + nyu.b(4, this.f22028d);
        }
        return b;
    }

    private kkb m26197b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22025a == null) {
                        this.f22025a = new klk();
                    }
                    nyt.a(this.f22025a);
                    continue;
                case 16:
                    this.f22026b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.f22027c = nyt.j();
                    continue;
                case 34:
                    this.f22028d = nyt.j();
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
