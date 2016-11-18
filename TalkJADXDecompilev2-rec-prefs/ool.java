package p000;

public final class ool extends nyx<ool> {
    private static volatile ool[] f33407d;
    public Integer f33408a;
    public Long f33409b;
    public onp f33410c;

    public /* synthetic */ nzf m38920a(nyt nyt) {
        return m38918b(nyt);
    }

    public static ool[] m38919d() {
        if (f33407d == null) {
            synchronized (nzc.f31309c) {
                if (f33407d == null) {
                    f33407d = new ool[0];
                }
            }
        }
        return f33407d;
    }

    public ool() {
        this.f33408a = null;
        this.f33409b = null;
        this.cachedSize = -1;
    }

    public void m38921a(nyu nyu) {
        if (this.f33408a != null) {
            nyu.m37168a(1, this.f33408a.intValue());
        }
        if (this.f33409b != null) {
            nyu.m37181b(2, this.f33409b.longValue());
        }
        if (this.f33410c != null) {
            nyu.m37182b(3, this.f33410c);
        }
        super.a(nyu);
    }

    protected int m38922b() {
        int b = super.b();
        if (this.f33408a != null) {
            b += nyu.m37147f(1, this.f33408a.intValue());
        }
        if (this.f33409b != null) {
            b += nyu.m37148f(2, this.f33409b.longValue());
        }
        if (this.f33410c != null) {
            return b + nyu.m37145d(3, this.f33410c);
        }
        return b;
    }

    private ool m38918b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33408a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f33409b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    if (this.f33410c == null) {
                        this.f33410c = new onp();
                    }
                    nyt.m37101a(this.f33410c);
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
