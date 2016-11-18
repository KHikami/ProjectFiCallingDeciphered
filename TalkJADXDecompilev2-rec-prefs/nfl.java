package p000;

public final class nfl extends nyx<nfl> {
    private static volatile nfl[] f29681f;
    public njr f29682a;
    public Float f29683b;
    public String f29684c;
    public nfn f29685d;
    public npv f29686e;

    public /* synthetic */ nzf m34694a(nyt nyt) {
        return m34691b(nyt);
    }

    public static nfl[] m34692d() {
        if (f29681f == null) {
            synchronized (nzc.f31309c) {
                if (f29681f == null) {
                    f29681f = new nfl[0];
                }
            }
        }
        return f29681f;
    }

    public nfl() {
        m34693g();
    }

    private nfl m34693g() {
        this.f29682a = null;
        this.f29683b = null;
        this.f29684c = null;
        this.f29685d = null;
        this.f29686e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34695a(nyu nyu) {
        if (this.f29682a != null) {
            nyu.m37182b(1, this.f29682a);
        }
        if (this.f29683b != null) {
            nyu.m37167a(2, this.f29683b.floatValue());
        }
        if (this.f29686e != null) {
            nyu.m37182b(3, this.f29686e);
        }
        if (this.f29684c != null) {
            nyu.m37170a(4, this.f29684c);
        }
        if (this.f29685d != null) {
            nyu.m37182b(5, this.f29685d);
        }
        super.a(nyu);
    }

    protected int m34696b() {
        int b = super.b();
        if (this.f29682a != null) {
            b += nyu.m37145d(1, this.f29682a);
        }
        if (this.f29683b != null) {
            this.f29683b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f29686e != null) {
            b += nyu.m37145d(3, this.f29686e);
        }
        if (this.f29684c != null) {
            b += nyu.m37137b(4, this.f29684c);
        }
        if (this.f29685d != null) {
            return b + nyu.m37145d(5, this.f29685d);
        }
        return b;
    }

    private nfl m34691b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29682a == null) {
                        this.f29682a = new njr();
                    }
                    nyt.m37101a(this.f29682a);
                    continue;
                case 21:
                    this.f29683b = Float.valueOf(nyt.m37106c());
                    continue;
                case wi.dx /*26*/:
                    if (this.f29686e == null) {
                        this.f29686e = new npv();
                    }
                    nyt.m37101a(this.f29686e);
                    continue;
                case 34:
                    this.f29684c = nyt.m37117j();
                    continue;
                case 42:
                    if (this.f29685d == null) {
                        this.f29685d = new nfn();
                    }
                    nyt.m37101a(this.f29685d);
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
