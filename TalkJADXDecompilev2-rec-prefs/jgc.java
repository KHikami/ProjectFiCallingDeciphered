package p000;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class jgc {
    private static final long f4186a = TimeUnit.MINUTES.toMillis(3);
    private final Context f4187b;
    private String f4188c;
    private int f4189d;
    jgd f4190e;
    int f4191f;
    private boolean f4192g;
    private boolean f4193h;
    private int f4194i;
    private long f4195j;

    @Deprecated
    public jgc(Context context, String str) {
        this.f4191f = jha.f20058c;
        this.f4195j = f4186a;
        this.f4187b = context != null ? context.getApplicationContext() : null;
        this.f4188c = str;
        if (str == null) {
            throw new IllegalArgumentException("BackgroundTask tag cannot be null.");
        }
    }

    public jgc(String str) {
        this(null, str);
    }

    @Deprecated
    public jgz mo2093c() {
        return null;
    }

    public jgz mo648a(Context context) {
        return null;
    }

    protected void m6404d() {
    }

    public void mo1649b() {
    }

    public Executor mo763a() {
        return null;
    }

    @Deprecated
    Context m6406e() {
        return this.f4187b;
    }

    public jgc m6396a(boolean z) {
        this.f4192g = true;
        return this;
    }

    public boolean m6407f() {
        return this.f4192g;
    }

    void m6403c(Context context) {
        boolean z = (context == null && this.f4187b == null) ? false : true;
        ba.m4577a(z);
        if (context == null) {
            context = this.f4187b;
        }
        if (this.f4193h && this.f4194i == 0) {
            this.f4194i = jgy.m24183a(context).m24184a(this.f4188c, this.f4195j);
        }
    }

    void m6405d(Context context) {
        boolean z = (context == null && this.f4187b == null) ? false : true;
        ba.m4577a(z);
        if (context == null) {
            context = this.f4187b;
        }
        if (this.f4194i != 0) {
            jgy.m24183a(context).m24185a(this.f4194i);
        }
    }

    @Deprecated
    public String m6408g() {
        return null;
    }

    public String mo649b(Context context) {
        return null;
    }

    @Deprecated
    public String m6409h() {
        return null;
    }

    public String m6410i() {
        return null;
    }

    public String m6411j() {
        return this.f4188c;
    }

    void m6398a(int i) {
        this.f4189d = i;
    }

    int m6412k() {
        return this.f4189d;
    }

    void m6399a(jgd jgd) {
        this.f4190e = jgd;
    }

    public jgc(String str, byte b) {
        this(str);
    }

    public jgc(String str, char c) {
        this(str);
    }
}
