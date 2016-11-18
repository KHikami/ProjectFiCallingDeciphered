package defpackage;

public final class kut extends nyx<kut> {
    private static volatile kut[] f;
    public Double a;
    public Double b;
    public String c;
    public String d;
    public String e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kut[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new kut[0];
                }
            }
        }
        return f;
    }

    public kut() {
        g();
    }

    private kut g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.doubleValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.doubleValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.b != null) {
            this.b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            return b + nyu.b(5, this.e);
        }
        return b;
    }

    private kut b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.b = Double.valueOf(nyt.b());
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
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
