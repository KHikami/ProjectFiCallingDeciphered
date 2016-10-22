package defpackage;

import android.os.Bundle;
import com.google.api.client.http.HttpStatusCodes;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: jgz */
public final class jgz {
    static final long a;
    lka b;
    private final int c;
    private final Exception d;
    private final String e;
    private final long f;
    private int g;
    private Bundle h;
    private byte[] i;

    static {
        a = TimeUnit.DAYS.toMillis(1);
    }

    public jgz(boolean z) {
        this(z ? HttpStatusCodes.STATUS_CODE_OK : 0, null, null);
    }

    public jgz(int i, Exception exception, String str) {
        this.g = jha.c;
        this.c = i;
        this.d = exception;
        this.e = str;
        this.f = System.currentTimeMillis();
    }

    jgz(int i, Exception exception, String str, byte[] bArr, long j) {
        this.g = jha.c;
        this.c = i;
        this.d = exception;
        this.e = str;
        this.i = bArr;
        this.f = j;
    }

    public int a() {
        return this.c;
    }

    public Exception b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public Bundle d() {
        k();
        if (this.h == null) {
            this.h = new Bundle();
        }
        return this.h;
    }

    byte[] e() {
        i();
        return this.i;
    }

    public boolean f() {
        return this.c != HttpStatusCodes.STATUS_CODE_OK;
    }

    public static boolean a(jgz jgz) {
        return jgz != null && jgz.f();
    }

    long g() {
        return this.f;
    }

    boolean h() {
        return System.currentTimeMillis() - this.f > a;
    }

    public String toString() {
        if (f()) {
            return String.format(Locale.getDefault(), "TaskResult(message=%s, age=%s, errorCode=%d, exception=%s)", new Object[]{this.e, gwb.b(this.f), Integer.valueOf(this.c), this.d});
        }
        String str;
        if (this.h != null) {
            str = "Bundle(" + this.h.size() + ")";
        } else if (this.i != null) {
            str = "byte[" + this.i.length + "]";
        } else {
            str = "null";
        }
        return String.format(Locale.getDefault(), "TaskResult(message=%s, age=%s, extras=%s)", new Object[]{this.e, gwb.b(this.f), str});
    }

    void i() {
        if (this.h != null) {
            this.i = gwb.a(this.h);
            this.h = null;
        }
    }

    private void k() {
        if (this.i != null) {
            ClassLoader classLoader = getClass().getClassLoader();
            this.h = (Bundle) gwb.a(this.i, classLoader);
            this.h.setClassLoader(classLoader);
            this.i = null;
        }
    }

    void a(int i) {
        this.g = i;
    }

    int j() {
        return this.g;
    }
}
