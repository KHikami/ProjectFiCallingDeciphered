package p000;

import android.text.TextUtils;
import java.security.MessageDigest;

public final class fsx implements hwk {
    private final String f13941a;
    private final String f13942b;
    private final Iterable<Long> f13943c;
    private final Iterable<hwm> f13944d;
    private final Iterable<hwr> f13945e;
    private final String f13946f;
    private final boolean f13947g;
    private final String f13948h;
    private final String f13949i;
    private final String[] f13950j;

    public fsx(hwk hwk) {
        this.f13941a = hwk.mo2077a();
        this.f13942b = hwk.mo2086j();
        this.f13943c = hwk.mo2078b();
        this.f13944d = hwk.mo2079c();
        this.f13945e = hwk.mo2080d();
        this.f13946f = hwk.mo2081e();
        this.f13947g = hwk.mo2082f();
        this.f13948h = hwk.mo2083g();
        String str = null;
        try {
            str = hwk.mo2084h();
        } catch (Throwable e) {
            glk.m17978c("Babel", "Caught NPE in getAvatarUrl", e);
        }
        this.f13949i = str;
        this.f13950j = hwk.mo2085i();
    }

    public void m16172a(MessageDigest messageDigest) {
        byte b;
        int i = 0;
        fsx.m16170a(messageDigest, mo2077a());
        fsx.m16170a(messageDigest, mo2086j());
        for (Long a : this.f13943c) {
            long a2 = gwb.m1523a(a);
            byte[] bArr = new byte[8];
            for (int i2 = 7; i2 >= 0; i2--) {
                bArr[i2] = (byte) ((int) (255 & a2));
                a2 >>= 8;
            }
            messageDigest.update(bArr);
        }
        for (hwm hwm : mo2079c()) {
            fsx.m16170a(messageDigest, hwm.mo2950a());
            fsx.m16170a(messageDigest, hwm.mo2951b());
        }
        for (hwr hwr : mo2080d()) {
            fsx.m16170a(messageDigest, hwr.mo2954a());
            fsx.m16170a(messageDigest, hwr.mo2955b());
        }
        fsx.m16170a(messageDigest, this.f13946f);
        if (this.f13947g) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        messageDigest.update(b);
        fsx.m16170a(messageDigest, this.f13948h);
        fsx.m16170a(messageDigest, this.f13949i);
        String[] strArr = this.f13950j;
        int length = strArr.length;
        while (i < length) {
            fsx.m16170a(messageDigest, strArr[i]);
            i++;
        }
    }

    private static void m16170a(MessageDigest messageDigest, String str) {
        if (!TextUtils.isEmpty(str)) {
            messageDigest.update(str.getBytes());
        }
    }

    public String mo2077a() {
        return this.f13941a;
    }

    public Iterable<Long> mo2078b() {
        return this.f13943c;
    }

    public Iterable<hwm> mo2079c() {
        return this.f13944d;
    }

    public Iterable<hwr> mo2080d() {
        return this.f13945e;
    }

    public String mo2081e() {
        return this.f13946f;
    }

    public boolean mo2082f() {
        return this.f13947g;
    }

    public String mo2083g() {
        return this.f13948h;
    }

    public String mo2084h() {
        return this.f13949i;
    }

    public String[] mo2085i() {
        return this.f13950j;
    }

    public String mo2086j() {
        return this.f13942b;
    }
}
