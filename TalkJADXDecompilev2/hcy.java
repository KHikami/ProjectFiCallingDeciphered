package defpackage;

public final class hcy extends hck<hcy> {
    public int a;

    public hcy() {
        b();
    }

    private hcy b() {
        this.a = -1;
        this.o = null;
        this.p = -1;
        return this;
    }

    private hcy b(hci hci) {
        while (true) {
            int a = hci.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = hci.e();
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
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
        return this.a != -1 ? a + hcj.c(1, this.a) : a;
    }

    public /* synthetic */ hcq a(hci hci) {
        return b(hci);
    }

    public void a(hcj hcj) {
        if (this.a != -1) {
            hcj.a(1, this.a);
        }
        super.a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcy)) {
            return false;
        }
        hcy hcy = (hcy) obj;
        return this.a != hcy.a ? false : (this.o == null || this.o.b()) ? hcy.o == null || hcy.o.b() : this.o.equals(hcy.o);
    }

    public int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.a) * 31;
        int hashCode2 = (this.o == null || this.o.b()) ? 0 : this.o.hashCode();
        return hashCode2 + hashCode;
    }
}
