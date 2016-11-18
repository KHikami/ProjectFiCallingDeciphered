package defpackage;

public final class ohi extends nyx<ohi> {
    private static volatile ohi[] c;
    public Integer a;
    public ohn b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ohi[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new ohi[0];
                }
            }
        }
        return c;
    }

    public ohi() {
        this.a = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.intValue());
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b() + nyu.f(1, this.a.intValue());
        if (this.b != null) {
            return b + nyu.d(2, this.b);
        }
        return b;
    }

    private ohi b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new ohn();
                    }
                    nyt.a(this.b);
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
