package defpackage;

public final class oqu extends nyx<oqu> {
    private static volatile oqu[] i;
    public String a;
    public String b;
    public String c;
    public String d;
    public Integer e;
    public opf f;
    public String g;
    public String h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oqu[] d() {
        if (i == null) {
            synchronized (nzc.c) {
                if (i == null) {
                    i = new oqu[0];
                }
            }
        }
        return i;
    }

    public oqu() {
        g();
    }

    private oqu g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.d != null) {
            nyu.a(2, this.d);
        }
        if (this.e != null) {
            nyu.a(3, this.e.intValue());
        }
        if (this.f != null) {
            nyu.b(4, this.f);
        }
        if (this.g != null) {
            nyu.a(5, this.g);
        }
        if (this.h != null) {
            nyu.a(6, this.h);
        }
        if (this.b != null) {
            nyu.a(7, this.b);
        }
        if (this.c != null) {
            nyu.a(8, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.d != null) {
            b += nyu.b(2, this.d);
        }
        if (this.e != null) {
            b += nyu.f(3, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.d(4, this.f);
        }
        if (this.g != null) {
            b += nyu.b(5, this.g);
        }
        if (this.h != null) {
            b += nyu.b(6, this.h);
        }
        if (this.b != null) {
            b += nyu.b(7, this.b);
        }
        if (this.c != null) {
            return b + nyu.b(8, this.c);
        }
        return b;
    }

    private oqu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.d = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f == null) {
                        this.f = new opf();
                    }
                    nyt.a(this.f);
                    continue;
                case 42:
                    this.g = nyt.j();
                    continue;
                case 50:
                    this.h = nyt.j();
                    continue;
                case 58:
                    this.b = nyt.j();
                    continue;
                case 66:
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
