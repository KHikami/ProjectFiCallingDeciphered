package p000;

public final class nik extends nyx<nik> {
    private static volatile nik[] f29884d;
    public String f29885a;
    public Float f29886b;
    public String f29887c;

    public /* synthetic */ nzf m35100a(nyt nyt) {
        return m35097b(nyt);
    }

    public static nik[] m35098d() {
        if (f29884d == null) {
            synchronized (nzc.f31309c) {
                if (f29884d == null) {
                    f29884d = new nik[0];
                }
            }
        }
        return f29884d;
    }

    public nik() {
        m35099g();
    }

    private nik m35099g() {
        this.f29885a = null;
        this.f29886b = null;
        this.f29887c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35101a(nyu nyu) {
        if (this.f29885a != null) {
            nyu.m37170a(1, this.f29885a);
        }
        if (this.f29886b != null) {
            nyu.m37167a(2, this.f29886b.floatValue());
        }
        if (this.f29887c != null) {
            nyu.m37170a(3, this.f29887c);
        }
        super.a(nyu);
    }

    protected int m35102b() {
        int b = super.b();
        if (this.f29885a != null) {
            b += nyu.m37137b(1, this.f29885a);
        }
        if (this.f29886b != null) {
            this.f29886b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f29887c != null) {
            return b + nyu.m37137b(3, this.f29887c);
        }
        return b;
    }

    private nik m35097b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29885a = nyt.m37117j();
                    continue;
                case 21:
                    this.f29886b = Float.valueOf(nyt.m37106c());
                    continue;
                case wi.dx /*26*/:
                    this.f29887c = nyt.m37117j();
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
