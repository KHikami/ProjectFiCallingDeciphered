package defpackage;

public final class hcf extends hck<hcf> {
    private static volatile hcf[] c;
    public String a;
    public hcg b;

    public hcf() {
        g();
    }

    private hcf b(hci hci) {
        while (true) {
            int a = hci.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = hci.g();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new hcg();
                    }
                    hci.a(this.b);
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

    public static hcf[] b() {
        if (c == null) {
            synchronized (hco.c) {
                if (c == null) {
                    c = new hcf[0];
                }
            }
        }
        return c;
    }

    private hcf g() {
        this.a = "";
        this.b = null;
        this.o = null;
        this.p = -1;
        return this;
    }

    protected int a() {
        int a = super.a() + hcj.b(1, this.a);
        return this.b != null ? a + hcj.b(2, this.b) : a;
    }

    public /* synthetic */ hcq a(hci hci) {
        return b(hci);
    }

    public void a(hcj hcj) {
        hcj.a(1, this.a);
        if (this.b != null) {
            hcj.a(2, this.b);
        }
        super.a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcf)) {
            return false;
        }
        hcf hcf = (hcf) obj;
        if (this.a == null) {
            if (hcf.a != null) {
                return false;
            }
        } else if (!this.a.equals(hcf.a)) {
            return false;
        }
        if (this.b == null) {
            if (hcf.b != null) {
                return false;
            }
        } else if (!this.b.equals(hcf.b)) {
            return false;
        }
        return (this.o == null || this.o.b()) ? hcf.o == null || hcf.o.b() : this.o.equals(hcf.o);
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
