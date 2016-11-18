package defpackage;

public final class kqp extends nyx<kqp> {
    private static volatile kqp[] k;
    public String a;
    public String b;
    public String c;
    public Integer d;
    public Integer e;
    public String f;
    public Boolean g;
    public String h;
    public Integer i;
    public Integer j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kqp[] d() {
        if (k == null) {
            synchronized (nzc.c) {
                if (k == null) {
                    k = new kqp[0];
                }
            }
        }
        return k;
    }

    public kqp() {
        g();
    }

    private kqp g() {
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
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.a(9, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j.intValue());
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
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            b += nyu.f(9, this.i.intValue());
        }
        if (this.j != null) {
            return b + nyu.f(10, this.j.intValue());
        }
        return b;
    }

    private kqp b(nyt nyt) {
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
                    this.c = nyt.j();
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    this.h = nyt.j();
                    continue;
                case 72:
                    this.i = Integer.valueOf(nyt.f());
                    continue;
                case 80:
                    this.j = Integer.valueOf(nyt.f());
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
