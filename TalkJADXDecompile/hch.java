import java.util.Arrays;

public final class hch extends hck<hch> {
    public byte[] a;
    public String b;
    public double c;
    public float d;
    public long e;
    public int f;
    public int g;
    public boolean h;
    public hcf[] i;
    public hcg[] j;
    public String[] k;
    public long[] l;
    public float[] m;
    public long n;

    public hch() {
        b();
    }

    private hch b() {
        this.a = hcs.h;
        this.b = "";
        this.c = 0.0d;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = hcf.b();
        this.j = hcg.b();
        this.k = hcs.f;
        this.l = hcs.b;
        this.m = hcs.c;
        this.n = 0;
        this.o = null;
        this.p = -1;
        return this;
    }

    private hch b(hci hci) {
        while (true) {
            int a = hci.a();
            int a2;
            Object obj;
            int c;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = hci.h();
                    continue;
                case wi.dH /*18*/:
                    this.b = hci.g();
                    continue;
                case wi.dz /*25*/:
                    this.c = hci.b();
                    continue;
                case 37:
                    this.d = hci.c();
                    continue;
                case 40:
                    this.e = hci.d();
                    continue;
                case 48:
                    this.f = hci.e();
                    continue;
                case 56:
                    this.g = hci.i();
                    continue;
                case 64:
                    this.h = hci.f();
                    continue;
                case 74:
                    a2 = hcs.a(hci, 74);
                    a = this.i == null ? 0 : this.i.length;
                    obj = new hcf[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hcf();
                        hci.a(obj[a]);
                        hci.a();
                        a++;
                    }
                    obj[a] = new hcf();
                    hci.a(obj[a]);
                    this.i = obj;
                    continue;
                case 82:
                    a2 = hcs.a(hci, 82);
                    a = this.j == null ? 0 : this.j.length;
                    obj = new hcg[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hcg();
                        hci.a(obj[a]);
                        hci.a();
                        a++;
                    }
                    obj[a] = new hcg();
                    hci.a(obj[a]);
                    this.j = obj;
                    continue;
                case 90:
                    a2 = hcs.a(hci, 90);
                    a = this.k == null ? 0 : this.k.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.g();
                        hci.a();
                        a++;
                    }
                    obj[a] = hci.g();
                    this.k = obj;
                    continue;
                case 96:
                    a2 = hcs.a(hci, 96);
                    a = this.l == null ? 0 : this.l.length;
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.d();
                        hci.a();
                        a++;
                    }
                    obj[a] = hci.d();
                    this.l = obj;
                    continue;
                case 98:
                    c = hci.c(hci.k());
                    a2 = hci.m();
                    a = 0;
                    while (hci.l() > 0) {
                        hci.d();
                        a++;
                    }
                    hci.e(a2);
                    a2 = this.l == null ? 0 : this.l.length;
                    Object obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.l, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = hci.d();
                        a2++;
                    }
                    this.l = obj2;
                    hci.d(c);
                    continue;
                case 104:
                    this.n = hci.d();
                    continue;
                case 114:
                    a = hci.k();
                    a2 = hci.c(a);
                    c = a / 4;
                    a = this.m == null ? 0 : this.m.length;
                    Object obj3 = new float[(c + a)];
                    if (a != 0) {
                        System.arraycopy(this.m, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = hci.c();
                        a++;
                    }
                    this.m = obj3;
                    hci.d(a2);
                    continue;
                case 117:
                    a2 = hcs.a(hci, 117);
                    a = this.m == null ? 0 : this.m.length;
                    obj = new float[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.c();
                        hci.a();
                        a++;
                    }
                    obj[a] = hci.c();
                    this.m = obj;
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
        if (!Arrays.equals(this.a, hcs.h)) {
            a += hcj.b(1, this.a);
        }
        if (!this.b.equals("")) {
            a += hcj.b(2, this.b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            double d = this.c;
            a += hcj.b(3) + 8;
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            float f = this.d;
            a += hcj.b(4) + 4;
        }
        if (this.e != 0) {
            a += hcj.c(5, this.e);
        }
        if (this.f != 0) {
            a += hcj.c(6, this.f);
        }
        if (this.g != 0) {
            a += hcj.d(hcj.e(this.g)) + hcj.b(7);
        }
        if (this.h) {
            boolean z = this.h;
            a += hcj.b(8) + 1;
        }
        if (this.i != null && this.i.length > 0) {
            i = a;
            for (hcq hcq : this.i) {
                if (hcq != null) {
                    i += hcj.b(9, hcq);
                }
            }
            a = i;
        }
        if (this.j != null && this.j.length > 0) {
            i = a;
            for (hcq hcq2 : this.j) {
                if (hcq2 != null) {
                    i += hcj.b(10, hcq2);
                }
            }
            a = i;
        }
        if (this.k != null && this.k.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.k) {
                if (str != null) {
                    i4++;
                    i3 += hcj.a(str);
                }
            }
            a = (a + i3) + (i4 * 1);
        }
        if (this.l != null && this.l.length > 0) {
            i = 0;
            while (i2 < this.l.length) {
                i += hcj.a(this.l[i2]);
                i2++;
            }
            a = (a + i) + (this.l.length * 1);
        }
        if (this.n != 0) {
            a += hcj.c(13, this.n);
        }
        return (this.m == null || this.m.length <= 0) ? a : (a + (this.m.length * 4)) + (this.m.length * 1);
    }

    public /* synthetic */ hcq a(hci hci) {
        return b(hci);
    }

    public void a(hcj hcj) {
        int i = 0;
        if (!Arrays.equals(this.a, hcs.h)) {
            hcj.a(1, this.a);
        }
        if (!this.b.equals("")) {
            hcj.a(2, this.b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            hcj.a(3, this.c);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            hcj.a(4, this.d);
        }
        if (this.e != 0) {
            hcj.a(5, this.e);
        }
        if (this.f != 0) {
            hcj.a(6, this.f);
        }
        if (this.g != 0) {
            hcj.b(7, this.g);
        }
        if (this.h) {
            hcj.a(8, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            for (hcq hcq : this.i) {
                if (hcq != null) {
                    hcj.a(9, hcq);
                }
            }
        }
        if (this.j != null && this.j.length > 0) {
            for (hcq hcq2 : this.j) {
                if (hcq2 != null) {
                    hcj.a(10, hcq2);
                }
            }
        }
        if (this.k != null && this.k.length > 0) {
            for (String str : this.k) {
                if (str != null) {
                    hcj.a(11, str);
                }
            }
        }
        if (this.l != null && this.l.length > 0) {
            for (long a : this.l) {
                hcj.a(12, a);
            }
        }
        if (this.n != 0) {
            hcj.a(13, this.n);
        }
        if (this.m != null && this.m.length > 0) {
            while (i < this.m.length) {
                hcj.a(14, this.m[i]);
                i++;
            }
        }
        super.a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hch)) {
            return false;
        }
        hch hch = (hch) obj;
        if (!Arrays.equals(this.a, hch.a)) {
            return false;
        }
        if (this.b == null) {
            if (hch.b != null) {
                return false;
            }
        } else if (!this.b.equals(hch.b)) {
            return false;
        }
        return Double.doubleToLongBits(this.c) != Double.doubleToLongBits(hch.c) ? false : Float.floatToIntBits(this.d) != Float.floatToIntBits(hch.d) ? false : this.e != hch.e ? false : this.f != hch.f ? false : this.g != hch.g ? false : this.h != hch.h ? false : !hco.a(this.i, hch.i) ? false : !hco.a(this.j, hch.j) ? false : !hco.a(this.k, hch.k) ? false : !hco.a(this.l, hch.l) ? false : !hco.a(this.m, hch.m) ? false : this.n != hch.n ? false : (this.o == null || this.o.b()) ? hch.o == null || hch.o.b() : this.o.equals(hch.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.a)) * 31);
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        hashCode = ((((((((((((((this.h ? 1231 : 1237) + (((((((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Float.floatToIntBits(this.d)) * 31) + ((int) (this.e ^ (this.e >>> 32)))) * 31) + this.f) * 31) + this.g) * 31)) * 31) + hco.a(this.i)) * 31) + hco.a(this.j)) * 31) + hco.a(this.k)) * 31) + hco.a(this.l)) * 31) + hco.a(this.m)) * 31) + ((int) (this.n ^ (this.n >>> 32)))) * 31;
        if (!(this.o == null || this.o.b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
