package p000;

public final class nar extends nyx<nar> {
    private static volatile nar[] f29386c;
    public String f29387a;
    public nap f29388b;

    public /* synthetic */ nzf m34093a(nyt nyt) {
        return m34090b(nyt);
    }

    public static nar[] m34091d() {
        if (f29386c == null) {
            synchronized (nzc.f31309c) {
                if (f29386c == null) {
                    f29386c = new nar[0];
                }
            }
        }
        return f29386c;
    }

    public nar() {
        m34092g();
    }

    private nar m34092g() {
        this.f29387a = null;
        this.f29388b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34094a(nyu nyu) {
        if (this.f29387a != null) {
            nyu.m37170a(1, this.f29387a);
        }
        if (this.f29388b != null) {
            nyu.m37182b(2, this.f29388b);
        }
        super.a(nyu);
    }

    protected int m34095b() {
        int b = super.b();
        if (this.f29387a != null) {
            b += nyu.m37137b(1, this.f29387a);
        }
        if (this.f29388b != null) {
            return b + nyu.m37145d(2, this.f29388b);
        }
        return b;
    }

    private nar m34090b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29387a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f29388b == null) {
                        this.f29388b = new nap();
                    }
                    nyt.m37101a(this.f29388b);
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
