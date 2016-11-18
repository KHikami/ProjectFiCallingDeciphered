package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class jgc {
    private static final long a = TimeUnit.MINUTES.toMillis(3);
    private final Context b;
    private String c;
    private int d;
    jgd e;
    int f;
    private boolean g;
    private boolean h;
    private int i;
    private long j;

    @Deprecated
    public jgc(Context context, String str) {
        this.f = jha.c;
        this.j = a;
        this.b = context != null ? context.getApplicationContext() : null;
        this.c = str;
        if (str == null) {
            throw new IllegalArgumentException("BackgroundTask tag cannot be null.");
        }
    }

    public jgc(String str) {
        this(null, str);
    }

    @Deprecated
    public jgz c() {
        return null;
    }

    public jgz a(Context context) {
        return null;
    }

    protected void d() {
    }

    public void b() {
    }

    public Executor a() {
        return null;
    }

    @Deprecated
    Context e() {
        return this.b;
    }

    public jgc a(boolean z) {
        this.g = true;
        return this;
    }

    public boolean f() {
        return this.g;
    }

    void c(Context context) {
        boolean z = (context == null && this.b == null) ? false : true;
        ba.a(z);
        if (context == null) {
            context = this.b;
        }
        if (this.h && this.i == 0) {
            this.i = jgy.a(context).a(this.c, this.j);
        }
    }

    void d(Context context) {
        boolean z = (context == null && this.b == null) ? false : true;
        ba.a(z);
        if (context == null) {
            context = this.b;
        }
        if (this.i != 0) {
            jgy.a(context).a(this.i);
        }
    }

    @Deprecated
    public String g() {
        return null;
    }

    public String b(Context context) {
        return null;
    }

    @Deprecated
    public String h() {
        return null;
    }

    public String i() {
        return null;
    }

    public String j() {
        return this.c;
    }

    void a(int i) {
        this.d = i;
    }

    int k() {
        return this.d;
    }

    void a(jgd jgd) {
        this.e = jgd;
    }

    public jgc(String str, byte b) {
        this(str);
    }

    public jgc(String str, char c) {
        this(str);
    }
}
