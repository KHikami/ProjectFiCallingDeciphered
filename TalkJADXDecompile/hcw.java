import java.util.Arrays;

public final class hcw extends hck<hcw> {
    public long a;
    public long b;
    public long c;
    public String d;
    public int e;
    public int f;
    public boolean g;
    public hcx[] h;
    public hcu i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public hct m;
    public String n;
    public long q;
    public hcv r;
    public byte[] s;
    public int t;
    public int[] u;
    public long v;
    public hcy w;

    public hcw() {
        b();
    }

    private hcw b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = hcx.b();
        this.i = null;
        this.j = hcs.h;
        this.k = hcs.h;
        this.l = hcs.h;
        this.m = null;
        this.n = "";
        this.q = 180000;
        this.r = null;
        this.s = hcs.h;
        this.t = 0;
        this.u = hcs.a;
        this.v = 0;
        this.w = null;
        this.o = null;
        this.p = -1;
        return this;
    }

    private hcw b(hci hci) {
        while (true) {
            int a = hci.a();
            int a2;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = hci.d();
                    continue;
                case wi.dH /*18*/:
                    this.d = hci.g();
                    continue;
                case wi.dx /*26*/:
                    a2 = hcs.a(hci, 26);
                    a = this.h == null ? 0 : this.h.length;
                    obj = new hcx[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hcx();
                        hci.a(obj[a]);
                        hci.a();
                        a++;
                    }
                    obj[a] = new hcx();
                    hci.a(obj[a]);
                    this.h = obj;
                    continue;
                case 50:
                    this.j = hci.h();
                    continue;
                case 58:
                    if (this.m == null) {
                        this.m = new hct();
                    }
                    hci.a(this.m);
                    continue;
                case 66:
                    this.k = hci.h();
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new hcu();
                    }
                    hci.a(this.i);
                    continue;
                case 80:
                    this.g = hci.f();
                    continue;
                case 88:
                    this.e = hci.e();
                    continue;
                case 96:
                    this.f = hci.e();
                    continue;
                case 106:
                    this.l = hci.h();
                    continue;
                case 114:
                    this.n = hci.g();
                    continue;
                case 120:
                    this.q = hci.j();
                    continue;
                case 130:
                    if (this.r == null) {
                        this.r = new hcv();
                    }
                    hci.a(this.r);
                    continue;
                case 136:
                    this.b = hci.d();
                    continue;
                case 146:
                    this.s = hci.h();
                    continue;
                case 152:
                    a = hci.e();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.t = a;
                            break;
                        default:
                            continue;
                    }
                case 160:
                    a2 = hcs.a(hci, 160);
                    a = this.u == null ? 0 : this.u.length;
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.u, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.e();
                        hci.a();
                        a++;
                    }
                    obj[a] = hci.e();
                    this.u = obj;
                    continue;
                case 162:
                    int c = hci.c(hci.k());
                    a2 = hci.m();
                    a = 0;
                    while (hci.l() > 0) {
                        hci.e();
                        a++;
                    }
                    hci.e(a2);
                    a2 = this.u == null ? 0 : this.u.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.u, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = hci.e();
                        a2++;
                    }
                    this.u = obj2;
                    hci.d(c);
                    continue;
                case 168:
                    this.c = hci.d();
                    continue;
                case 176:
                    this.v = hci.d();
                    continue;
                case 186:
                    if (this.w == null) {
                        this.w = new hcy();
                    }
                    hci.a(this.w);
                    continue;
                default:
                    if (!super.a(hci, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    protected int a() {
        int i;
        int i2 = 0;
        int a = super.a();
        if (this.a != 0) {
            a += hcj.c(1, this.a);
        }
        if (!this.d.equals("")) {
            a += hcj.b(2, this.d);
        }
        if (this.h != null && this.h.length > 0) {
            i = a;
            for (hcq hcq : this.h) {
                if (hcq != null) {
                    i += hcj.b(3, hcq);
                }
            }
            a = i;
        }
        if (!Arrays.equals(this.j, hcs.h)) {
            a += hcj.b(6, this.j);
        }
        if (this.m != null) {
            a += hcj.b(7, this.m);
        }
        if (!Arrays.equals(this.k, hcs.h)) {
            a += hcj.b(8, this.k);
        }
        if (this.i != null) {
            a += hcj.b(9, this.i);
        }
        if (this.g) {
            boolean z = this.g;
            a += hcj.b(10) + 1;
        }
        if (this.e != 0) {
            a += hcj.c(11, this.e);
        }
        if (this.f != 0) {
            a += hcj.c(12, this.f);
        }
        if (!Arrays.equals(this.l, hcs.h)) {
            a += hcj.b(13, this.l);
        }
        if (!this.n.equals("")) {
            a += hcj.b(14, this.n);
        }
        if (this.q != 180000) {
            a += hcj.a(hcj.b(this.q)) + hcj.b(15);
        }
        if (this.r != null) {
            a += hcj.b(16, this.r);
        }
        if (this.b != 0) {
            a += hcj.c(17, this.b);
        }
        if (!Arrays.equals(this.s, hcs.h)) {
            a += hcj.b(18, this.s);
        }
        if (this.t != 0) {
            a += hcj.c(19, this.t);
        }
        if (this.u != null && this.u.length > 0) {
            i = 0;
            while (i2 < this.u.length) {
                i += hcj.a(this.u[i2]);
                i2++;
            }
            a = (a + i) + (this.u.length * 2);
        }
        if (this.c != 0) {
            a += hcj.c(21, this.c);
        }
        if (this.v != 0) {
            a += hcj.c(22, this.v);
        }
        return this.w != null ? a + hcj.b(23, this.w) : a;
    }

    public /* synthetic */ hcq a(hci hci) {
        return b(hci);
    }

    public void a(hcj hcj) {
        int i = 0;
        if (this.a != 0) {
            hcj.a(1, this.a);
        }
        if (!this.d.equals("")) {
            hcj.a(2, this.d);
        }
        if (this.h != null && this.h.length > 0) {
            for (hcq hcq : this.h) {
                if (hcq != null) {
                    hcj.a(3, hcq);
                }
            }
        }
        if (!Arrays.equals(this.j, hcs.h)) {
            hcj.a(6, this.j);
        }
        if (this.m != null) {
            hcj.a(7, this.m);
        }
        if (!Arrays.equals(this.k, hcs.h)) {
            hcj.a(8, this.k);
        }
        if (this.i != null) {
            hcj.a(9, this.i);
        }
        if (this.g) {
            hcj.a(10, this.g);
        }
        if (this.e != 0) {
            hcj.a(11, this.e);
        }
        if (this.f != 0) {
            hcj.a(12, this.f);
        }
        if (!Arrays.equals(this.l, hcs.h)) {
            hcj.a(13, this.l);
        }
        if (!this.n.equals("")) {
            hcj.a(14, this.n);
        }
        if (this.q != 180000) {
            hcj.b(15, this.q);
        }
        if (this.r != null) {
            hcj.a(16, this.r);
        }
        if (this.b != 0) {
            hcj.a(17, this.b);
        }
        if (!Arrays.equals(this.s, hcs.h)) {
            hcj.a(18, this.s);
        }
        if (this.t != 0) {
            hcj.a(19, this.t);
        }
        if (this.u != null && this.u.length > 0) {
            while (i < this.u.length) {
                hcj.a(20, this.u[i]);
                i++;
            }
        }
        if (this.c != 0) {
            hcj.a(21, this.c);
        }
        if (this.v != 0) {
            hcj.a(22, this.v);
        }
        if (this.w != null) {
            hcj.a(23, this.w);
        }
        super.a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcw)) {
            return false;
        }
        hcw hcw = (hcw) obj;
        if (this.a != hcw.a) {
            return false;
        }
        if (this.b != hcw.b) {
            return false;
        }
        if (this.c != hcw.c) {
            return false;
        }
        if (this.d == null) {
            if (hcw.d != null) {
                return false;
            }
        } else if (!this.d.equals(hcw.d)) {
            return false;
        }
        if (this.e != hcw.e) {
            return false;
        }
        if (this.f != hcw.f) {
            return false;
        }
        if (this.g != hcw.g) {
            return false;
        }
        if (!hco.a(this.h, hcw.h)) {
            return false;
        }
        if (this.i == null) {
            if (hcw.i != null) {
                return false;
            }
        } else if (!this.i.equals(hcw.i)) {
            return false;
        }
        if (!Arrays.equals(this.j, hcw.j)) {
            return false;
        }
        if (!Arrays.equals(this.k, hcw.k)) {
            return false;
        }
        if (!Arrays.equals(this.l, hcw.l)) {
            return false;
        }
        if (this.m == null) {
            if (hcw.m != null) {
                return false;
            }
        } else if (!this.m.equals(hcw.m)) {
            return false;
        }
        if (this.n == null) {
            if (hcw.n != null) {
                return false;
            }
        } else if (!this.n.equals(hcw.n)) {
            return false;
        }
        if (this.q != hcw.q) {
            return false;
        }
        if (this.r == null) {
            if (hcw.r != null) {
                return false;
            }
        } else if (!this.r.equals(hcw.r)) {
            return false;
        }
        if (!Arrays.equals(this.s, hcw.s)) {
            return false;
        }
        if (this.t != hcw.t) {
            return false;
        }
        if (!hco.a(this.u, hcw.u)) {
            return false;
        }
        if (this.v != hcw.v) {
            return false;
        }
        if (this.w == null) {
            if (hcw.w != null) {
                return false;
            }
        } else if (!this.w.equals(hcw.w)) {
            return false;
        }
        return (this.o == null || this.o.b()) ? hcw.o == null || hcw.o.b() : this.o.equals(hcw.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.w == null ? 0 : this.w.hashCode()) + (((((((((((this.r == null ? 0 : this.r.hashCode()) + (((((this.n == null ? 0 : this.n.hashCode()) + (((this.m == null ? 0 : this.m.hashCode()) + (((((((((this.i == null ? 0 : this.i.hashCode()) + (((((this.g ? 1231 : 1237) + (((((((this.d == null ? 0 : this.d.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.a ^ (this.a >>> 32)))) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31)) * 31) + this.e) * 31) + this.f) * 31)) * 31) + hco.a(this.h)) * 31)) * 31) + Arrays.hashCode(this.j)) * 31) + Arrays.hashCode(this.k)) * 31) + Arrays.hashCode(this.l)) * 31)) * 31)) * 31) + ((int) (this.q ^ (this.q >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.s)) * 31) + this.t) * 31) + hco.a(this.u)) * 31) + ((int) (this.v ^ (this.v >>> 32)))) * 31)) * 31;
        if (!(this.o == null || this.o.b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
