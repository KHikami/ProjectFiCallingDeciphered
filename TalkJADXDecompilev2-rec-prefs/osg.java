package p000;

public final class osg extends nyx<osg> {
    private static volatile osg[] f34124h;
    public oox f34125a;
    public Boolean f34126b;
    public String f34127c;
    public Integer f34128d;
    public osg[] f34129e;
    public osf[] f34130f;
    public Integer f34131g;

    public /* synthetic */ nzf m39554a(nyt nyt) {
        return m39551b(nyt);
    }

    public static osg[] m39552d() {
        if (f34124h == null) {
            synchronized (nzc.f31309c) {
                if (f34124h == null) {
                    f34124h = new osg[0];
                }
            }
        }
        return f34124h;
    }

    public osg() {
        m39553g();
    }

    private osg m39553g() {
        this.f34125a = null;
        this.f34126b = null;
        this.f34127c = null;
        this.f34128d = null;
        this.f34129e = osg.m39552d();
        this.f34130f = osf.m39546d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39555a(nyu nyu) {
        int i = 0;
        if (this.f34125a != null) {
            nyu.m37182b(1, this.f34125a);
        }
        if (this.f34127c != null) {
            nyu.m37170a(2, this.f34127c);
        }
        if (this.f34128d != null) {
            nyu.m37168a(3, this.f34128d.intValue());
        }
        if (this.f34129e != null && this.f34129e.length > 0) {
            for (nzf nzf : this.f34129e) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        if (this.f34130f != null && this.f34130f.length > 0) {
            while (i < this.f34130f.length) {
                nzf nzf2 = this.f34130f[i];
                if (nzf2 != null) {
                    nyu.m37182b(5, nzf2);
                }
                i++;
            }
        }
        if (this.f34131g != null) {
            nyu.m37168a(6, this.f34131g.intValue());
        }
        if (this.f34126b != null) {
            nyu.m37172a(7, this.f34126b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39556b() {
        int i = 0;
        int b = super.b();
        if (this.f34125a != null) {
            b += nyu.m37145d(1, this.f34125a);
        }
        if (this.f34127c != null) {
            b += nyu.m37137b(2, this.f34127c);
        }
        if (this.f34128d != null) {
            b += nyu.m37147f(3, this.f34128d.intValue());
        }
        if (this.f34129e != null && this.f34129e.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f34129e) {
                if (nzf != null) {
                    i2 += nyu.m37145d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.f34130f != null && this.f34130f.length > 0) {
            while (i < this.f34130f.length) {
                nzf nzf2 = this.f34130f[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(5, nzf2);
                }
                i++;
            }
        }
        if (this.f34131g != null) {
            b += nyu.m37147f(6, this.f34131g.intValue());
        }
        if (this.f34126b == null) {
            return b;
        }
        this.f34126b.booleanValue();
        return b + (nyu.m37154h(7) + 1);
    }

    private osg m39551b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34125a == null) {
                        this.f34125a = new oox();
                    }
                    nyt.m37101a(this.f34125a);
                    continue;
                case wi.dH /*18*/:
                    this.f34127c = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f34128d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f34129e == null) {
                        a = 0;
                    } else {
                        a = this.f34129e.length;
                    }
                    obj = new osg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34129e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osg();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osg();
                    nyt.m37101a(obj[a]);
                    this.f34129e = obj;
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f34130f == null) {
                        a = 0;
                    } else {
                        a = this.f34130f.length;
                    }
                    obj = new osf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34130f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osf();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osf();
                    nyt.m37101a(obj[a]);
                    this.f34130f = obj;
                    continue;
                case 48:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f34131g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    this.f34126b = Boolean.valueOf(nyt.m37116i());
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
