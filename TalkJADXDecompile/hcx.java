public final class hcx extends hck<hcx> {
    private static volatile hcx[] c;
    public String a;
    public String b;

    public hcx() {
        g();
    }

    private hcx b(hci hci) {
        while (true) {
            int a = hci.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = hci.g();
                    continue;
                case wi.dH /*18*/:
                    this.b = hci.g();
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

    public static hcx[] b() {
        if (c == null) {
            synchronized (hco.c) {
                if (c == null) {
                    c = new hcx[0];
                }
            }
        }
        return c;
    }

    private hcx g() {
        this.a = "";
        this.b = "";
        this.o = null;
        this.p = -1;
        return this;
    }

    protected int a() {
        int a = super.a();
        if (!this.a.equals("")) {
            a += hcj.b(1, this.a);
        }
        return !this.b.equals("") ? a + hcj.b(2, this.b) : a;
    }

    public /* synthetic */ hcq a(hci hci) {
        return b(hci);
    }

    public void a(hcj hcj) {
        if (!this.a.equals("")) {
            hcj.a(1, this.a);
        }
        if (!this.b.equals("")) {
            hcj.a(2, this.b);
        }
        super.a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcx)) {
            return false;
        }
        hcx hcx = (hcx) obj;
        if (this.a == null) {
            if (hcx.a != null) {
                return false;
            }
        } else if (!this.a.equals(hcx.a)) {
            return false;
        }
        if (this.b == null) {
            if (hcx.b != null) {
                return false;
            }
        } else if (!this.b.equals(hcx.b)) {
            return false;
        }
        return (this.o == null || this.o.b()) ? hcx.o == null || hcx.o.b() : this.o.equals(hcx.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (!(this.o == null || this.o.b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
