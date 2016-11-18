package p000;

import java.util.Arrays;

public final class hcw extends hck<hcw> {
    public long f16643a;
    public long f16644b;
    public long f16645c;
    public String f16646d;
    public int f16647e;
    public int f16648f;
    public boolean f16649g;
    public hcx[] f16650h;
    public hcu f16651i;
    public byte[] f16652j;
    public byte[] f16653k;
    public byte[] f16654l;
    public hct f16655m;
    public String f16656n;
    public long f16657q;
    public hcv f16658r;
    public byte[] f16659s;
    public int f16660t;
    public int[] f16661u;
    public long f16662v;
    public hcy f16663w;

    public hcw() {
        m19367b();
    }

    private hcw m19367b() {
        this.f16643a = 0;
        this.f16644b = 0;
        this.f16645c = 0;
        this.f16646d = "";
        this.f16647e = 0;
        this.f16648f = 0;
        this.f16649g = false;
        this.f16650h = hcx.m19373b();
        this.f16651i = null;
        this.f16652j = hcs.f16632h;
        this.f16653k = hcs.f16632h;
        this.f16654l = hcs.f16632h;
        this.f16655m = null;
        this.f16656n = "";
        this.f16657q = 180000;
        this.f16658r = null;
        this.f16659s = hcs.f16632h;
        this.f16660t = 0;
        this.f16661u = hcs.f16625a;
        this.f16662v = 0;
        this.f16663w = null;
        this.o = null;
        this.p = -1;
        return this;
    }

    private hcw m19368b(hci hci) {
        while (true) {
            int a = hci.m19246a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f16643a = hci.m19254d();
                    continue;
                case wi.dH /*18*/:
                    this.f16646d = hci.m19259g();
                    continue;
                case wi.dx /*26*/:
                    a2 = hcs.m19351a(hci, 26);
                    a = this.f16650h == null ? 0 : this.f16650h.length;
                    obj = new hcx[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16650h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hcx();
                        hci.m19248a(obj[a]);
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = new hcx();
                    hci.m19248a(obj[a]);
                    this.f16650h = obj;
                    continue;
                case 50:
                    this.f16652j = hci.m19260h();
                    continue;
                case 58:
                    if (this.f16655m == null) {
                        this.f16655m = new hct();
                    }
                    hci.m19248a(this.f16655m);
                    continue;
                case 66:
                    this.f16653k = hci.m19260h();
                    continue;
                case 74:
                    if (this.f16651i == null) {
                        this.f16651i = new hcu();
                    }
                    hci.m19248a(this.f16651i);
                    continue;
                case 80:
                    this.f16649g = hci.m19258f();
                    continue;
                case 88:
                    this.f16647e = hci.m19256e();
                    continue;
                case 96:
                    this.f16648f = hci.m19256e();
                    continue;
                case 106:
                    this.f16654l = hci.m19260h();
                    continue;
                case 114:
                    this.f16656n = hci.m19259g();
                    continue;
                case 120:
                    this.f16657q = hci.m19262j();
                    continue;
                case 130:
                    if (this.f16658r == null) {
                        this.f16658r = new hcv();
                    }
                    hci.m19248a(this.f16658r);
                    continue;
                case 136:
                    this.f16644b = hci.m19254d();
                    continue;
                case 146:
                    this.f16659s = hci.m19260h();
                    continue;
                case 152:
                    a = hci.m19256e();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f16660t = a;
                            break;
                        default:
                            continue;
                    }
                case 160:
                    a2 = hcs.m19351a(hci, 160);
                    a = this.f16661u == null ? 0 : this.f16661u.length;
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16661u, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.m19256e();
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = hci.m19256e();
                    this.f16661u = obj;
                    continue;
                case 162:
                    int c = hci.m19253c(hci.m19263k());
                    a2 = hci.m19265m();
                    a = 0;
                    while (hci.m19264l() > 0) {
                        hci.m19256e();
                        a++;
                    }
                    hci.m19257e(a2);
                    a2 = this.f16661u == null ? 0 : this.f16661u.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f16661u, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = hci.m19256e();
                        a2++;
                    }
                    this.f16661u = obj2;
                    hci.m19255d(c);
                    continue;
                case 168:
                    this.f16645c = hci.m19254d();
                    continue;
                case 176:
                    this.f16662v = hci.m19254d();
                    continue;
                case 186:
                    if (this.f16663w == null) {
                        this.f16663w = new hcy();
                    }
                    hci.m19248a(this.f16663w);
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
        if (this.f16643a != 0) {
            a += hcj.m19288c(1, this.f16643a);
        }
        if (!this.f16646d.equals("")) {
            a += hcj.m19281b(2, this.f16646d);
        }
        if (this.f16650h != null && this.f16650h.length > 0) {
            i = a;
            for (hcq hcq : this.f16650h) {
                if (hcq != null) {
                    i += hcj.m19280b(3, hcq);
                }
            }
            a = i;
        }
        if (!Arrays.equals(this.f16652j, hcs.f16632h)) {
            a += hcj.m19282b(6, this.f16652j);
        }
        if (this.f16655m != null) {
            a += hcj.m19280b(7, this.f16655m);
        }
        if (!Arrays.equals(this.f16653k, hcs.f16632h)) {
            a += hcj.m19282b(8, this.f16653k);
        }
        if (this.f16651i != null) {
            a += hcj.m19280b(9, this.f16651i);
        }
        if (this.f16649g) {
            boolean z = this.f16649g;
            a += hcj.m19279b(10) + 1;
        }
        if (this.f16647e != 0) {
            a += hcj.m19287c(11, this.f16647e);
        }
        if (this.f16648f != 0) {
            a += hcj.m19287c(12, this.f16648f);
        }
        if (!Arrays.equals(this.f16654l, hcs.f16632h)) {
            a += hcj.m19282b(13, this.f16654l);
        }
        if (!this.f16656n.equals("")) {
            a += hcj.m19281b(14, this.f16656n);
        }
        if (this.f16657q != 180000) {
            a += hcj.m19267a(hcj.m19283b(this.f16657q)) + hcj.m19279b(15);
        }
        if (this.f16658r != null) {
            a += hcj.m19280b(16, this.f16658r);
        }
        if (this.f16644b != 0) {
            a += hcj.m19288c(17, this.f16644b);
        }
        if (!Arrays.equals(this.f16659s, hcs.f16632h)) {
            a += hcj.m19282b(18, this.f16659s);
        }
        if (this.f16660t != 0) {
            a += hcj.m19287c(19, this.f16660t);
        }
        if (this.f16661u != null && this.f16661u.length > 0) {
            i = 0;
            while (i2 < this.f16661u.length) {
                i += hcj.m19266a(this.f16661u[i2]);
                i2++;
            }
            a = (a + i) + (this.f16661u.length * 2);
        }
        if (this.f16645c != 0) {
            a += hcj.m19288c(21, this.f16645c);
        }
        if (this.f16662v != 0) {
            a += hcj.m19288c(22, this.f16662v);
        }
        return this.f16663w != null ? a + hcj.m19280b(23, this.f16663w) : a;
    }

    public /* synthetic */ hcq mo2452a(hci hci) {
        return m19368b(hci);
    }

    public void mo2449a(hcj hcj) {
        int i = 0;
        if (this.f16643a != 0) {
            hcj.m19304a(1, this.f16643a);
        }
        if (!this.f16646d.equals("")) {
            hcj.m19306a(2, this.f16646d);
        }
        if (this.f16650h != null && this.f16650h.length > 0) {
            for (hcq hcq : this.f16650h) {
                if (hcq != null) {
                    hcj.m19305a(3, hcq);
                }
            }
        }
        if (!Arrays.equals(this.f16652j, hcs.f16632h)) {
            hcj.m19308a(6, this.f16652j);
        }
        if (this.f16655m != null) {
            hcj.m19305a(7, this.f16655m);
        }
        if (!Arrays.equals(this.f16653k, hcs.f16632h)) {
            hcj.m19308a(8, this.f16653k);
        }
        if (this.f16651i != null) {
            hcj.m19305a(9, this.f16651i);
        }
        if (this.f16649g) {
            hcj.m19307a(10, this.f16649g);
        }
        if (this.f16647e != 0) {
            hcj.m19303a(11, this.f16647e);
        }
        if (this.f16648f != 0) {
            hcj.m19303a(12, this.f16648f);
        }
        if (!Arrays.equals(this.f16654l, hcs.f16632h)) {
            hcj.m19308a(13, this.f16654l);
        }
        if (!this.f16656n.equals("")) {
            hcj.m19306a(14, this.f16656n);
        }
        if (this.f16657q != 180000) {
            hcj.m19311b(15, this.f16657q);
        }
        if (this.f16658r != null) {
            hcj.m19305a(16, this.f16658r);
        }
        if (this.f16644b != 0) {
            hcj.m19304a(17, this.f16644b);
        }
        if (!Arrays.equals(this.f16659s, hcs.f16632h)) {
            hcj.m19308a(18, this.f16659s);
        }
        if (this.f16660t != 0) {
            hcj.m19303a(19, this.f16660t);
        }
        if (this.f16661u != null && this.f16661u.length > 0) {
            while (i < this.f16661u.length) {
                hcj.m19303a(20, this.f16661u[i]);
                i++;
            }
        }
        if (this.f16645c != 0) {
            hcj.m19304a(21, this.f16645c);
        }
        if (this.f16662v != 0) {
            hcj.m19304a(22, this.f16662v);
        }
        if (this.f16663w != null) {
            hcj.m19305a(23, this.f16663w);
        }
        super.mo2449a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcw)) {
            return false;
        }
        hcw hcw = (hcw) obj;
        if (this.f16643a != hcw.f16643a) {
            return false;
        }
        if (this.f16644b != hcw.f16644b) {
            return false;
        }
        if (this.f16645c != hcw.f16645c) {
            return false;
        }
        if (this.f16646d == null) {
            if (hcw.f16646d != null) {
                return false;
            }
        } else if (!this.f16646d.equals(hcw.f16646d)) {
            return false;
        }
        if (this.f16647e != hcw.f16647e) {
            return false;
        }
        if (this.f16648f != hcw.f16648f) {
            return false;
        }
        if (this.f16649g != hcw.f16649g) {
            return false;
        }
        if (!hco.m19344a(this.f16650h, hcw.f16650h)) {
            return false;
        }
        if (this.f16651i == null) {
            if (hcw.f16651i != null) {
                return false;
            }
        } else if (!this.f16651i.equals(hcw.f16651i)) {
            return false;
        }
        if (!Arrays.equals(this.f16652j, hcw.f16652j)) {
            return false;
        }
        if (!Arrays.equals(this.f16653k, hcw.f16653k)) {
            return false;
        }
        if (!Arrays.equals(this.f16654l, hcw.f16654l)) {
            return false;
        }
        if (this.f16655m == null) {
            if (hcw.f16655m != null) {
                return false;
            }
        } else if (!this.f16655m.equals(hcw.f16655m)) {
            return false;
        }
        if (this.f16656n == null) {
            if (hcw.f16656n != null) {
                return false;
            }
        } else if (!this.f16656n.equals(hcw.f16656n)) {
            return false;
        }
        if (this.f16657q != hcw.f16657q) {
            return false;
        }
        if (this.f16658r == null) {
            if (hcw.f16658r != null) {
                return false;
            }
        } else if (!this.f16658r.equals(hcw.f16658r)) {
            return false;
        }
        if (!Arrays.equals(this.f16659s, hcw.f16659s)) {
            return false;
        }
        if (this.f16660t != hcw.f16660t) {
            return false;
        }
        if (!hco.m19342a(this.f16661u, hcw.f16661u)) {
            return false;
        }
        if (this.f16662v != hcw.f16662v) {
            return false;
        }
        if (this.f16663w == null) {
            if (hcw.f16663w != null) {
                return false;
            }
        } else if (!this.f16663w.equals(hcw.f16663w)) {
            return false;
        }
        return (this.o == null || this.o.m19329b()) ? hcw.o == null || hcw.o.m19329b() : this.o.equals(hcw.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f16663w == null ? 0 : this.f16663w.hashCode()) + (((((((((((this.f16658r == null ? 0 : this.f16658r.hashCode()) + (((((this.f16656n == null ? 0 : this.f16656n.hashCode()) + (((this.f16655m == null ? 0 : this.f16655m.hashCode()) + (((((((((this.f16651i == null ? 0 : this.f16651i.hashCode()) + (((((this.f16649g ? 1231 : 1237) + (((((((this.f16646d == null ? 0 : this.f16646d.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f16643a ^ (this.f16643a >>> 32)))) * 31) + ((int) (this.f16644b ^ (this.f16644b >>> 32)))) * 31) + ((int) (this.f16645c ^ (this.f16645c >>> 32)))) * 31)) * 31) + this.f16647e) * 31) + this.f16648f) * 31)) * 31) + hco.m19338a(this.f16650h)) * 31)) * 31) + Arrays.hashCode(this.f16652j)) * 31) + Arrays.hashCode(this.f16653k)) * 31) + Arrays.hashCode(this.f16654l)) * 31)) * 31)) * 31) + ((int) (this.f16657q ^ (this.f16657q >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.f16659s)) * 31) + this.f16660t) * 31) + hco.m19336a(this.f16661u)) * 31) + ((int) (this.f16662v ^ (this.f16662v >>> 32)))) * 31)) * 31;
        if (!(this.o == null || this.o.m19329b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
