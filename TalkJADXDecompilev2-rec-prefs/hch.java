package p000;

import java.util.Arrays;

public final class hch extends hck<hch> {
    public byte[] f16583a;
    public String f16584b;
    public double f16585c;
    public float f16586d;
    public long f16587e;
    public int f16588f;
    public int f16589g;
    public boolean f16590h;
    public hcf[] f16591i;
    public hcg[] f16592j;
    public String[] f16593k;
    public long[] f16594l;
    public float[] f16595m;
    public long f16596n;

    public hch() {
        m19233b();
    }

    private hch m19233b() {
        this.f16583a = hcs.f16632h;
        this.f16584b = "";
        this.f16585c = 0.0d;
        this.f16586d = 0.0f;
        this.f16587e = 0;
        this.f16588f = 0;
        this.f16589g = 0;
        this.f16590h = false;
        this.f16591i = hcf.m19222b();
        this.f16592j = hcg.m19228b();
        this.f16593k = hcs.f16630f;
        this.f16594l = hcs.f16626b;
        this.f16595m = hcs.f16627c;
        this.f16596n = 0;
        this.o = null;
        this.p = -1;
        return this;
    }

    private hch m19234b(hci hci) {
        while (true) {
            int a = hci.m19246a();
            int a2;
            Object obj;
            int c;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f16583a = hci.m19260h();
                    continue;
                case wi.dH /*18*/:
                    this.f16584b = hci.m19259g();
                    continue;
                case wi.dz /*25*/:
                    this.f16585c = hci.m19250b();
                    continue;
                case 37:
                    this.f16586d = hci.m19252c();
                    continue;
                case 40:
                    this.f16587e = hci.m19254d();
                    continue;
                case 48:
                    this.f16588f = hci.m19256e();
                    continue;
                case 56:
                    this.f16589g = hci.m19261i();
                    continue;
                case 64:
                    this.f16590h = hci.m19258f();
                    continue;
                case 74:
                    a2 = hcs.m19351a(hci, 74);
                    a = this.f16591i == null ? 0 : this.f16591i.length;
                    obj = new hcf[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16591i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hcf();
                        hci.m19248a(obj[a]);
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = new hcf();
                    hci.m19248a(obj[a]);
                    this.f16591i = obj;
                    continue;
                case 82:
                    a2 = hcs.m19351a(hci, 82);
                    a = this.f16592j == null ? 0 : this.f16592j.length;
                    obj = new hcg[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16592j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hcg();
                        hci.m19248a(obj[a]);
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = new hcg();
                    hci.m19248a(obj[a]);
                    this.f16592j = obj;
                    continue;
                case 90:
                    a2 = hcs.m19351a(hci, 90);
                    a = this.f16593k == null ? 0 : this.f16593k.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16593k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.m19259g();
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = hci.m19259g();
                    this.f16593k = obj;
                    continue;
                case 96:
                    a2 = hcs.m19351a(hci, 96);
                    a = this.f16594l == null ? 0 : this.f16594l.length;
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16594l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.m19254d();
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = hci.m19254d();
                    this.f16594l = obj;
                    continue;
                case 98:
                    c = hci.m19253c(hci.m19263k());
                    a2 = hci.m19265m();
                    a = 0;
                    while (hci.m19264l() > 0) {
                        hci.m19254d();
                        a++;
                    }
                    hci.m19257e(a2);
                    a2 = this.f16594l == null ? 0 : this.f16594l.length;
                    Object obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f16594l, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = hci.m19254d();
                        a2++;
                    }
                    this.f16594l = obj2;
                    hci.m19255d(c);
                    continue;
                case 104:
                    this.f16596n = hci.m19254d();
                    continue;
                case 114:
                    a = hci.m19263k();
                    a2 = hci.m19253c(a);
                    c = a / 4;
                    a = this.f16595m == null ? 0 : this.f16595m.length;
                    Object obj3 = new float[(c + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16595m, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = hci.m19252c();
                        a++;
                    }
                    this.f16595m = obj3;
                    hci.m19255d(a2);
                    continue;
                case 117:
                    a2 = hcs.m19351a(hci, 117);
                    a = this.f16595m == null ? 0 : this.f16595m.length;
                    obj = new float[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16595m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.m19252c();
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = hci.m19252c();
                    this.f16595m = obj;
                    continue;
                default:
                    if (!super.m19212a(hci, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    protected int mo2448a() {
        int i;
        int i2 = 0;
        int a = super.mo2448a();
        if (!Arrays.equals(this.f16583a, hcs.f16632h)) {
            a += hcj.m19282b(1, this.f16583a);
        }
        if (!this.f16584b.equals("")) {
            a += hcj.m19281b(2, this.f16584b);
        }
        if (Double.doubleToLongBits(this.f16585c) != Double.doubleToLongBits(0.0d)) {
            double d = this.f16585c;
            a += hcj.m19279b(3) + 8;
        }
        if (Float.floatToIntBits(this.f16586d) != Float.floatToIntBits(0.0f)) {
            float f = this.f16586d;
            a += hcj.m19279b(4) + 4;
        }
        if (this.f16587e != 0) {
            a += hcj.m19288c(5, this.f16587e);
        }
        if (this.f16588f != 0) {
            a += hcj.m19287c(6, this.f16588f);
        }
        if (this.f16589g != 0) {
            a += hcj.m19291d(hcj.m19293e(this.f16589g)) + hcj.m19279b(7);
        }
        if (this.f16590h) {
            boolean z = this.f16590h;
            a += hcj.m19279b(8) + 1;
        }
        if (this.f16591i != null && this.f16591i.length > 0) {
            i = a;
            for (hcq hcq : this.f16591i) {
                if (hcq != null) {
                    i += hcj.m19280b(9, hcq);
                }
            }
            a = i;
        }
        if (this.f16592j != null && this.f16592j.length > 0) {
            i = a;
            for (hcq hcq2 : this.f16592j) {
                if (hcq2 != null) {
                    i += hcj.m19280b(10, hcq2);
                }
            }
            a = i;
        }
        if (this.f16593k != null && this.f16593k.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f16593k) {
                if (str != null) {
                    i4++;
                    i3 += hcj.m19270a(str);
                }
            }
            a = (a + i3) + (i4 * 1);
        }
        if (this.f16594l != null && this.f16594l.length > 0) {
            i = 0;
            while (i2 < this.f16594l.length) {
                i += hcj.m19267a(this.f16594l[i2]);
                i2++;
            }
            a = (a + i) + (this.f16594l.length * 1);
        }
        if (this.f16596n != 0) {
            a += hcj.m19288c(13, this.f16596n);
        }
        return (this.f16595m == null || this.f16595m.length <= 0) ? a : (a + (this.f16595m.length * 4)) + (this.f16595m.length * 1);
    }

    public /* synthetic */ hcq mo2452a(hci hci) {
        return m19234b(hci);
    }

    public void mo2449a(hcj hcj) {
        int i = 0;
        if (!Arrays.equals(this.f16583a, hcs.f16632h)) {
            hcj.m19308a(1, this.f16583a);
        }
        if (!this.f16584b.equals("")) {
            hcj.m19306a(2, this.f16584b);
        }
        if (Double.doubleToLongBits(this.f16585c) != Double.doubleToLongBits(0.0d)) {
            hcj.m19301a(3, this.f16585c);
        }
        if (Float.floatToIntBits(this.f16586d) != Float.floatToIntBits(0.0f)) {
            hcj.m19302a(4, this.f16586d);
        }
        if (this.f16587e != 0) {
            hcj.m19304a(5, this.f16587e);
        }
        if (this.f16588f != 0) {
            hcj.m19303a(6, this.f16588f);
        }
        if (this.f16589g != 0) {
            hcj.m19310b(7, this.f16589g);
        }
        if (this.f16590h) {
            hcj.m19307a(8, this.f16590h);
        }
        if (this.f16591i != null && this.f16591i.length > 0) {
            for (hcq hcq : this.f16591i) {
                if (hcq != null) {
                    hcj.m19305a(9, hcq);
                }
            }
        }
        if (this.f16592j != null && this.f16592j.length > 0) {
            for (hcq hcq2 : this.f16592j) {
                if (hcq2 != null) {
                    hcj.m19305a(10, hcq2);
                }
            }
        }
        if (this.f16593k != null && this.f16593k.length > 0) {
            for (String str : this.f16593k) {
                if (str != null) {
                    hcj.m19306a(11, str);
                }
            }
        }
        if (this.f16594l != null && this.f16594l.length > 0) {
            for (long a : this.f16594l) {
                hcj.m19304a(12, a);
            }
        }
        if (this.f16596n != 0) {
            hcj.m19304a(13, this.f16596n);
        }
        if (this.f16595m != null && this.f16595m.length > 0) {
            while (i < this.f16595m.length) {
                hcj.m19302a(14, this.f16595m[i]);
                i++;
            }
        }
        super.mo2449a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hch)) {
            return false;
        }
        hch hch = (hch) obj;
        if (!Arrays.equals(this.f16583a, hch.f16583a)) {
            return false;
        }
        if (this.f16584b == null) {
            if (hch.f16584b != null) {
                return false;
            }
        } else if (!this.f16584b.equals(hch.f16584b)) {
            return false;
        }
        return Double.doubleToLongBits(this.f16585c) != Double.doubleToLongBits(hch.f16585c) ? false : Float.floatToIntBits(this.f16586d) != Float.floatToIntBits(hch.f16586d) ? false : this.f16587e != hch.f16587e ? false : this.f16588f != hch.f16588f ? false : this.f16589g != hch.f16589g ? false : this.f16590h != hch.f16590h ? false : !hco.m19344a(this.f16591i, hch.f16591i) ? false : !hco.m19344a(this.f16592j, hch.f16592j) ? false : !hco.m19344a(this.f16593k, hch.f16593k) ? false : !hco.m19343a(this.f16594l, hch.f16594l) ? false : !hco.m19341a(this.f16595m, hch.f16595m) ? false : this.f16596n != hch.f16596n ? false : (this.o == null || this.o.m19329b()) ? hch.o == null || hch.o.m19329b() : this.o.equals(hch.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f16584b == null ? 0 : this.f16584b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f16583a)) * 31);
        long doubleToLongBits = Double.doubleToLongBits(this.f16585c);
        hashCode = ((((((((((((((this.f16590h ? 1231 : 1237) + (((((((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Float.floatToIntBits(this.f16586d)) * 31) + ((int) (this.f16587e ^ (this.f16587e >>> 32)))) * 31) + this.f16588f) * 31) + this.f16589g) * 31)) * 31) + hco.m19338a(this.f16591i)) * 31) + hco.m19338a(this.f16592j)) * 31) + hco.m19338a(this.f16593k)) * 31) + hco.m19337a(this.f16594l)) * 31) + hco.m19335a(this.f16595m)) * 31) + ((int) (this.f16596n ^ (this.f16596n >>> 32)))) * 31;
        if (!(this.o == null || this.o.m19329b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
