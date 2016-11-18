package defpackage;

public final class hcg extends hck<hcg> {
    private static volatile hcg[] c;
    public int a;
    public hch b;

    public hcg() {
        g();
    }

    private hcg b(hci hci) {
        while (true) {
            int a = hci.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = hci.e();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new hch();
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

    public static hcg[] b() {
        if (c == null) {
            synchronized (hco.c) {
                if (c == null) {
                    c = new hcg[0];
                }
            }
        }
        return c;
    }

    private hcg g() {
        this.a = 1;
        this.b = null;
        this.o = null;
        this.p = -1;
        return this;
    }

    protected int a() {
        int a = super.a() + hcj.c(1, this.a);
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
        if (!(obj instanceof hcg)) {
            return false;
        }
        hcg hcg = (hcg) obj;
        if (this.a != hcg.a) {
            return false;
        }
        if (this.b == null) {
            if (hcg.b != null) {
                return false;
            }
        } else if (!this.b.equals(hcg.b)) {
            return false;
        }
        return (this.o == null || this.o.b()) ? hcg.o == null || hcg.o.b() : this.o.equals(hcg.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31)) * 31;
        if (!(this.o == null || this.o.b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
