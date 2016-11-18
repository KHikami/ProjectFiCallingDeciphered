package p000;

public final class ohi extends nyx<ohi> {
    private static volatile ohi[] f32863c;
    public Integer f32864a;
    public ohn f32865b;

    public /* synthetic */ nzf m38344a(nyt nyt) {
        return m38342b(nyt);
    }

    public static ohi[] m38343d() {
        if (f32863c == null) {
            synchronized (nzc.f31309c) {
                if (f32863c == null) {
                    f32863c = new ohi[0];
                }
            }
        }
        return f32863c;
    }

    public ohi() {
        this.f32864a = null;
        this.cachedSize = -1;
    }

    public void m38345a(nyu nyu) {
        nyu.m37168a(1, this.f32864a.intValue());
        if (this.f32865b != null) {
            nyu.m37182b(2, this.f32865b);
        }
        super.a(nyu);
    }

    protected int m38346b() {
        int b = super.b() + nyu.m37147f(1, this.f32864a.intValue());
        if (this.f32865b != null) {
            return b + nyu.m37145d(2, this.f32865b);
        }
        return b;
    }

    private ohi m38342b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32864a = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dH /*18*/:
                    if (this.f32865b == null) {
                        this.f32865b = new ohn();
                    }
                    nyt.m37101a(this.f32865b);
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
