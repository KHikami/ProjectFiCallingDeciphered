package p000;

public final class hcu extends hck<hcu> {
    public int f16637a;
    public String f16638b;
    public String f16639c;

    public hcu() {
        m19357b();
    }

    private hcu m19357b() {
        this.f16637a = 0;
        this.f16638b = "";
        this.f16639c = "";
        this.o = null;
        this.p = -1;
        return this;
    }

    private hcu m19358b(hci hci) {
        while (true) {
            int a = hci.m19246a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = hci.m19256e();
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
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                            this.f16637a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f16638b = hci.m19259g();
                    continue;
                case wi.dx /*26*/:
                    this.f16639c = hci.m19259g();
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
        if (this.f16637a != 0) {
            a += hcj.m19287c(1, this.f16637a);
        }
        if (!this.f16638b.equals("")) {
            a += hcj.m19281b(2, this.f16638b);
        }
        return !this.f16639c.equals("") ? a + hcj.m19281b(3, this.f16639c) : a;
    }

    public /* synthetic */ hcq mo2452a(hci hci) {
        return m19358b(hci);
    }

    public void mo2449a(hcj hcj) {
        if (this.f16637a != 0) {
            hcj.m19303a(1, this.f16637a);
        }
        if (!this.f16638b.equals("")) {
            hcj.m19306a(2, this.f16638b);
        }
        if (!this.f16639c.equals("")) {
            hcj.m19306a(3, this.f16639c);
        }
        super.mo2449a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcu)) {
            return false;
        }
        hcu hcu = (hcu) obj;
        if (this.f16637a != hcu.f16637a) {
            return false;
        }
        if (this.f16638b == null) {
            if (hcu.f16638b != null) {
                return false;
            }
        } else if (!this.f16638b.equals(hcu.f16638b)) {
            return false;
        }
        if (this.f16639c == null) {
            if (hcu.f16639c != null) {
                return false;
            }
        } else if (!this.f16639c.equals(hcu.f16639c)) {
            return false;
        }
        return (this.o == null || this.o.m19329b()) ? hcu.o == null || hcu.o.m19329b() : this.o.equals(hcu.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f16639c == null ? 0 : this.f16639c.hashCode()) + (((this.f16638b == null ? 0 : this.f16638b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f16637a) * 31)) * 31)) * 31;
        if (!(this.o == null || this.o.m19329b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
