package defpackage;

public final class ooh extends nyx<ooh> {
    private static volatile ooh[] d;
    public Integer a;
    public Integer b;
    public onp c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ooh[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new ooh[0];
                }
            }
        }
        return d;
    }

    public ooh() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.d(3, this.c);
        }
        return b;
    }

    private ooh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new onp();
                    }
                    nyt.a(this.c);
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
