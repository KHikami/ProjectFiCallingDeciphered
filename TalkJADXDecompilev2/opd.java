package defpackage;

public final class opd extends nyx<opd> {
    private static volatile opd[] k;
    public String a;
    public String[] b;
    public oqu c;
    public Integer d;
    public String e;
    public Double f;
    public Double g;
    public Integer h;
    public Integer i;
    public Float j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static opd[] d() {
        if (k == null) {
            synchronized (nzc.c) {
                if (k == null) {
                    k = new opd[0];
                }
            }
        }
        return k;
    }

    public opd() {
        g();
    }

    private opd g() {
        this.a = null;
        this.b = nzl.f;
        this.c = null;
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
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null) {
            nyu.a(5, this.f.doubleValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (String str : this.b) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.g != null) {
            nyu.a(7, this.g.doubleValue());
        }
        if (this.h != null) {
            nyu.b(8, this.h.intValue());
        }
        if (this.i != null) {
            nyu.b(9, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j.floatValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.d != null) {
            b += nyu.f(3, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null) {
            this.f.doubleValue();
            b += nyu.h(5) + 8;
        }
        if (this.b != null && this.b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.b.length) {
                String str = this.b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.g != null) {
            this.g.doubleValue();
            b += nyu.h(7) + 8;
        }
        if (this.h != null) {
            this.h.intValue();
            b += nyu.h(8) + 4;
        }
        if (this.i != null) {
            this.i.intValue();
            b += nyu.h(9) + 4;
        }
        if (this.j == null) {
            return b;
        }
        this.j.floatValue();
        return b + (nyu.h(10) + 4);
    }

    private opd b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new oqu();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.e = nyt.j();
                    continue;
                case 41:
                    this.f = Double.valueOf(nyt.b());
                    continue;
                case 50:
                    int b = nzl.b(nyt, 50);
                    a = this.b == null ? 0 : this.b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.b = obj;
                    continue;
                case 57:
                    this.g = Double.valueOf(nyt.b());
                    continue;
                case 69:
                    this.h = Integer.valueOf(nyt.h());
                    continue;
                case 77:
                    this.i = Integer.valueOf(nyt.h());
                    continue;
                case 85:
                    this.j = Float.valueOf(nyt.c());
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
