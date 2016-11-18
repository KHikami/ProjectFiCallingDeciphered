package p000;

public final class hcf extends hck<hcf> {
    private static volatile hcf[] f16577c;
    public String f16578a;
    public hcg f16579b;

    public hcf() {
        m19223g();
    }

    private hcf m19221b(hci hci) {
        while (true) {
            int a = hci.m19246a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f16578a = hci.m19259g();
                    continue;
                case wi.dH /*18*/:
                    if (this.f16579b == null) {
                        this.f16579b = new hcg();
                    }
                    hci.m19248a(this.f16579b);
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

    public static hcf[] m19222b() {
        if (f16577c == null) {
            synchronized (hco.f16622c) {
                if (f16577c == null) {
                    f16577c = new hcf[0];
                }
            }
        }
        return f16577c;
    }

    private hcf m19223g() {
        this.f16578a = "";
        this.f16579b = null;
        this.o = null;
        this.p = -1;
        return this;
    }

    protected int mo2448a() {
        int a = super.mo2448a() + hcj.m19281b(1, this.f16578a);
        return this.f16579b != null ? a + hcj.m19280b(2, this.f16579b) : a;
    }

    public /* synthetic */ hcq mo2452a(hci hci) {
        return m19221b(hci);
    }

    public void mo2449a(hcj hcj) {
        hcj.m19306a(1, this.f16578a);
        if (this.f16579b != null) {
            hcj.m19305a(2, this.f16579b);
        }
        super.mo2449a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcf)) {
            return false;
        }
        hcf hcf = (hcf) obj;
        if (this.f16578a == null) {
            if (hcf.f16578a != null) {
                return false;
            }
        } else if (!this.f16578a.equals(hcf.f16578a)) {
            return false;
        }
        if (this.f16579b == null) {
            if (hcf.f16579b != null) {
                return false;
            }
        } else if (!this.f16579b.equals(hcf.f16579b)) {
            return false;
        }
        return (this.o == null || this.o.m19329b()) ? hcf.o == null || hcf.o.m19329b() : this.o.equals(hcf.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f16579b == null ? 0 : this.f16579b.hashCode()) + (((this.f16578a == null ? 0 : this.f16578a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (!(this.o == null || this.o.m19329b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
