package defpackage;

public final class ocx extends nyx<ocx> {
    private static volatile ocx[] d;
    public Long a;
    public String b;
    public String c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ocx[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new ocx[0];
                }
            }
        }
        return d;
    }

    public ocx() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.b(1, this.a.longValue());
        nyu.a(2, this.b);
        nyu.a(3, this.c);
        super.a(nyu);
    }

    protected int b() {
        return ((super.b() + nyu.f(1, this.a.longValue())) + nyu.b(2, this.b)) + nyu.b(3, this.c);
    }

    private ocx b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
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
