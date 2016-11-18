package defpackage;

public final class oqv extends nyx<oqv> {
    private static volatile oqv[] d;
    public String a;
    public oqu b;
    public String c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oqv[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new oqv[0];
                }
            }
        }
        return d;
    }

    public oqv() {
        g();
    }

    private oqv g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            return b + nyu.b(3, this.c);
        }
        return b;
    }

    private oqv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new oqu();
                    }
                    nyt.a(this.b);
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
