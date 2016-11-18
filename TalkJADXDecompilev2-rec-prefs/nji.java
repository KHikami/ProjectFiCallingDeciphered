package p000;

public final class nji extends nyx<nji> {
    private static volatile nji[] f29985d;
    public nmj f29986a;
    public nhx f29987b;
    public Float f29988c;

    public /* synthetic */ nzf m35224a(nyt nyt) {
        return m35221b(nyt);
    }

    public static nji[] m35222d() {
        if (f29985d == null) {
            synchronized (nzc.f31309c) {
                if (f29985d == null) {
                    f29985d = new nji[0];
                }
            }
        }
        return f29985d;
    }

    public nji() {
        m35223g();
    }

    private nji m35223g() {
        this.f29986a = null;
        this.f29987b = null;
        this.f29988c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35225a(nyu nyu) {
        if (this.f29986a != null) {
            nyu.m37182b(1, this.f29986a);
        }
        if (this.f29987b != null) {
            nyu.m37182b(2, this.f29987b);
        }
        if (this.f29988c != null) {
            nyu.m37167a(3, this.f29988c.floatValue());
        }
        super.a(nyu);
    }

    protected int m35226b() {
        int b = super.b();
        if (this.f29986a != null) {
            b += nyu.m37145d(1, this.f29986a);
        }
        if (this.f29987b != null) {
            b += nyu.m37145d(2, this.f29987b);
        }
        if (this.f29988c == null) {
            return b;
        }
        this.f29988c.floatValue();
        return b + (nyu.m37154h(3) + 4);
    }

    private nji m35221b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29986a == null) {
                        this.f29986a = new nmj();
                    }
                    nyt.m37101a(this.f29986a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29987b == null) {
                        this.f29987b = new nhx();
                    }
                    nyt.m37101a(this.f29987b);
                    continue;
                case 29:
                    this.f29988c = Float.valueOf(nyt.m37106c());
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
