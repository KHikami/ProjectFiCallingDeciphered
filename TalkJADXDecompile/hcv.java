import java.util.Arrays;

public final class hcv extends hck<hcv> {
    public byte[] a;
    public byte[][] b;
    public boolean c;

    public hcv() {
        b();
    }

    private hcv b() {
        this.a = hcs.h;
        this.b = hcs.g;
        this.c = false;
        this.o = null;
        this.p = -1;
        return this;
    }

    private hcv b(hci hci) {
        while (true) {
            int a = hci.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = hci.h();
                    continue;
                case wi.dH /*18*/:
                    int a2 = hcs.a(hci, 18);
                    a = this.b == null ? 0 : this.b.length;
                    Object obj = new byte[(a2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.h();
                        hci.a();
                        a++;
                    }
                    obj[a] = hci.h();
                    this.b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.c = hci.f();
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
        int i = 0;
        int a = super.a();
        if (!Arrays.equals(this.a, hcs.h)) {
            a += hcj.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.b.length) {
                byte[] bArr = this.b[i];
                if (bArr != null) {
                    i3++;
                    i2 += hcj.a(bArr);
                }
                i++;
            }
            a = (a + i2) + (i3 * 1);
        }
        if (!this.c) {
            return a;
        }
        boolean z = this.c;
        return a + (hcj.b(3) + 1);
    }

    public /* synthetic */ hcq a(hci hci) {
        return b(hci);
    }

    public void a(hcj hcj) {
        if (!Arrays.equals(this.a, hcs.h)) {
            hcj.a(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (byte[] bArr : this.b) {
                if (bArr != null) {
                    hcj.a(2, bArr);
                }
            }
        }
        if (this.c) {
            hcj.a(3, this.c);
        }
        super.a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcv)) {
            return false;
        }
        hcv hcv = (hcv) obj;
        return !Arrays.equals(this.a, hcv.a) ? false : !hco.a(this.b, hcv.b) ? false : this.c != hcv.c ? false : (this.o == null || this.o.b()) ? hcv.o == null || hcv.o.b() : this.o.equals(hcv.o);
    }

    public int hashCode() {
        int hashCode = ((this.c ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.a)) * 31) + hco.a(this.b)) * 31)) * 31;
        int hashCode2 = (this.o == null || this.o.b()) ? 0 : this.o.hashCode();
        return hashCode2 + hashCode;
    }
}
