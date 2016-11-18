package defpackage;

public final class oot extends nyx<oot> {
    private static volatile oot[] k;
    public String a;
    public String b;
    public oou c;
    public String d;
    public String e;
    public String f;
    public oqu g;
    public String h;
    public String i;
    public String j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oot[] d() {
        if (k == null) {
            synchronized (nzc.c) {
                if (k == null) {
                    k = new oot[0];
                }
            }
        }
        return k;
    }

    public oot() {
        g();
    }

    private oot g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.g != null) {
            nyu.b(6, this.g);
        }
        if (this.h != null) {
            nyu.a(7, this.h);
        }
        if (this.i != null) {
            nyu.a(8, this.i);
        }
        if (this.f != null) {
            nyu.a(9, this.f);
        }
        if (this.j != null) {
            nyu.a(10, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.g != null) {
            b += nyu.d(6, this.g);
        }
        if (this.h != null) {
            b += nyu.b(7, this.h);
        }
        if (this.i != null) {
            b += nyu.b(8, this.i);
        }
        if (this.f != null) {
            b += nyu.b(9, this.f);
        }
        if (this.j != null) {
            return b + nyu.b(10, this.j);
        }
        return b;
    }

    private oot b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new oou();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    if (this.g == null) {
                        this.g = new oqu();
                    }
                    nyt.a(this.g);
                    continue;
                case 58:
                    this.h = nyt.j();
                    continue;
                case 66:
                    this.i = nyt.j();
                    continue;
                case 74:
                    this.f = nyt.j();
                    continue;
                case 82:
                    this.j = nyt.j();
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
