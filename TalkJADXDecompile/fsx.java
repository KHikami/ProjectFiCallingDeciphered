import android.text.TextUtils;
import java.security.MessageDigest;

public final class fsx implements hwk {
    private final String a;
    private final String b;
    private final Iterable<Long> c;
    private final Iterable<hwm> d;
    private final Iterable<hwr> e;
    private final String f;
    private final boolean g;
    private final String h;
    private final String i;
    private final String[] j;

    public fsx(hwk hwk) {
        this.a = hwk.a();
        this.b = hwk.j();
        this.c = hwk.b();
        this.d = hwk.c();
        this.e = hwk.d();
        this.f = hwk.e();
        this.g = hwk.f();
        this.h = hwk.g();
        String str = null;
        try {
            str = hwk.h();
        } catch (Throwable e) {
            glk.c("Babel", "Caught NPE in getAvatarUrl", e);
        }
        this.i = str;
        this.j = hwk.i();
    }

    public void a(MessageDigest messageDigest) {
        byte b;
        int i = 0;
        a(messageDigest, a());
        a(messageDigest, j());
        for (Long a : this.c) {
            long a2 = gwb.a(a);
            byte[] bArr = new byte[8];
            for (int i2 = 7; i2 >= 0; i2--) {
                bArr[i2] = (byte) ((int) (255 & a2));
                a2 >>= 8;
            }
            messageDigest.update(bArr);
        }
        for (hwm hwm : c()) {
            a(messageDigest, hwm.a());
            a(messageDigest, hwm.b());
        }
        for (hwr hwr : d()) {
            a(messageDigest, hwr.a());
            a(messageDigest, hwr.b());
        }
        a(messageDigest, this.f);
        if (this.g) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        messageDigest.update(b);
        a(messageDigest, this.h);
        a(messageDigest, this.i);
        String[] strArr = this.j;
        int length = strArr.length;
        while (i < length) {
            a(messageDigest, strArr[i]);
            i++;
        }
    }

    private static void a(MessageDigest messageDigest, String str) {
        if (!TextUtils.isEmpty(str)) {
            messageDigest.update(str.getBytes());
        }
    }

    public String a() {
        return this.a;
    }

    public Iterable<Long> b() {
        return this.c;
    }

    public Iterable<hwm> c() {
        return this.d;
    }

    public Iterable<hwr> d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public String g() {
        return this.h;
    }

    public String h() {
        return this.i;
    }

    public String[] i() {
        return this.j;
    }

    public String j() {
        return this.b;
    }
}
