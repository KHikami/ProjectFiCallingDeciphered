package p000;

public final class oqw extends nyx<oqw> {
    private static volatile oqw[] f33813l;
    public String f33814a;
    public String f33815b;
    public String f33816c;
    public String f33817d;
    public String f33818e;
    public oqu f33819f;
    public String f33820g;
    public String f33821h;
    public String f33822i;
    public oqu f33823j;
    public oqy[] f33824k;

    public /* synthetic */ nzf m39254a(nyt nyt) {
        return m39251b(nyt);
    }

    public static oqw[] m39252d() {
        if (f33813l == null) {
            synchronized (nzc.f31309c) {
                if (f33813l == null) {
                    f33813l = new oqw[0];
                }
            }
        }
        return f33813l;
    }

    public oqw() {
        m39253g();
    }

    private oqw m39253g() {
        this.f33814a = null;
        this.f33815b = null;
        this.f33816c = null;
        this.f33817d = null;
        this.f33818e = null;
        this.f33819f = null;
        this.f33820g = null;
        this.f33821h = null;
        this.f33822i = null;
        this.f33823j = null;
        this.f33824k = oqy.m39263d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39255a(nyu nyu) {
        if (this.f33815b != null) {
            nyu.m37170a(1, this.f33815b);
        }
        if (this.f33816c != null) {
            nyu.m37170a(2, this.f33816c);
        }
        if (this.f33819f != null) {
            nyu.m37182b(4, this.f33819f);
        }
        if (this.f33820g != null) {
            nyu.m37170a(5, this.f33820g);
        }
        if (this.f33822i != null) {
            nyu.m37170a(6, this.f33822i);
        }
        if (this.f33823j != null) {
            nyu.m37182b(7, this.f33823j);
        }
        if (this.f33821h != null) {
            nyu.m37170a(8, this.f33821h);
        }
        if (this.f33824k != null && this.f33824k.length > 0) {
            for (nzf nzf : this.f33824k) {
                if (nzf != null) {
                    nyu.m37182b(9, nzf);
                }
            }
        }
        if (this.f33814a != null) {
            nyu.m37170a(10, this.f33814a);
        }
        if (this.f33817d != null) {
            nyu.m37170a(11, this.f33817d);
        }
        if (this.f33818e != null) {
            nyu.m37170a(12, this.f33818e);
        }
        super.a(nyu);
    }

    protected int m39256b() {
        int b = super.b();
        if (this.f33815b != null) {
            b += nyu.m37137b(1, this.f33815b);
        }
        if (this.f33816c != null) {
            b += nyu.m37137b(2, this.f33816c);
        }
        if (this.f33819f != null) {
            b += nyu.m37145d(4, this.f33819f);
        }
        if (this.f33820g != null) {
            b += nyu.m37137b(5, this.f33820g);
        }
        if (this.f33822i != null) {
            b += nyu.m37137b(6, this.f33822i);
        }
        if (this.f33823j != null) {
            b += nyu.m37145d(7, this.f33823j);
        }
        if (this.f33821h != null) {
            b += nyu.m37137b(8, this.f33821h);
        }
        if (this.f33824k != null && this.f33824k.length > 0) {
            int i = b;
            for (nzf nzf : this.f33824k) {
                if (nzf != null) {
                    i += nyu.m37145d(9, nzf);
                }
            }
            b = i;
        }
        if (this.f33814a != null) {
            b += nyu.m37137b(10, this.f33814a);
        }
        if (this.f33817d != null) {
            b += nyu.m37137b(11, this.f33817d);
        }
        if (this.f33818e != null) {
            return b + nyu.m37137b(12, this.f33818e);
        }
        return b;
    }

    private oqw m39251b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33815b = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33816c = nyt.m37117j();
                    continue;
                case 34:
                    if (this.f33819f == null) {
                        this.f33819f = new oqu();
                    }
                    nyt.m37101a(this.f33819f);
                    continue;
                case 42:
                    this.f33820g = nyt.m37117j();
                    continue;
                case 50:
                    this.f33822i = nyt.m37117j();
                    continue;
                case 58:
                    if (this.f33823j == null) {
                        this.f33823j = new oqu();
                    }
                    nyt.m37101a(this.f33823j);
                    continue;
                case 66:
                    this.f33821h = nyt.m37117j();
                    continue;
                case 74:
                    int b = nzl.m37265b(nyt, 74);
                    if (this.f33824k == null) {
                        a = 0;
                    } else {
                        a = this.f33824k.length;
                    }
                    Object obj = new oqy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33824k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqy();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqy();
                    nyt.m37101a(obj[a]);
                    this.f33824k = obj;
                    continue;
                case 82:
                    this.f33814a = nyt.m37117j();
                    continue;
                case 90:
                    this.f33817d = nyt.m37117j();
                    continue;
                case 98:
                    this.f33818e = nyt.m37117j();
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
