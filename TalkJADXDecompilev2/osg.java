package defpackage;

public final class osg extends nyx<osg> {
    private static volatile osg[] h;
    public oox a;
    public Boolean b;
    public String c;
    public Integer d;
    public osg[] e;
    public osf[] f;
    public Integer g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static osg[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new osg[0];
                }
            }
        }
        return h;
    }

    public osg() {
        g();
    }

    private osg g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = osg.d();
        this.f = osf.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf2 = this.f[i];
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
                i++;
            }
        }
        if (this.g != null) {
            nyu.a(6, this.g.intValue());
        }
        if (this.b != null) {
            nyu.a(7, this.b.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null) {
            b += nyu.f(3, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            int i2 = b;
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    i2 += nyu.d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf2 = this.f[i];
                if (nzf2 != null) {
                    b += nyu.d(5, nzf2);
                }
                i++;
            }
        }
        if (this.g != null) {
            b += nyu.f(6, this.g.intValue());
        }
        if (this.b == null) {
            return b;
        }
        this.b.booleanValue();
        return b + (nyu.h(7) + 1);
    }

    private osg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oox();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new osg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new osg();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new osf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new osf();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    this.b = Boolean.valueOf(nyt.i());
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
