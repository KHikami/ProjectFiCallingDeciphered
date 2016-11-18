package p000;

public final class kpw extends nyx<kpw> {
    private static volatile kpw[] f22704j;
    public kqd f22705a;
    public String f22706b;
    public String f22707c;
    public String f22708d;
    public String f22709e;
    public Boolean f22710f;
    public String[] f22711g;
    public krg[] f22712h;
    public Integer f22713i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26984b(nyt);
    }

    public static kpw[] m26985d() {
        if (f22704j == null) {
            synchronized (nzc.c) {
                if (f22704j == null) {
                    f22704j = new kpw[0];
                }
            }
        }
        return f22704j;
    }

    public kpw() {
        m26986g();
    }

    private kpw m26986g() {
        this.f22705a = null;
        this.f22706b = null;
        this.f22707c = null;
        this.f22708d = null;
        this.f22709e = null;
        this.f22710f = null;
        this.f22711g = nzl.f;
        this.f22712h = krg.m27178d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22705a != null) {
            nyu.b(1, this.f22705a);
        }
        if (this.f22706b != null) {
            nyu.a(2, this.f22706b);
        }
        if (this.f22707c != null) {
            nyu.a(3, this.f22707c);
        }
        if (this.f22708d != null) {
            nyu.a(4, this.f22708d);
        }
        if (this.f22709e != null) {
            nyu.a(5, this.f22709e);
        }
        if (this.f22710f != null) {
            nyu.a(6, this.f22710f.booleanValue());
        }
        if (this.f22711g != null && this.f22711g.length > 0) {
            for (String str : this.f22711g) {
                if (str != null) {
                    nyu.a(7, str);
                }
            }
        }
        if (this.f22712h != null && this.f22712h.length > 0) {
            while (i < this.f22712h.length) {
                nzf nzf = this.f22712h[i];
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
                i++;
            }
        }
        if (this.f22713i != null) {
            nyu.a(9, this.f22713i.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22705a != null) {
            b += nyu.d(1, this.f22705a);
        }
        if (this.f22706b != null) {
            b += nyu.b(2, this.f22706b);
        }
        if (this.f22707c != null) {
            b += nyu.b(3, this.f22707c);
        }
        if (this.f22708d != null) {
            b += nyu.b(4, this.f22708d);
        }
        if (this.f22709e != null) {
            b += nyu.b(5, this.f22709e);
        }
        if (this.f22710f != null) {
            this.f22710f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f22711g != null && this.f22711g.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f22711g) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f22712h != null && this.f22712h.length > 0) {
            while (i < this.f22712h.length) {
                nzf nzf = this.f22712h[i];
                if (nzf != null) {
                    b += nyu.d(8, nzf);
                }
                i++;
            }
        }
        if (this.f22713i != null) {
            return b + nyu.f(9, this.f22713i.intValue());
        }
        return b;
    }

    private kpw m26984b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22705a == null) {
                        this.f22705a = new kqd();
                    }
                    nyt.a(this.f22705a);
                    continue;
                case wi.dH /*18*/:
                    this.f22706b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22707c = nyt.j();
                    continue;
                case 34:
                    this.f22708d = nyt.j();
                    continue;
                case 42:
                    this.f22709e = nyt.j();
                    continue;
                case 48:
                    this.f22710f = Boolean.valueOf(nyt.i());
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    a = this.f22711g == null ? 0 : this.f22711g.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22711g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22711g = obj;
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.f22712h == null) {
                        a = 0;
                    } else {
                        a = this.f22712h.length;
                    }
                    obj = new krg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22712h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new krg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new krg();
                    nyt.a(obj[a]);
                    this.f22712h = obj;
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f22713i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
