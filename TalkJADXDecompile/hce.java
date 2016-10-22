public final class hce extends hck<hce> {
    public hcf[] a;

    public hce() {
        b();
    }

    public static hce a(byte[] bArr) {
        return (hce) hcq.a(new hce(), bArr, 0, bArr.length);
    }

    private hce b() {
        this.a = hcf.b();
        this.o = null;
        this.p = -1;
        return this;
    }

    private hce b(hci hci) {
        while (true) {
            int a = hci.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    int a2 = hcs.a(hci, 10);
                    a = this.a == null ? 0 : this.a.length;
                    Object obj = new hcf[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hcf();
                        hci.a(obj[a]);
                        hci.a();
                        a++;
                    }
                    obj[a] = new hcf();
                    hci.a(obj[a]);
                    this.a = obj;
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
        int a = super.a();
        if (this.a != null && this.a.length > 0) {
            for (hcq hcq : this.a) {
                if (hcq != null) {
                    a += hcj.b(1, hcq);
                }
            }
        }
        return a;
    }

    public /* synthetic */ hcq a(hci hci) {
        return b(hci);
    }

    public void a(hcj hcj) {
        if (this.a != null && this.a.length > 0) {
            for (hcq hcq : this.a) {
                if (hcq != null) {
                    hcj.a(1, hcq);
                }
            }
        }
        super.a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hce)) {
            return false;
        }
        hce hce = (hce) obj;
        return !hco.a(this.a, hce.a) ? false : (this.o == null || this.o.b()) ? hce.o == null || hce.o.b() : this.o.equals(hce.o);
    }

    public int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + hco.a(this.a)) * 31;
        int hashCode2 = (this.o == null || this.o.b()) ? 0 : this.o.hashCode();
        return hashCode2 + hashCode;
    }
}
