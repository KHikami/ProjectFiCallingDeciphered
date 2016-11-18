package p000;

import android.util.Log;

public final class aiv extends aie {
    public aiv() {
        try {
            m2446a(128);
            m2450b(18);
            m2569c("application/vnd.wap.multipart.related".getBytes());
            mo223a(new aic("insert-address-token".getBytes()));
            String str = "T";
            String valueOf = String.valueOf(Long.toHexString(System.currentTimeMillis()));
            if (valueOf.length() != 0) {
                valueOf = str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            m2570d(valueOf.getBytes());
        } catch (Throwable e) {
            Log.e("SendReq", "Unexpected InvalidHeaderValueException.", e);
            throw new RuntimeException(e);
        }
    }

    aiv(aim aim, aig aig) {
        super(aim, aig);
    }

    private void m2569c(byte[] bArr) {
        this.a.m2499a(bArr, 132);
    }

    public void m2575e(int i) {
        this.a.m2496a(i, 134);
    }

    public void m2572b(long j) {
        this.a.m2497a(j, 136);
    }

    public long mo225f() {
        return this.a.m2505e(142);
    }

    public void m2574c(long j) {
        this.a.m2497a(j, 142);
    }

    public void m2573b(byte[] bArr) {
        this.a.m2499a(bArr, 138);
    }

    public void m2577f(int i) {
        this.a.m2496a(i, 144);
    }

    public void m2571a(aic[] aicArr) {
        this.a.m2500a(aicArr, 151);
    }

    private void m2570d(byte[] bArr) {
        this.a.m2499a(bArr, 152);
    }
}
