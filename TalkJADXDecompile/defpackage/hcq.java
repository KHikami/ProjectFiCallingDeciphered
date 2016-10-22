package defpackage;

import java.io.IOException;

/* renamed from: hcq */
public abstract class hcq {
    public volatile int p;

    public hcq() {
        this.p = -1;
    }

    public static final <T extends hcq> T a(T t, byte[] bArr, int i, int i2) {
        try {
            hci hci = new hci(bArr, 0, i2);
            t.a(hci);
            hci.a(0);
            return t;
        } catch (hcp e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final byte[] a(hcq hcq) {
        byte[] bArr = new byte[hcq.f()];
        try {
            hcj a = hcj.a(bArr, 0, bArr.length);
            hcq.a(a);
            a.a();
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    protected int a() {
        return 0;
    }

    public abstract hcq a(hci hci);

    public void a(hcj hcj) {
    }

    public /* synthetic */ Object clone() {
        return d();
    }

    public hcq d() {
        return (hcq) super.clone();
    }

    public int e() {
        if (this.p < 0) {
            f();
        }
        return this.p;
    }

    public int f() {
        int a = a();
        this.p = a;
        return a;
    }

    public String toString() {
        return gwb.a(this);
    }
}
