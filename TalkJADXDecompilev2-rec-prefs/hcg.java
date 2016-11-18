package p000;

public final class hcg extends hck<hcg> {
    private static volatile hcg[] f16580c;
    public int f16581a;
    public hch f16582b;

    public hcg() {
        m19229g();
    }

    private hcg m19227b(hci hci) {
        while (true) {
            int a = hci.m19246a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = hci.m19256e();
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
                            this.f16581a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f16582b == null) {
                        this.f16582b = new hch();
                    }
                    hci.m19248a(this.f16582b);
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

    public static hcg[] m19228b() {
        if (f16580c == null) {
            synchronized (hco.f16622c) {
                if (f16580c == null) {
                    f16580c = new hcg[0];
                }
            }
        }
        return f16580c;
    }

    private hcg m19229g() {
        this.f16581a = 1;
        this.f16582b = null;
        this.o = null;
        this.p = -1;
        return this;
    }

    protected int mo2448a() {
        int a = super.mo2448a() + hcj.m19287c(1, this.f16581a);
        return this.f16582b != null ? a + hcj.m19280b(2, this.f16582b) : a;
    }

    public /* synthetic */ hcq mo2452a(hci hci) {
        return m19227b(hci);
    }

    public void mo2449a(hcj hcj) {
        hcj.m19303a(1, this.f16581a);
        if (this.f16582b != null) {
            hcj.m19305a(2, this.f16582b);
        }
        super.mo2449a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcg)) {
            return false;
        }
        hcg hcg = (hcg) obj;
        if (this.f16581a != hcg.f16581a) {
            return false;
        }
        if (this.f16582b == null) {
            if (hcg.f16582b != null) {
                return false;
            }
        } else if (!this.f16582b.equals(hcg.f16582b)) {
            return false;
        }
        return (this.o == null || this.o.m19329b()) ? hcg.o == null || hcg.o.m19329b() : this.o.equals(hcg.o);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f16582b == null ? 0 : this.f16582b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f16581a) * 31)) * 31;
        if (!(this.o == null || this.o.m19329b())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }
}
