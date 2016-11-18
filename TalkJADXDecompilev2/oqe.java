package defpackage;

public final class oqe extends nyx<oqe> {
    public oso a;
    public oqf[] b;
    public oqu c;
    public int[] d;
    public Integer e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oqe() {
        d();
    }

    private oqe d() {
        this.a = null;
        this.b = oqf.d();
        this.c = null;
        this.d = nzl.a;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nyu.a(4, this.d[i]);
                i++;
            }
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            i = 0;
            while (i2 < this.d.length) {
                i += nyu.g(this.d[i2]);
                i2++;
            }
            b = (b + i) + (this.d.length * 1);
        }
        if (this.e != null) {
            return b + nyu.f(5, this.e.intValue());
        }
        return b;
    }

    private oqe b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oso();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new oqf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oqf();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new oqu();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    b = nzl.b(nyt, 32);
                    a = this.d == null ? 0 : this.d.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.d = obj;
                    continue;
                case 34:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.d == null ? 0 : this.d.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.d, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.d = obj2;
                    nyt.e(d);
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
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
