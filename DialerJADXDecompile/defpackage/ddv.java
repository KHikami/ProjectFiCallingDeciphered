package defpackage;

/* compiled from: PG */
/* renamed from: ddv */
public final class ddv extends dem {
    private static volatile ddv[] s;
    private String A;
    private String B;
    private ddu[] C;
    private ddu[] D;
    private boolean E;
    private boolean F;
    private boolean G;
    public ddx a;
    public ddx b;
    public ddx c;
    public ddx d;
    public ddx e;
    public ddx f;
    public ddx g;
    public ddx h;
    public ddx i;
    public ddx j;
    public ddx k;
    public int l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public String q;
    private ddx t;
    private ddx u;
    private ddx v;
    private ddx w;
    private ddx x;
    private String y;
    private String z;

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            int b;
            Object obj;
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.m /*10*/:
                    if (this.a == null) {
                        this.a = new ddx();
                    }
                    dee.a(this.a);
                    continue;
                case rk.bW /*18*/:
                    if (this.b == null) {
                        this.b = new ddx();
                    }
                    dee.a(this.b);
                    continue;
                case rk.k /*26*/:
                    if (this.c == null) {
                        this.c = new ddx();
                    }
                    dee.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new ddx();
                    }
                    dee.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new ddx();
                    }
                    dee.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new ddx();
                    }
                    dee.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new ddx();
                    }
                    dee.a(this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new ddx();
                    }
                    dee.a(this.h);
                    continue;
                case 74:
                    this.y = dee.d();
                    continue;
                case 80:
                    this.l = dee.b();
                    continue;
                case 90:
                    this.m = dee.d();
                    continue;
                case 98:
                    this.A = dee.d();
                    continue;
                case 106:
                    this.B = dee.d();
                    continue;
                case 122:
                    this.n = dee.d();
                    continue;
                case 130:
                    this.o = dee.d();
                    continue;
                case 138:
                    this.z = dee.d();
                    continue;
                case 144:
                    this.p = dee.c();
                    continue;
                case 154:
                    b = dep.b(dee, 154);
                    if (this.C == null) {
                        a = 0;
                    } else {
                        a = this.C.length;
                    }
                    obj = new ddu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.C, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ddu();
                        dee.a(obj[a]);
                        dee.a();
                        a++;
                    }
                    obj[a] = new ddu();
                    dee.a(obj[a]);
                    this.C = obj;
                    continue;
                case 162:
                    b = dep.b(dee, 162);
                    if (this.D == null) {
                        a = 0;
                    } else {
                        a = this.D.length;
                    }
                    obj = new ddu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.D, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ddu();
                        dee.a(obj[a]);
                        dee.a();
                        a++;
                    }
                    obj[a] = new ddu();
                    dee.a(obj[a]);
                    this.D = obj;
                    continue;
                case 170:
                    if (this.i == null) {
                        this.i = new ddx();
                    }
                    dee.a(this.i);
                    continue;
                case 176:
                    this.E = dee.c();
                    continue;
                case 186:
                    this.q = dee.d();
                    continue;
                case 194:
                    if (this.x == null) {
                        this.x = new ddx();
                    }
                    dee.a(this.x);
                    continue;
                case 202:
                    if (this.j == null) {
                        this.j = new ddx();
                    }
                    dee.a(this.j);
                    continue;
                case 208:
                    this.F = dee.c();
                    continue;
                case 218:
                    if (this.t == null) {
                        this.t = new ddx();
                    }
                    dee.a(this.t);
                    continue;
                case 226:
                    if (this.k == null) {
                        this.k = new ddx();
                    }
                    dee.a(this.k);
                    continue;
                case 234:
                    if (this.u == null) {
                        this.u = new ddx();
                    }
                    dee.a(this.u);
                    continue;
                case 242:
                    if (this.v == null) {
                        this.v = new ddx();
                    }
                    dee.a(this.v);
                    continue;
                case 250:
                    if (this.w == null) {
                        this.w = new ddx();
                    }
                    dee.a(this.w);
                    continue;
                case 256:
                    this.G = dee.c();
                    continue;
                default:
                    if (!dep.a(dee, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public static ddv[] m_() {
        if (s == null) {
            synchronized (del.b) {
                if (s == null) {
                    s = new ddv[0];
                }
            }
        }
        return s;
    }

    public ddv() {
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
        this.t = null;
        this.k = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = "";
        this.l = 0;
        this.m = "";
        this.z = "";
        this.A = "";
        this.B = "";
        this.n = "";
        this.o = "";
        this.p = false;
        this.C = ddu.l_();
        this.D = ddu.l_();
        this.E = false;
        this.q = "";
        this.F = false;
        this.G = false;
        this.r = -1;
    }

    public final void a(def def) {
        int i = 0;
        if (this.a != null) {
            def.a(1, this.a);
        }
        if (this.b != null) {
            def.a(2, this.b);
        }
        if (this.c != null) {
            def.a(3, this.c);
        }
        if (this.d != null) {
            def.a(4, this.d);
        }
        if (this.e != null) {
            def.a(5, this.e);
        }
        if (this.f != null) {
            def.a(6, this.f);
        }
        if (this.g != null) {
            def.a(7, this.g);
        }
        if (this.h != null) {
            def.a(8, this.h);
        }
        def.a(9, this.y);
        if (this.l != 0) {
            def.a(10, this.l);
        }
        if (!this.m.equals("")) {
            def.a(11, this.m);
        }
        if (!this.A.equals("")) {
            def.a(12, this.A);
        }
        if (!this.B.equals("")) {
            def.a(13, this.B);
        }
        if (!this.n.equals("")) {
            def.a(15, this.n);
        }
        if (!this.o.equals("")) {
            def.a(16, this.o);
        }
        if (!this.z.equals("")) {
            def.a(17, this.z);
        }
        if (this.p) {
            def.a(18, this.p);
        }
        if (this.C != null && this.C.length > 0) {
            for (dem dem : this.C) {
                if (dem != null) {
                    def.a(19, dem);
                }
            }
        }
        if (this.D != null && this.D.length > 0) {
            while (i < this.D.length) {
                dem dem2 = this.D[i];
                if (dem2 != null) {
                    def.a(20, dem2);
                }
                i++;
            }
        }
        if (this.i != null) {
            def.a(21, this.i);
        }
        if (this.E) {
            def.a(22, this.E);
        }
        if (!this.q.equals("")) {
            def.a(23, this.q);
        }
        if (this.x != null) {
            def.a(24, this.x);
        }
        if (this.j != null) {
            def.a(25, this.j);
        }
        if (this.F) {
            def.a(26, this.F);
        }
        if (this.t != null) {
            def.a(27, this.t);
        }
        if (this.k != null) {
            def.a(28, this.k);
        }
        if (this.u != null) {
            def.a(29, this.u);
        }
        if (this.v != null) {
            def.a(30, this.v);
        }
        if (this.w != null) {
            def.a(31, this.w);
        }
        if (this.G) {
            def.a(32, this.G);
        }
        super.a(def);
    }

    protected final int a() {
        int i = 0;
        int a = super.a();
        if (this.a != null) {
            a += def.b(1, this.a);
        }
        if (this.b != null) {
            a += def.b(2, this.b);
        }
        if (this.c != null) {
            a += def.b(3, this.c);
        }
        if (this.d != null) {
            a += def.b(4, this.d);
        }
        if (this.e != null) {
            a += def.b(5, this.e);
        }
        if (this.f != null) {
            a += def.b(6, this.f);
        }
        if (this.g != null) {
            a += def.b(7, this.g);
        }
        if (this.h != null) {
            a += def.b(8, this.h);
        }
        a += def.b(9, this.y);
        if (this.l != 0) {
            a += def.c(10, this.l);
        }
        if (!this.m.equals("")) {
            a += def.b(11, this.m);
        }
        if (!this.A.equals("")) {
            a += def.b(12, this.A);
        }
        if (!this.B.equals("")) {
            a += def.b(13, this.B);
        }
        if (!this.n.equals("")) {
            a += def.b(15, this.n);
        }
        if (!this.o.equals("")) {
            a += def.b(16, this.o);
        }
        if (!this.z.equals("")) {
            a += def.b(17, this.z);
        }
        if (this.p) {
            a += def.b(18, this.p);
        }
        if (this.C != null && this.C.length > 0) {
            int i2 = a;
            for (dem dem : this.C) {
                if (dem != null) {
                    i2 += def.b(19, dem);
                }
            }
            a = i2;
        }
        if (this.D != null && this.D.length > 0) {
            while (i < this.D.length) {
                dem dem2 = this.D[i];
                if (dem2 != null) {
                    a += def.b(20, dem2);
                }
                i++;
            }
        }
        if (this.i != null) {
            a += def.b(21, this.i);
        }
        if (this.E) {
            a += def.b(22, this.E);
        }
        if (!this.q.equals("")) {
            a += def.b(23, this.q);
        }
        if (this.x != null) {
            a += def.b(24, this.x);
        }
        if (this.j != null) {
            a += def.b(25, this.j);
        }
        if (this.F) {
            a += def.b(26, this.F);
        }
        if (this.t != null) {
            a += def.b(27, this.t);
        }
        if (this.k != null) {
            a += def.b(28, this.k);
        }
        if (this.u != null) {
            a += def.b(29, this.u);
        }
        if (this.v != null) {
            a += def.b(30, this.v);
        }
        if (this.w != null) {
            a += def.b(31, this.w);
        }
        if (this.G) {
            return a + def.b(32, this.G);
        }
        return a;
    }
}
