package defpackage;

public final class jbg extends nzf {
    private static volatile jbg[] F;
    public jbf[] A;
    public boolean B;
    public String C;
    public boolean D;
    public boolean E;
    public jbi a;
    public jbi b;
    public jbi c;
    public jbi d;
    public jbi e;
    public jbi f;
    public jbi g;
    public jbi h;
    public jbi i;
    public jbi j;
    public jbi k;
    public jbi l;
    public jbi m;
    public jbi n;
    public jbi o;
    public jbi p;
    public String q;
    public int r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public boolean y;
    public jbf[] z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static jbg[] d() {
        if (F == null) {
            synchronized (nzc.c) {
                if (F == null) {
                    F = new jbg[0];
                }
            }
        }
        return F;
    }

    public jbg() {
        e();
    }

    private jbg e() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = "";
        this.r = 0;
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = "";
        this.w = "";
        this.x = "";
        this.y = false;
        this.z = jbf.d();
        this.A = jbf.d();
        this.B = false;
        this.C = "";
        this.D = false;
        this.E = false;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.b(8, this.h);
        }
        nyu.a(9, this.q);
        if (this.r != 0) {
            nyu.a(10, this.r);
        }
        if (!this.s.equals("")) {
            nyu.a(11, this.s);
        }
        if (!this.u.equals("")) {
            nyu.a(12, this.u);
        }
        if (!this.v.equals("")) {
            nyu.a(13, this.v);
        }
        if (!this.w.equals("")) {
            nyu.a(15, this.w);
        }
        if (!this.x.equals("")) {
            nyu.a(16, this.x);
        }
        if (!this.t.equals("")) {
            nyu.a(17, this.t);
        }
        if (this.y) {
            nyu.a(18, this.y);
        }
        if (this.z != null && this.z.length > 0) {
            for (nzf nzf : this.z) {
                if (nzf != null) {
                    nyu.b(19, nzf);
                }
            }
        }
        if (this.A != null && this.A.length > 0) {
            while (i < this.A.length) {
                nzf nzf2 = this.A[i];
                if (nzf2 != null) {
                    nyu.b(20, nzf2);
                }
                i++;
            }
        }
        if (this.i != null) {
            nyu.b(21, this.i);
        }
        if (this.B) {
            nyu.a(22, this.B);
        }
        if (!this.C.equals("")) {
            nyu.a(23, this.C);
        }
        if (this.p != null) {
            nyu.b(24, this.p);
        }
        if (this.j != null) {
            nyu.b(25, this.j);
        }
        if (this.D) {
            nyu.a(26, this.D);
        }
        if (this.k != null) {
            nyu.b(27, this.k);
        }
        if (this.l != null) {
            nyu.b(28, this.l);
        }
        if (this.m != null) {
            nyu.b(29, this.m);
        }
        if (this.n != null) {
            nyu.b(30, this.n);
        }
        if (this.o != null) {
            nyu.b(31, this.o);
        }
        if (this.E) {
            nyu.a(32, this.E);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            b += nyu.d(8, this.h);
        }
        b += nyu.b(9, this.q);
        if (this.r != 0) {
            b += nyu.f(10, this.r);
        }
        if (!this.s.equals("")) {
            b += nyu.b(11, this.s);
        }
        if (!this.u.equals("")) {
            b += nyu.b(12, this.u);
        }
        if (!this.v.equals("")) {
            b += nyu.b(13, this.v);
        }
        if (!this.w.equals("")) {
            b += nyu.b(15, this.w);
        }
        if (!this.x.equals("")) {
            b += nyu.b(16, this.x);
        }
        if (!this.t.equals("")) {
            b += nyu.b(17, this.t);
        }
        if (this.y) {
            b += nyu.b(18, this.y);
        }
        if (this.z != null && this.z.length > 0) {
            int i2 = b;
            for (nzf nzf : this.z) {
                if (nzf != null) {
                    i2 += nyu.d(19, nzf);
                }
            }
            b = i2;
        }
        if (this.A != null && this.A.length > 0) {
            while (i < this.A.length) {
                nzf nzf2 = this.A[i];
                if (nzf2 != null) {
                    b += nyu.d(20, nzf2);
                }
                i++;
            }
        }
        if (this.i != null) {
            b += nyu.d(21, this.i);
        }
        if (this.B) {
            b += nyu.b(22, this.B);
        }
        if (!this.C.equals("")) {
            b += nyu.b(23, this.C);
        }
        if (this.p != null) {
            b += nyu.d(24, this.p);
        }
        if (this.j != null) {
            b += nyu.d(25, this.j);
        }
        if (this.D) {
            b += nyu.b(26, this.D);
        }
        if (this.k != null) {
            b += nyu.d(27, this.k);
        }
        if (this.l != null) {
            b += nyu.d(28, this.l);
        }
        if (this.m != null) {
            b += nyu.d(29, this.m);
        }
        if (this.n != null) {
            b += nyu.d(30, this.n);
        }
        if (this.o != null) {
            b += nyu.d(31, this.o);
        }
        if (this.E) {
            return b + nyu.b(32, this.E);
        }
        return b;
    }

    private jbg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new jbi();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new jbi();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new jbi();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new jbi();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new jbi();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new jbi();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new jbi();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new jbi();
                    }
                    nyt.a(this.h);
                    continue;
                case 74:
                    this.q = nyt.j();
                    continue;
                case 80:
                    this.r = nyt.f();
                    continue;
                case 90:
                    this.s = nyt.j();
                    continue;
                case 98:
                    this.u = nyt.j();
                    continue;
                case 106:
                    this.v = nyt.j();
                    continue;
                case 122:
                    this.w = nyt.j();
                    continue;
                case 130:
                    this.x = nyt.j();
                    continue;
                case 138:
                    this.t = nyt.j();
                    continue;
                case 144:
                    this.y = nyt.i();
                    continue;
                case 154:
                    b = nzl.b(nyt, 154);
                    if (this.z == null) {
                        a = 0;
                    } else {
                        a = this.z.length;
                    }
                    obj = new jbf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.z, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new jbf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new jbf();
                    nyt.a(obj[a]);
                    this.z = obj;
                    continue;
                case 162:
                    b = nzl.b(nyt, 162);
                    if (this.A == null) {
                        a = 0;
                    } else {
                        a = this.A.length;
                    }
                    obj = new jbf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.A, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new jbf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new jbf();
                    nyt.a(obj[a]);
                    this.A = obj;
                    continue;
                case 170:
                    if (this.i == null) {
                        this.i = new jbi();
                    }
                    nyt.a(this.i);
                    continue;
                case 176:
                    this.B = nyt.i();
                    continue;
                case 186:
                    this.C = nyt.j();
                    continue;
                case 194:
                    if (this.p == null) {
                        this.p = new jbi();
                    }
                    nyt.a(this.p);
                    continue;
                case 202:
                    if (this.j == null) {
                        this.j = new jbi();
                    }
                    nyt.a(this.j);
                    continue;
                case 208:
                    this.D = nyt.i();
                    continue;
                case 218:
                    if (this.k == null) {
                        this.k = new jbi();
                    }
                    nyt.a(this.k);
                    continue;
                case 226:
                    if (this.l == null) {
                        this.l = new jbi();
                    }
                    nyt.a(this.l);
                    continue;
                case 234:
                    if (this.m == null) {
                        this.m = new jbi();
                    }
                    nyt.a(this.m);
                    continue;
                case 242:
                    if (this.n == null) {
                        this.n = new jbi();
                    }
                    nyt.a(this.n);
                    continue;
                case 250:
                    if (this.o == null) {
                        this.o = new jbi();
                    }
                    nyt.a(this.o);
                    continue;
                case 256:
                    this.E = nyt.i();
                    continue;
                default:
                    if (!nzl.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
