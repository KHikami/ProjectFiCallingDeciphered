package defpackage;

public final class lya extends nyx<lya> {
    private static volatile lya[] l;
    public String a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public String[] f;
    public String g;
    public Integer h;
    public String i;
    public String j;
    public Integer k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lya[] d() {
        if (l == null) {
            synchronized (nzc.c) {
                if (l == null) {
                    l = new lya[0];
                }
            }
        }
        return l;
    }

    public lya() {
        g();
    }

    private lya g() {
        this.a = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = nzl.f;
        this.g = null;
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
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (String str : this.f) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h.intValue());
        }
        if (this.i != null) {
            nyu.a(9, this.i);
        }
        if (this.j != null) {
            nyu.a(10, this.j);
        }
        if (this.k != null) {
            nyu.a(11, this.k.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f.length) {
                String str = this.f[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.h != null) {
            b += nyu.f(8, this.h.intValue());
        }
        if (this.i != null) {
            b += nyu.b(9, this.i);
        }
        if (this.j != null) {
            b += nyu.b(10, this.j);
        }
        if (this.k != null) {
            return b + nyu.f(11, this.k.intValue());
        }
        return b;
    }

    private lya b(nyt nyt) {
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
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    int b = nzl.b(nyt, 50);
                    a = this.f == null ? 0 : this.f.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f = obj;
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 74:
                    this.i = nyt.j();
                    continue;
                case 82:
                    this.j = nyt.j();
                    continue;
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
