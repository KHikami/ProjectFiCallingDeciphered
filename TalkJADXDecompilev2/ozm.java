package defpackage;

public final class ozm extends nyx<ozm> {
    public oya[] a;
    public oya[] b;
    public boolean[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ozm() {
        d();
    }

    private ozm d() {
        this.a = oya.d();
        this.b = oya.d();
        this.c = nzl.e;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf2 : this.b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nyu.a(3, this.c[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i2 += nyu.d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nzf nzf2 = this.b[i];
                if (nzf2 != null) {
                    b += nyu.d(2, nzf2);
                }
                i++;
            }
        }
        if (this.c == null || this.c.length <= 0) {
            return b;
        }
        return (b + (this.c.length * 1)) + (this.c.length * 1);
    }

    private ozm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new oya[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oya();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oya();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new oya[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oya();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oya();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new boolean[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.i();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.i();
                    this.c = obj;
                    continue;
                case wi.dx /*26*/:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.i();
                        a++;
                    }
                    nyt.f(b);
                    b = this.c == null ? 0 : this.c.length;
                    Object obj2 = new boolean[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.i();
                        b++;
                    }
                    this.c = obj2;
                    nyt.e(d);
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
