package defpackage;

public final class lmk extends nyx<lmk> {
    private static volatile lmk[] g;
    public Integer a;
    public Integer b;
    public Integer c;
    public String d;
    public byte[] e;
    public Integer f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lmk[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new lmk[0];
                }
            }
        }
        return g;
    }

    public lmk() {
        g();
    }

    private lmk g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.c(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.c(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.c(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.c(6, this.f.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.g(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.g(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.g(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            return b + nyu.g(6, this.f.intValue());
        }
        return b;
    }

    private lmk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.l());
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.l());
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.k();
                    continue;
                case 48:
                    this.f = Integer.valueOf(nyt.l());
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
