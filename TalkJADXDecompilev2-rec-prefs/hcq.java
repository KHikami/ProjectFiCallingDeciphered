package p000;

import java.io.IOException;

public abstract class hcq {
    public volatile int f16574p = -1;

    public static final <T extends hcq> T m19202a(T t, byte[] bArr, int i, int i2) {
        try {
            hci hci = new hci(bArr, 0, i2);
            t.mo2452a(hci);
            hci.m19247a(0);
            return t;
        } catch (hcp e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final byte[] m19203a(hcq hcq) {
        byte[] bArr = new byte[hcq.m19209f()];
        try {
            hcj a = hcj.m19272a(bArr, 0, bArr.length);
            hcq.mo2449a(a);
            a.m19300a();
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    protected int mo2448a() {
        return 0;
    }

    public abstract hcq mo2452a(hci hci);

    public void mo2449a(hcj hcj) {
    }

    public /* synthetic */ Object clone() {
        return mo2451d();
    }

    public hcq mo2451d() {
        return (hcq) super.clone();
    }

    public int m19208e() {
        if (this.f16574p < 0) {
            m19209f();
        }
        return this.f16574p;
    }

    public int m19209f() {
        int a = mo2448a();
        this.f16574p = a;
        return a;
    }

    public String toString() {
        return gwb.m1663a(this);
    }
}
