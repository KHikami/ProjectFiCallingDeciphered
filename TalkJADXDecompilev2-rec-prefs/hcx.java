package p000;

public final class hcx extends hck<hcx> {
    private static volatile hcx[] f16664c;
    public String f16665a;
    public String f16666b;

    public hcx() {
        m19374g();
    }

    private hcx m19372b(hci hci) {
        while (true) {
            int a = hci.m19246a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f16665a = hci.m19259g();
                    continue;
                case wi.dH /*18*/:
                    this.f16666b = hci.m19259g();
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

    public static hcx[] m19373b() {
        if (f16664c == null) {
            synchronized (hco.f16622c) {
                if (f16664c == null) {
                    f16664c = new hcx[0];
                }
            }
        }
        return f16664c;
    }

    private hcx m19374g() {
        this.f16665a = "";
        this.f16666b = "";
        this.o = null;
        this.p = -1;
        return this;
    }

    protected int mo2448a() {
        int a = super.mo2448a();
        if (!this.f16665a.equals("")) {
            a += hcj.m19281b(1, this.f16665a);
        }
        return !this.f16666b.equals("") ? a + hcj.m19281b(2, this.f16666b) : a;
    }

    public /* synthetic */ hcq mo2452a(hci hci) {
        return m19372b(hci);
    }

    public void mo2449a(hcj hcj) {
        if (!this.f16665a.equals("")) {
            hcj.m19306a(1, this.f16665a);
        }
        if (!this.f16666b.equals("")) {
            hcj.m19306a(2, this.f16666b);
        }
        super.mo2449a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcx)) {
            return false;
        }
        hcx hcx = (hcx) obj;
        if (this.f16665a == null) {
            if (hcx.f16665a != null) {
                return false;
            }
        } else if (!this.f16665a.equals(hcx.f16665a)) {
            return false;
        }
        if (this.f16666b == null) {
            if (hcx.f16666b != null) {
                return false;
            }
        } else if (!this.f16666b.equals(hcx.f16666b)) {
            return false;
        }
        return (this.o == null || this.o.m19329b()) ? hcx.o == null || hcx.o.m19329b() : this.o.equals(hcx.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f16666b == null ? 0 : this.f16666b.hashCode()) + (((this.f16665a == null ? 0 : this.f16665a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (!(this.o == null || this.o.m19329b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
