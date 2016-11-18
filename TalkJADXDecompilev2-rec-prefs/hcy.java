package p000;

public final class hcy extends hck<hcy> {
    public int f16667a;

    public hcy() {
        m19378b();
    }

    private hcy m19378b() {
        this.f16667a = -1;
        this.o = null;
        this.p = -1;
        return this;
    }

    private hcy m19379b(hci hci) {
        while (true) {
            int a = hci.m19246a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = hci.m19256e();
                    switch (a) {
                        case -1:
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
                            this.f16667a = a;
                            break;
                        default:
                            continue;
                    }
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
        return this.f16667a != -1 ? a + hcj.m19287c(1, this.f16667a) : a;
    }

    public /* synthetic */ hcq mo2452a(hci hci) {
        return m19379b(hci);
    }

    public void mo2449a(hcj hcj) {
        if (this.f16667a != -1) {
            hcj.m19303a(1, this.f16667a);
        }
        super.mo2449a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcy)) {
            return false;
        }
        hcy hcy = (hcy) obj;
        return this.f16667a != hcy.f16667a ? false : (this.o == null || this.o.m19329b()) ? hcy.o == null || hcy.o.m19329b() : this.o.equals(hcy.o);
    }

    public int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f16667a) * 31;
        int hashCode2 = (this.o == null || this.o.m19329b()) ? 0 : this.o.hashCode();
        return hashCode2 + hashCode;
    }
}
