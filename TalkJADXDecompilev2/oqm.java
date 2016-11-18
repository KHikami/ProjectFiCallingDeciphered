package defpackage;

public final class oqm extends nyx<oqm> {
    private static volatile oqm[] f;
    public String a;
    public oqu b;
    public oqv[] c;
    public oqv d;
    public oqo[] e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oqm[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new oqm[0];
                }
            }
        }
        return f;
    }

    public oqm() {
        g();
    }

    private oqm g() {
        this.a = null;
        this.b = null;
        this.c = oqv.d();
        this.d = null;
        this.e = oqo.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
                i++;
            }
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
            b += nyu.d(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            int i2 = b;
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    b += nyu.d(5, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private oqm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new oqu();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new oqv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oqv();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new oqv();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new oqo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqo();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oqo();
                    nyt.a(obj[a]);
                    this.e = obj;
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
