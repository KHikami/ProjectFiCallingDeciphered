package p000;

import java.util.Arrays;

public final class hcv extends hck<hcv> {
    public byte[] f16640a;
    public byte[][] f16641b;
    public boolean f16642c;

    public hcv() {
        m19362b();
    }

    private hcv m19362b() {
        this.f16640a = hcs.f16632h;
        this.f16641b = hcs.f16631g;
        this.f16642c = false;
        this.o = null;
        this.p = -1;
        return this;
    }

    private hcv m19363b(hci hci) {
        while (true) {
            int a = hci.m19246a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f16640a = hci.m19260h();
                    continue;
                case wi.dH /*18*/:
                    int a2 = hcs.m19351a(hci, 18);
                    a = this.f16641b == null ? 0 : this.f16641b.length;
                    Object obj = new byte[(a2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f16641b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = hci.m19260h();
                        hci.m19246a();
                        a++;
                    }
                    obj[a] = hci.m19260h();
                    this.f16641b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f16642c = hci.m19258f();
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
        int i = 0;
        int a = super.mo2448a();
        if (!Arrays.equals(this.f16640a, hcs.f16632h)) {
            a += hcj.m19282b(1, this.f16640a);
        }
        if (this.f16641b != null && this.f16641b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f16641b.length) {
                byte[] bArr = this.f16641b[i];
                if (bArr != null) {
                    i3++;
                    i2 += hcj.m19271a(bArr);
                }
                i++;
            }
            a = (a + i2) + (i3 * 1);
        }
        if (!this.f16642c) {
            return a;
        }
        boolean z = this.f16642c;
        return a + (hcj.m19279b(3) + 1);
    }

    public /* synthetic */ hcq mo2452a(hci hci) {
        return m19363b(hci);
    }

    public void mo2449a(hcj hcj) {
        if (!Arrays.equals(this.f16640a, hcs.f16632h)) {
            hcj.m19308a(1, this.f16640a);
        }
        if (this.f16641b != null && this.f16641b.length > 0) {
            for (byte[] bArr : this.f16641b) {
                if (bArr != null) {
                    hcj.m19308a(2, bArr);
                }
            }
        }
        if (this.f16642c) {
            hcj.m19307a(3, this.f16642c);
        }
        super.mo2449a(hcj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcv)) {
            return false;
        }
        hcv hcv = (hcv) obj;
        return !Arrays.equals(this.f16640a, hcv.f16640a) ? false : !hco.m19345a(this.f16641b, hcv.f16641b) ? false : this.f16642c != hcv.f16642c ? false : (this.o == null || this.o.m19329b()) ? hcv.o == null || hcv.o.m19329b() : this.o.equals(hcv.o);
    }

    public int hashCode() {
        int hashCode = ((this.f16642c ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f16640a)) * 31) + hco.m19339a(this.f16641b)) * 31)) * 31;
        int hashCode2 = (this.o == null || this.o.m19329b()) ? 0 : this.o.hashCode();
        return hashCode2 + hashCode;
    }
}
