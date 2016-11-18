package defpackage;

public final class mxq extends nyx<mxq> {
    public Integer a;
    public mxe[] b;
    public long[] c;
    public boolean[] d;
    public mxf[] e;
    public String f;
    public String g;
    public mxr h;
    public Integer i;
    public Integer j;
    public mze k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mxq() {
        d();
    }

    private mxq d() {
        this.a = null;
        this.b = mxe.d();
        this.c = nzl.b;
        this.d = nzl.e;
        this.e = mxf.d();
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f != null) {
            nyu.a(2, this.f);
        }
        if (this.h != null) {
            nyu.b(3, this.h);
        }
        if (this.i != null) {
            nyu.a(4, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(5, this.j.intValue());
        }
        if (this.a != null) {
            nyu.a(6, this.a.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (long b : this.c) {
                nyu.b(7, b);
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (boolean a : this.d) {
                nyu.a(8, a);
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    nyu.b(9, nzf2);
                }
                i++;
            }
        }
        if (this.g != null) {
            nyu.a(10, this.g);
        }
        if (this.k != null) {
            nyu.b(11, this.k);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f != null) {
            b += nyu.b(2, this.f);
        }
        if (this.h != null) {
            b += nyu.d(3, this.h);
        }
        if (this.i != null) {
            b += nyu.f(4, this.i.intValue());
        }
        if (this.j != null) {
            b += nyu.f(5, this.j.intValue());
        }
        if (this.a != null) {
            b += nyu.f(6, this.a.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            int i3 = 0;
            for (long f : this.c) {
                i3 += nyu.f(f);
            }
            b = (b + i3) + (this.c.length * 1);
        }
        if (this.d != null && this.d.length > 0) {
            b = (b + (this.d.length * 1)) + (this.d.length * 1);
        }
        if (this.e != null && this.e.length > 0) {
            while (i2 < this.e.length) {
                nzf nzf2 = this.e[i2];
                if (nzf2 != null) {
                    b += nyu.d(9, nzf2);
                }
                i2++;
            }
        }
        if (this.g != null) {
            b += nyu.b(10, this.g);
        }
        if (this.k != null) {
            return b + nyu.d(11, this.k);
        }
        return b;
    }

    private mxq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int d;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new mxe[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxe();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mxe();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.h == null) {
                        this.h = new mxr();
                    }
                    nyt.a(this.h);
                    continue;
                case 32:
                    this.i = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.j = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    b = nzl.b(nyt, 56);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.c = obj;
                    continue;
                case 58:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.c == null ? 0 : this.c.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.c = obj2;
                    nyt.e(d);
                    continue;
                case 64:
                    b = nzl.b(nyt, 64);
                    a = this.d == null ? 0 : this.d.length;
                    obj = new boolean[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.i();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.i();
                    this.d = obj;
                    continue;
                case 66:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.i();
                        a++;
                    }
                    nyt.f(b);
                    b = this.d == null ? 0 : this.d.length;
                    obj2 = new boolean[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.d, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.i();
                        b++;
                    }
                    this.d = obj2;
                    nyt.e(d);
                    continue;
                case 74:
                    b = nzl.b(nyt, 74);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new mxf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mxf();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 82:
                    this.g = nyt.j();
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new mze();
                    }
                    nyt.a(this.k);
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
