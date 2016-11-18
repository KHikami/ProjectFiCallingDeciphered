package p000;

public final class ohn extends nyx<ohn> {
    private static volatile ohn[] f32893c;
    public Long f32894a;
    public Long f32895b;

    public /* synthetic */ nzf m38368a(nyt nyt) {
        return m38366b(nyt);
    }

    public static ohn[] m38367d() {
        if (f32893c == null) {
            synchronized (nzc.f31309c) {
                if (f32893c == null) {
                    f32893c = new ohn[0];
                }
            }
        }
        return f32893c;
    }

    public ohn() {
        this.f32894a = null;
        this.f32895b = null;
        this.cachedSize = -1;
    }

    public void m38369a(nyu nyu) {
        nyu.m37181b(1, this.f32894a.longValue());
        nyu.m37181b(2, this.f32895b.longValue());
        super.a(nyu);
    }

    protected int m38370b() {
        return (super.b() + nyu.m37148f(1, this.f32894a.longValue())) + nyu.m37148f(2, this.f32895b.longValue());
    }

    private ohn m38366b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32894a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f32895b = Long.valueOf(nyt.m37110e());
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
