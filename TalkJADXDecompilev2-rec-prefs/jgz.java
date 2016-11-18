package p000;

import android.os.Bundle;
import com.google.api.client.http.HttpStatusCodes;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class jgz {
    static final long f20047a = TimeUnit.DAYS.toMillis(1);
    lka f20048b;
    private final int f20049c;
    private final Exception f20050d;
    private final String f20051e;
    private final long f20052f;
    private int f20053g;
    private Bundle f20054h;
    private byte[] f20055i;

    public jgz(boolean z) {
        this(z ? HttpStatusCodes.STATUS_CODE_OK : 0, null, null);
    }

    public jgz(int i, Exception exception, String str) {
        this.f20053g = jha.f20058c;
        this.f20049c = i;
        this.f20050d = exception;
        this.f20051e = str;
        this.f20052f = System.currentTimeMillis();
    }

    jgz(int i, Exception exception, String str, byte[] bArr, long j) {
        this.f20053g = jha.f20058c;
        this.f20049c = i;
        this.f20050d = exception;
        this.f20051e = str;
        this.f20055i = bArr;
        this.f20052f = j;
    }

    public int m24188a() {
        return this.f20049c;
    }

    public Exception m24190b() {
        return this.f20050d;
    }

    public String m24191c() {
        return this.f20051e;
    }

    public Bundle m24192d() {
        m24187k();
        if (this.f20054h == null) {
            this.f20054h = new Bundle();
        }
        return this.f20054h;
    }

    byte[] m24193e() {
        m24197i();
        return this.f20055i;
    }

    public boolean m24194f() {
        return this.f20049c != HttpStatusCodes.STATUS_CODE_OK;
    }

    public static boolean m24186a(jgz jgz) {
        return jgz != null && jgz.m24194f();
    }

    long m24195g() {
        return this.f20052f;
    }

    boolean m24196h() {
        return System.currentTimeMillis() - this.f20052f > f20047a;
    }

    public String toString() {
        if (m24194f()) {
            return String.format(Locale.getDefault(), "TaskResult(message=%s, age=%s, errorCode=%d, exception=%s)", new Object[]{this.f20051e, gwb.m1995b(this.f20052f), Integer.valueOf(this.f20049c), this.f20050d});
        }
        String str;
        if (this.f20054h != null) {
            str = "Bundle(" + this.f20054h.size() + ")";
        } else if (this.f20055i != null) {
            str = "byte[" + this.f20055i.length + "]";
        } else {
            str = "null";
        }
        return String.format(Locale.getDefault(), "TaskResult(message=%s, age=%s, extras=%s)", new Object[]{this.f20051e, gwb.m1995b(this.f20052f), str});
    }

    void m24197i() {
        if (this.f20054h != null) {
            this.f20055i = gwb.m1947a(this.f20054h);
            this.f20054h = null;
        }
    }

    private void m24187k() {
        if (this.f20055i != null) {
            ClassLoader classLoader = getClass().getClassLoader();
            this.f20054h = (Bundle) gwb.m1579a(this.f20055i, classLoader);
            this.f20054h.setClassLoader(classLoader);
            this.f20055i = null;
        }
    }

    void m24189a(int i) {
        this.f20053g = i;
    }

    int m24198j() {
        return this.f20053g;
    }
}
