package defpackage;

import android.content.Context;
import android.text.TextUtils;

public abstract class erm implements erl, kcj, kcm, kcq {
    private final ero a;
    final int b;
    final jcf c;
    private final int d;
    private boolean e = true;
    private boolean f;
    private String g;
    private jcm h = new ern(this);

    public abstract void c();

    public erm(Context context, kbu kbu, int i, int i2) {
        this.c = (jcf) jyn.a(context, jcf.class);
        this.a = (ero) jyn.a(context, ero.class);
        ba.a(this.c.c(i));
        this.b = i;
        this.d = i2;
        kbu.a((kcq) this);
    }

    public String e() {
        return this.g;
    }

    public void a(String str) {
        if (!TextUtils.equals(this.g, str)) {
            f();
            this.g = str;
            c();
            d();
        }
    }

    public void T_() {
        this.e = true;
        f();
    }

    public void R_() {
        this.e = false;
        d();
    }

    private void d() {
        if (this.c.c(this.b) && !this.f && !this.e && this.g != null) {
            this.a.a(this.b, this.g, (erl) this, this.d);
            this.f = true;
            a(true);
            this.c.a(this.h);
        }
    }

    void f() {
        if (this.f) {
            this.a.a(this);
            this.f = false;
            a(false);
            this.c.b(this.h);
        }
    }

    public void a(boolean z) {
    }
}
