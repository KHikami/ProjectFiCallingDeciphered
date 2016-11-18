package defpackage;

public final class nfl extends nyx<nfl> {
    private static volatile nfl[] f;
    public njr a;
    public Float b;
    public String c;
    public nfn d;
    public npv e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nfl[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new nfl[0];
                }
            }
        }
        return f;
    }

    public nfl() {
        g();
    }

    private nfl g() {
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
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.floatValue());
        }
        if (this.e != null) {
            nyu.b(3, this.e);
        }
        if (this.c != null) {
            nyu.a(4, this.c);
        }
        if (this.d != null) {
            nyu.b(5, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            this.b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.e != null) {
            b += nyu.d(3, this.e);
        }
        if (this.c != null) {
            b += nyu.b(4, this.c);
        }
        if (this.d != null) {
            return b + nyu.d(5, this.d);
        }
        return b;
    }

    private nfl b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new njr();
                    }
                    nyt.a(this.a);
                    continue;
                case 21:
                    this.b = Float.valueOf(nyt.c());
                    continue;
                case wi.dx /*26*/:
                    if (this.e == null) {
                        this.e = new npv();
                    }
                    nyt.a(this.e);
                    continue;
                case 34:
                    this.c = nyt.j();
                    continue;
                case 42:
                    if (this.d == null) {
                        this.d = new nfn();
                    }
                    nyt.a(this.d);
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
