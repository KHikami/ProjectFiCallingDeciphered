package p000;

public final class jbg extends nzf {
    private static volatile jbg[] f19684F;
    public jbf[] f19685A;
    public boolean f19686B;
    public String f19687C;
    public boolean f19688D;
    public boolean f19689E;
    public jbi f19690a;
    public jbi f19691b;
    public jbi f19692c;
    public jbi f19693d;
    public jbi f19694e;
    public jbi f19695f;
    public jbi f19696g;
    public jbi f19697h;
    public jbi f19698i;
    public jbi f19699j;
    public jbi f19700k;
    public jbi f19701l;
    public jbi f19702m;
    public jbi f19703n;
    public jbi f19704o;
    public jbi f19705p;
    public String f19706q;
    public int f19707r;
    public String f19708s;
    public String f19709t;
    public String f19710u;
    public String f19711v;
    public String f19712w;
    public String f19713x;
    public boolean f19714y;
    public jbf[] f19715z;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m23773b(nyt);
    }

    public static jbg[] m23774d() {
        if (f19684F == null) {
            synchronized (nzc.c) {
                if (f19684F == null) {
                    f19684F = new jbg[0];
                }
            }
        }
        return f19684F;
    }

    public jbg() {
        m23775e();
    }

    private jbg m23775e() {
        this.f19690a = null;
        this.f19691b = null;
        this.f19692c = null;
        this.f19693d = null;
        this.f19694e = null;
        this.f19695f = null;
        this.f19696g = null;
        this.f19697h = null;
        this.f19698i = null;
        this.f19699j = null;
        this.f19700k = null;
        this.f19701l = null;
        this.f19702m = null;
        this.f19703n = null;
        this.f19704o = null;
        this.f19705p = null;
        this.f19706q = "";
        this.f19707r = 0;
        this.f19708s = "";
        this.f19709t = "";
        this.f19710u = "";
        this.f19711v = "";
        this.f19712w = "";
        this.f19713x = "";
        this.f19714y = false;
        this.f19715z = jbf.m23768d();
        this.f19685A = jbf.m23768d();
        this.f19686B = false;
        this.f19687C = "";
        this.f19688D = false;
        this.f19689E = false;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f19690a != null) {
            nyu.b(1, this.f19690a);
        }
        if (this.f19691b != null) {
            nyu.b(2, this.f19691b);
        }
        if (this.f19692c != null) {
            nyu.b(3, this.f19692c);
        }
        if (this.f19693d != null) {
            nyu.b(4, this.f19693d);
        }
        if (this.f19694e != null) {
            nyu.b(5, this.f19694e);
        }
        if (this.f19695f != null) {
            nyu.b(6, this.f19695f);
        }
        if (this.f19696g != null) {
            nyu.b(7, this.f19696g);
        }
        if (this.f19697h != null) {
            nyu.b(8, this.f19697h);
        }
        nyu.a(9, this.f19706q);
        if (this.f19707r != 0) {
            nyu.a(10, this.f19707r);
        }
        if (!this.f19708s.equals("")) {
            nyu.a(11, this.f19708s);
        }
        if (!this.f19710u.equals("")) {
            nyu.a(12, this.f19710u);
        }
        if (!this.f19711v.equals("")) {
            nyu.a(13, this.f19711v);
        }
        if (!this.f19712w.equals("")) {
            nyu.a(15, this.f19712w);
        }
        if (!this.f19713x.equals("")) {
            nyu.a(16, this.f19713x);
        }
        if (!this.f19709t.equals("")) {
            nyu.a(17, this.f19709t);
        }
        if (this.f19714y) {
            nyu.a(18, this.f19714y);
        }
        if (this.f19715z != null && this.f19715z.length > 0) {
            for (nzf nzf : this.f19715z) {
                if (nzf != null) {
                    nyu.b(19, nzf);
                }
            }
        }
        if (this.f19685A != null && this.f19685A.length > 0) {
            while (i < this.f19685A.length) {
                nzf nzf2 = this.f19685A[i];
                if (nzf2 != null) {
                    nyu.b(20, nzf2);
                }
                i++;
            }
        }
        if (this.f19698i != null) {
            nyu.b(21, this.f19698i);
        }
        if (this.f19686B) {
            nyu.a(22, this.f19686B);
        }
        if (!this.f19687C.equals("")) {
            nyu.a(23, this.f19687C);
        }
        if (this.f19705p != null) {
            nyu.b(24, this.f19705p);
        }
        if (this.f19699j != null) {
            nyu.b(25, this.f19699j);
        }
        if (this.f19688D) {
            nyu.a(26, this.f19688D);
        }
        if (this.f19700k != null) {
            nyu.b(27, this.f19700k);
        }
        if (this.f19701l != null) {
            nyu.b(28, this.f19701l);
        }
        if (this.f19702m != null) {
            nyu.b(29, this.f19702m);
        }
        if (this.f19703n != null) {
            nyu.b(30, this.f19703n);
        }
        if (this.f19704o != null) {
            nyu.b(31, this.f19704o);
        }
        if (this.f19689E) {
            nyu.a(32, this.f19689E);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f19690a != null) {
            b += nyu.d(1, this.f19690a);
        }
        if (this.f19691b != null) {
            b += nyu.d(2, this.f19691b);
        }
        if (this.f19692c != null) {
            b += nyu.d(3, this.f19692c);
        }
        if (this.f19693d != null) {
            b += nyu.d(4, this.f19693d);
        }
        if (this.f19694e != null) {
            b += nyu.d(5, this.f19694e);
        }
        if (this.f19695f != null) {
            b += nyu.d(6, this.f19695f);
        }
        if (this.f19696g != null) {
            b += nyu.d(7, this.f19696g);
        }
        if (this.f19697h != null) {
            b += nyu.d(8, this.f19697h);
        }
        b += nyu.b(9, this.f19706q);
        if (this.f19707r != 0) {
            b += nyu.f(10, this.f19707r);
        }
        if (!this.f19708s.equals("")) {
            b += nyu.b(11, this.f19708s);
        }
        if (!this.f19710u.equals("")) {
            b += nyu.b(12, this.f19710u);
        }
        if (!this.f19711v.equals("")) {
            b += nyu.b(13, this.f19711v);
        }
        if (!this.f19712w.equals("")) {
            b += nyu.b(15, this.f19712w);
        }
        if (!this.f19713x.equals("")) {
            b += nyu.b(16, this.f19713x);
        }
        if (!this.f19709t.equals("")) {
            b += nyu.b(17, this.f19709t);
        }
        if (this.f19714y) {
            b += nyu.b(18, this.f19714y);
        }
        if (this.f19715z != null && this.f19715z.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f19715z) {
                if (nzf != null) {
                    i2 += nyu.d(19, nzf);
                }
            }
            b = i2;
        }
        if (this.f19685A != null && this.f19685A.length > 0) {
            while (i < this.f19685A.length) {
                nzf nzf2 = this.f19685A[i];
                if (nzf2 != null) {
                    b += nyu.d(20, nzf2);
                }
                i++;
            }
        }
        if (this.f19698i != null) {
            b += nyu.d(21, this.f19698i);
        }
        if (this.f19686B) {
            b += nyu.b(22, this.f19686B);
        }
        if (!this.f19687C.equals("")) {
            b += nyu.b(23, this.f19687C);
        }
        if (this.f19705p != null) {
            b += nyu.d(24, this.f19705p);
        }
        if (this.f19699j != null) {
            b += nyu.d(25, this.f19699j);
        }
        if (this.f19688D) {
            b += nyu.b(26, this.f19688D);
        }
        if (this.f19700k != null) {
            b += nyu.d(27, this.f19700k);
        }
        if (this.f19701l != null) {
            b += nyu.d(28, this.f19701l);
        }
        if (this.f19702m != null) {
            b += nyu.d(29, this.f19702m);
        }
        if (this.f19703n != null) {
            b += nyu.d(30, this.f19703n);
        }
        if (this.f19704o != null) {
            b += nyu.d(31, this.f19704o);
        }
        if (this.f19689E) {
            return b + nyu.b(32, this.f19689E);
        }
        return b;
    }

    private jbg m23773b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f19690a == null) {
                        this.f19690a = new jbi();
                    }
                    nyt.a(this.f19690a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f19691b == null) {
                        this.f19691b = new jbi();
                    }
                    nyt.a(this.f19691b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f19692c == null) {
                        this.f19692c = new jbi();
                    }
                    nyt.a(this.f19692c);
                    continue;
                case 34:
                    if (this.f19693d == null) {
                        this.f19693d = new jbi();
                    }
                    nyt.a(this.f19693d);
                    continue;
                case 42:
                    if (this.f19694e == null) {
                        this.f19694e = new jbi();
                    }
                    nyt.a(this.f19694e);
                    continue;
                case 50:
                    if (this.f19695f == null) {
                        this.f19695f = new jbi();
                    }
                    nyt.a(this.f19695f);
                    continue;
                case 58:
                    if (this.f19696g == null) {
                        this.f19696g = new jbi();
                    }
                    nyt.a(this.f19696g);
                    continue;
                case 66:
                    if (this.f19697h == null) {
                        this.f19697h = new jbi();
                    }
                    nyt.a(this.f19697h);
                    continue;
                case 74:
                    this.f19706q = nyt.j();
                    continue;
                case 80:
                    this.f19707r = nyt.f();
                    continue;
                case 90:
                    this.f19708s = nyt.j();
                    continue;
                case 98:
                    this.f19710u = nyt.j();
                    continue;
                case 106:
                    this.f19711v = nyt.j();
                    continue;
                case 122:
                    this.f19712w = nyt.j();
                    continue;
                case 130:
                    this.f19713x = nyt.j();
                    continue;
                case 138:
                    this.f19709t = nyt.j();
                    continue;
                case 144:
                    this.f19714y = nyt.i();
                    continue;
                case 154:
                    b = nzl.b(nyt, 154);
                    if (this.f19715z == null) {
                        a = 0;
                    } else {
                        a = this.f19715z.length;
                    }
                    obj = new jbf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f19715z, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new jbf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new jbf();
                    nyt.a(obj[a]);
                    this.f19715z = obj;
                    continue;
                case 162:
                    b = nzl.b(nyt, 162);
                    if (this.f19685A == null) {
                        a = 0;
                    } else {
                        a = this.f19685A.length;
                    }
                    obj = new jbf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f19685A, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new jbf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new jbf();
                    nyt.a(obj[a]);
                    this.f19685A = obj;
                    continue;
                case 170:
                    if (this.f19698i == null) {
                        this.f19698i = new jbi();
                    }
                    nyt.a(this.f19698i);
                    continue;
                case 176:
                    this.f19686B = nyt.i();
                    continue;
                case 186:
                    this.f19687C = nyt.j();
                    continue;
                case 194:
                    if (this.f19705p == null) {
                        this.f19705p = new jbi();
                    }
                    nyt.a(this.f19705p);
                    continue;
                case 202:
                    if (this.f19699j == null) {
                        this.f19699j = new jbi();
                    }
                    nyt.a(this.f19699j);
                    continue;
                case 208:
                    this.f19688D = nyt.i();
                    continue;
                case 218:
                    if (this.f19700k == null) {
                        this.f19700k = new jbi();
                    }
                    nyt.a(this.f19700k);
                    continue;
                case 226:
                    if (this.f19701l == null) {
                        this.f19701l = new jbi();
                    }
                    nyt.a(this.f19701l);
                    continue;
                case 234:
                    if (this.f19702m == null) {
                        this.f19702m = new jbi();
                    }
                    nyt.a(this.f19702m);
                    continue;
                case 242:
                    if (this.f19703n == null) {
                        this.f19703n = new jbi();
                    }
                    nyt.a(this.f19703n);
                    continue;
                case 250:
                    if (this.f19704o == null) {
                        this.f19704o = new jbi();
                    }
                    nyt.a(this.f19704o);
                    continue;
                case 256:
                    this.f19689E = nyt.i();
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
