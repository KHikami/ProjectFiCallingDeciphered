public final class hct extends hck<hct> {
    public String[] a;
    public String[] b;
    public int[] c;
    public long[] d;

    public hct() {
        b();
    }

    private hct b() {
        this.a = hcs.f;
        this.b = hcs.f;
        this.c = hcs.a;
        this.d = hcs.b;
        this.o = null;
        this.p = -1;
        return this;
    }

    private hct b(hci hci) {
        while (true) {
            int a = hci.a();
            int a2;
            Object obj;
            int c;
            Object obj2;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    a2 = hcs.a(hci, 10);
                    a = this.a == null ? 0 : this.a.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.g();
                        hci.a();
                        a++;
                    }
                    obj[a] = hci.g();
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    a2 = hcs.a(hci, 18);
                    a = this.b == null ? 0 : this.b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.g();
                        hci.a();
                        a++;
                    }
                    obj[a] = hci.g();
                    this.b = obj;
                    continue;
                case wi.dA /*24*/:
                    a2 = hcs.a(hci, 24);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.e();
                        hci.a();
                        a++;
                    }
                    obj[a] = hci.e();
                    this.c = obj;
                    continue;
                case wi.dx /*26*/:
                    c = hci.c(hci.k());
                    a2 = hci.m();
                    a = 0;
                    while (hci.l() > 0) {
                        hci.e();
                        a++;
                    }
                    hci.e(a2);
                    a2 = this.c == null ? 0 : this.c.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = hci.e();
                        a2++;
                    }
                    this.c = obj2;
                    hci.d(c);
                    continue;
                case 32:
                    a2 = hcs.a(hci, 32);
                    a = this.d == null ? 0 : this.d.length;
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.d();
                        hci.a();
                        a++;
                    }
                    obj[a] = hci.d();
                    this.d = obj;
                    continue;
                case 34:
                    c = hci.c(hci.k());
                    a2 = hci.m();
                    a = 0;
                    while (hci.l() > 0) {
                        hci.d();
                        a++;
                    }
                    hci.e(a2);
                    a2 = this.d == null ? 0 : this.d.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = hci.d();
                        a2++;
                    }
                    this.d = obj2;
                    hci.d(c);
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
        int i2;
        int i3;
        int i4 = 0;
        int a = super.a();
        if (this.a == null || this.a.length <= 0) {
            i = a;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.a) {
                if (str != null) {
                    i3++;
                    i2 += hcj.a(str);
                }
            }
            i = (a + i2) + (i3 * 1);
        }
        if (this.b != null && this.b.length > 0) {
            i3 = 0;
            a = 0;
            for (String str2 : this.b) {
                if (str2 != null) {
                    a++;
                    i3 += hcj.a(str2);
                }
            }
            i = (i + i3) + (a * 1);
        }
        if (this.c != null && this.c.length > 0) {
            i3 = 0;
            for (int a2 : this.c) {
                i3 += hcj.a(a2);
            }
            i = (i + i3) + (this.c.length * 1);
        }
        if (this.d == null || this.d.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i4 < this.d.length) {
            i2 += hcj.a(this.d[i4]);
            i4++;
        }
        return (i + i2) + (this.d.length * 1);
    }

    public /* synthetic */ hcq a(hci hci) {
        return b(hci);
    }

    public void a(hcj hcj) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (String str : this.a) {
                if (str != null) {
                    hcj.a(1, str);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (String str2 : this.b) {
                if (str2 != null) {
                    hcj.a(2, str2);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int a : this.c) {
                hcj.a(3, a);
            }
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                hcj.a(4, this.d[i]);
                i++;
            }
        }
        super.a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hct)) {
            return false;
        }
        hct hct = (hct) obj;
        return !hco.a(this.a, hct.a) ? false : !hco.a(this.b, hct.b) ? false : !hco.a(this.c, hct.c) ? false : !hco.a(this.d, hct.d) ? false : (this.o == null || this.o.b()) ? hct.o == null || hct.o.b() : this.o.equals(hct.o);
    }

    public int hashCode() {
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + hco.a(this.a)) * 31) + hco.a(this.b)) * 31) + hco.a(this.c)) * 31) + hco.a(this.d)) * 31;
        int hashCode2 = (this.o == null || this.o.b()) ? 0 : this.o.hashCode();
        return hashCode2 + hashCode;
    }
}
