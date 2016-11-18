package p000;

public final class nej extends nyx<nej> {
    private static volatile nej[] f29610c;
    public Integer f29611a;
    public String f29612b;

    public /* synthetic */ nzf m34553a(nyt nyt) {
        return m34550b(nyt);
    }

    public static nej[] m34551d() {
        if (f29610c == null) {
            synchronized (nzc.f31309c) {
                if (f29610c == null) {
                    f29610c = new nej[0];
                }
            }
        }
        return f29610c;
    }

    public nej() {
        m34552g();
    }

    private nej m34552g() {
        this.f29611a = null;
        this.f29612b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34554a(nyu nyu) {
        if (this.f29612b != null) {
            nyu.m37170a(2, this.f29612b);
        }
        if (this.f29611a != null) {
            nyu.m37168a(3, this.f29611a.intValue());
        }
        super.a(nyu);
    }

    protected int m34555b() {
        int b = super.b();
        if (this.f29612b != null) {
            b += nyu.m37137b(2, this.f29612b);
        }
        if (this.f29611a != null) {
            return b + nyu.m37147f(3, this.f29611a.intValue());
        }
        return b;
    }

    private nej m34550b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.f29612b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f29611a = Integer.valueOf(nyt.m37112f());
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
