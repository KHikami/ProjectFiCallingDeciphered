package p000;

public final class mws extends nyx<mws> {
    private static volatile mws[] f28621e;
    public mwp f28622a;
    public Long f28623b;
    public Float f28624c;
    public Float f28625d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33249b(nyt);
    }

    public static mws[] m33250d() {
        if (f28621e == null) {
            synchronized (nzc.c) {
                if (f28621e == null) {
                    f28621e = new mws[0];
                }
            }
        }
        return f28621e;
    }

    public mws() {
        this.f28623b = null;
        this.f28624c = null;
        this.f28625d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28622a != null) {
            nyu.b(1, this.f28622a);
        }
        if (this.f28623b != null) {
            nyu.b(2, this.f28623b.longValue());
        }
        if (this.f28625d != null) {
            nyu.a(3, this.f28625d.floatValue());
        }
        if (this.f28624c != null) {
            nyu.a(4, this.f28624c.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28622a != null) {
            b += nyu.d(1, this.f28622a);
        }
        if (this.f28623b != null) {
            b += nyu.f(2, this.f28623b.longValue());
        }
        if (this.f28625d != null) {
            this.f28625d.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.f28624c == null) {
            return b;
        }
        this.f28624c.floatValue();
        return b + (nyu.h(4) + 4);
    }

    private mws m33249b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28622a == null) {
                        this.f28622a = new mwp();
                    }
                    nyt.a(this.f28622a);
                    continue;
                case 16:
                    this.f28623b = Long.valueOf(nyt.e());
                    continue;
                case 29:
                    this.f28625d = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.f28624c = Float.valueOf(nyt.c());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
