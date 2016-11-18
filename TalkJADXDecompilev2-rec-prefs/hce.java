package p000;

public final class hce extends hck<hce> {
    public hcf[] f16576a;

    public hce() {
        m19216b();
    }

    public static hce m19215a(byte[] bArr) {
        return (hce) hcq.m19202a(new hce(), bArr, 0, bArr.length);
    }

    private hce m19216b() {
        this.f16576a = hcf.m19222b();
        this.o = null;
        this.p = -1;
        return this;
    }

    private hce m19217b(hci hci) {
        while (true) {
            int a = hci.m19246a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = hcs.m19351a(hci, 10);
                    a = this.f16576a == null ? 0 : this.f16576a.length;
                    Object obj = new hcf[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f16576a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hcf();
                        hci.m19248a(obj[a]);
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = new hcf();
                    hci.m19248a(obj[a]);
                    this.f16576a = obj;
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
        int a = super.mo2448a();
        if (this.f16576a != null && this.f16576a.length > 0) {
            for (hcq hcq : this.f16576a) {
                if (hcq != null) {
                    a += hcj.m19280b(1, hcq);
                }
            }
        }
        return a;
    }

    public /* synthetic */ hcq mo2452a(hci hci) {
        return m19217b(hci);
    }

    public void mo2449a(hcj hcj) {
        if (this.f16576a != null && this.f16576a.length > 0) {
            for (hcq hcq : this.f16576a) {
                if (hcq != null) {
                    hcj.m19305a(1, hcq);
                }
            }
        }
        super.mo2449a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hce)) {
            return false;
        }
        hce hce = (hce) obj;
        return !hco.m19344a(this.f16576a, hce.f16576a) ? false : (this.o == null || this.o.m19329b()) ? hce.o == null || hce.o.m19329b() : this.o.equals(hce.o);
    }

    public int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + hco.m19338a(this.f16576a)) * 31;
        int hashCode2 = (this.o == null || this.o.m19329b()) ? 0 : this.o.hashCode();
        return hashCode2 + hashCode;
    }
}
