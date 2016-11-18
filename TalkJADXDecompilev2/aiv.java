package defpackage;

import android.util.Log;

public final class aiv extends aie {
    public aiv() {
        try {
            a(128);
            b(18);
            c("application/vnd.wap.multipart.related".getBytes());
            a(new aic("insert-address-token".getBytes()));
            String str = "T";
            String valueOf = String.valueOf(Long.toHexString(System.currentTimeMillis()));
            if (valueOf.length() != 0) {
                valueOf = str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            d(valueOf.getBytes());
        } catch (Throwable e) {
            Log.e("SendReq", "Unexpected InvalidHeaderValueException.", e);
            throw new RuntimeException(e);
        }
    }

    aiv(aim aim, aig aig) {
        super(aim, aig);
    }

    private void c(byte[] bArr) {
        this.a.a(bArr, 132);
    }

    public void e(int i) {
        this.a.a(i, 134);
    }

    public void b(long j) {
        this.a.a(j, 136);
    }

    public long f() {
        return this.a.e(142);
    }

    public void c(long j) {
        this.a.a(j, 142);
    }

    public void b(byte[] bArr) {
        this.a.a(bArr, 138);
    }

    public void f(int i) {
        this.a.a(i, 144);
    }

    public void a(aic[] aicArr) {
        this.a.a(aicArr, 151);
    }

    private void d(byte[] bArr) {
        this.a.a(bArr, 152);
    }
}
