package defpackage;

public final class hcu extends hck<hcu> {
    public int a;
    public String b;
    public String c;

    public hcu() {
        b();
    }

    private hcu b() {
        this.a = 0;
        this.b = "";
        this.c = "";
        this.o = null;
        this.p = -1;
        return this;
    }

    private hcu b(hci hci) {
        while (true) {
            int a = hci.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = hci.e();
                    switch (a) {
                        case 0:
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
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.b = hci.g();
                    continue;
                case wi.dx /*26*/:
                    this.c = hci.g();
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
        if (this.a != 0) {
            a += hcj.c(1, this.a);
        }
        if (!this.b.equals("")) {
            a += hcj.b(2, this.b);
        }
        return !this.c.equals("") ? a + hcj.b(3, this.c) : a;
    }

    public /* synthetic */ hcq a(hci hci) {
        return b(hci);
    }

    public void a(hcj hcj) {
        if (this.a != 0) {
            hcj.a(1, this.a);
        }
        if (!this.b.equals("")) {
            hcj.a(2, this.b);
        }
        if (!this.c.equals("")) {
            hcj.a(3, this.c);
        }
        super.a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcu)) {
            return false;
        }
        hcu hcu = (hcu) obj;
        if (this.a != hcu.a) {
            return false;
        }
        if (this.b == null) {
            if (hcu.b != null) {
                return false;
            }
        } else if (!this.b.equals(hcu.b)) {
            return false;
        }
        if (this.c == null) {
            if (hcu.c != null) {
                return false;
            }
        } else if (!this.c.equals(hcu.c)) {
            return false;
        }
        return (this.o == null || this.o.b()) ? hcu.o == null || hcu.o.b() : this.o.equals(hcu.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31)) * 31)) * 31;
        if (!(this.o == null || this.o.b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
