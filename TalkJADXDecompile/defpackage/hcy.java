package defpackage;

/* renamed from: hcy */
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
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = hci.e();
                    switch (a) {
                        case -1:
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.dD /*13*/:
                        case wi.g /*14*/:
                        case wi.dJ /*15*/:
                        case wi.dI /*16*/:
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
