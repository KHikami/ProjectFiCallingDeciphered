package p000;

public final class hct extends hck<hct> {
    public String[] f16633a;
    public String[] f16634b;
    public int[] f16635c;
    public long[] f16636d;

    public hct() {
        m19352b();
    }

    private hct m19352b() {
        this.f16633a = hcs.f16630f;
        this.f16634b = hcs.f16630f;
        this.f16635c = hcs.f16625a;
        this.f16636d = hcs.f16626b;
        this.o = null;
        this.p = -1;
        return this;
    }

    private hct m19353b(hci hci) {
        while (true) {
            int a = hci.m19246a();
            int a2;
            Object obj;
            int c;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = hcs.m19351a(hci, 10);
                    a = this.f16633a == null ? 0 : this.f16633a.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16633a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.m19259g();
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = hci.m19259g();
                    this.f16633a = obj;
                    continue;
                case wi.dH /*18*/:
                    a2 = hcs.m19351a(hci, 18);
                    a = this.f16634b == null ? 0 : this.f16634b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16634b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.m19259g();
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = hci.m19259g();
                    this.f16634b = obj;
                    continue;
                case wi.dA /*24*/:
                    a2 = hcs.m19351a(hci, 24);
                    a = this.f16635c == null ? 0 : this.f16635c.length;
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16635c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.m19256e();
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = hci.m19256e();
                    this.f16635c = obj;
                    continue;
                case wi.dx /*26*/:
                    c = hci.m19253c(hci.m19263k());
                    a2 = hci.m19265m();
                    a = 0;
                    while (hci.m19264l() > 0) {
                        hci.m19256e();
                        a++;
                    }
                    hci.m19257e(a2);
                    a2 = this.f16635c == null ? 0 : this.f16635c.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f16635c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = hci.m19256e();
                        a2++;
                    }
                    this.f16635c = obj2;
                    hci.m19255d(c);
                    continue;
                case 32:
                    a2 = hcs.m19351a(hci, 32);
                    a = this.f16636d == null ? 0 : this.f16636d.length;
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16636d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.m19254d();
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = hci.m19254d();
                    this.f16636d = obj;
                    continue;
                case 34:
                    c = hci.m19253c(hci.m19263k());
                    a2 = hci.m19265m();
                    a = 0;
                    while (hci.m19264l() > 0) {
                        hci.m19254d();
                        a++;
                    }
                    hci.m19257e(a2);
                    a2 = this.f16636d == null ? 0 : this.f16636d.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f16636d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = hci.m19254d();
                        a2++;
                    }
                    this.f16636d = obj2;
                    hci.m19255d(c);
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
        int i2;
        int i3;
        int i4 = 0;
        int a = super.mo2448a();
        if (this.f16633a == null || this.f16633a.length <= 0) {
            i = a;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f16633a) {
                if (str != null) {
                    i3++;
                    i2 += hcj.m19270a(str);
                }
            }
            i = (a + i2) + (i3 * 1);
        }
        if (this.f16634b != null && this.f16634b.length > 0) {
            i3 = 0;
            a = 0;
            for (String str2 : this.f16634b) {
                if (str2 != null) {
                    a++;
                    i3 += hcj.m19270a(str2);
                }
            }
            i = (i + i3) + (a * 1);
        }
        if (this.f16635c != null && this.f16635c.length > 0) {
            i3 = 0;
            for (int a2 : this.f16635c) {
                i3 += hcj.m19266a(a2);
            }
            i = (i + i3) + (this.f16635c.length * 1);
        }
        if (this.f16636d == null || this.f16636d.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i4 < this.f16636d.length) {
            i2 += hcj.m19267a(this.f16636d[i4]);
            i4++;
        }
        return (i + i2) + (this.f16636d.length * 1);
    }

    public /* synthetic */ hcq mo2452a(hci hci) {
        return m19353b(hci);
    }

    public void mo2449a(hcj hcj) {
        int i = 0;
        if (this.f16633a != null && this.f16633a.length > 0) {
            for (String str : this.f16633a) {
                if (str != null) {
                    hcj.m19306a(1, str);
                }
            }
        }
        if (this.f16634b != null && this.f16634b.length > 0) {
            for (String str2 : this.f16634b) {
                if (str2 != null) {
                    hcj.m19306a(2, str2);
                }
            }
        }
        if (this.f16635c != null && this.f16635c.length > 0) {
            for (int a : this.f16635c) {
                hcj.m19303a(3, a);
            }
        }
        if (this.f16636d != null && this.f16636d.length > 0) {
            while (i < this.f16636d.length) {
                hcj.m19304a(4, this.f16636d[i]);
                i++;
            }
        }
        super.mo2449a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hct)) {
            return false;
        }
        hct hct = (hct) obj;
        return !hco.m19344a(this.f16633a, hct.f16633a) ? false : !hco.m19344a(this.f16634b, hct.f16634b) ? false : !hco.m19342a(this.f16635c, hct.f16635c) ? false : !hco.m19343a(this.f16636d, hct.f16636d) ? false : (this.o == null || this.o.m19329b()) ? hct.o == null || hct.o.m19329b() : this.o.equals(hct.o);
    }

    public int hashCode() {
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + hco.m19338a(this.f16633a)) * 31) + hco.m19338a(this.f16634b)) * 31) + hco.m19336a(this.f16635c)) * 31) + hco.m19337a(this.f16636d)) * 31;
        int hashCode2 = (this.o == null || this.o.m19329b()) ? 0 : this.o.hashCode();
        return hashCode2 + hashCode;
    }
}
