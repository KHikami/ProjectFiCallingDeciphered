package defpackage;

public final class ohr extends nyx<ohr> {
    private static volatile ohr[] g;
    public String a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public ohs e;
    public ohu f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ohr[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new ohr[0];
                }
            }
        }
        return g;
    }

    public ohr() {
        g();
    }

    private ohr g() {
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
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(8, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(10, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(12, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.b(13, this.e);
        }
        if (this.f != null) {
            nyu.b(101, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.e != null) {
            b += nyu.d(13, this.e);
        }
        if (this.f != null) {
            return b + nyu.d(101, this.f);
        }
        return b;
    }

    private ohr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 64:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 96:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    if (this.e == null) {
                        this.e = new ohs();
                    }
                    nyt.a(this.e);
                    continue;
                case 810:
                    if (this.f == null) {
                        this.f = new ohu();
                    }
                    nyt.a(this.f);
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
