package p000;

import android.content.Context;
import android.text.TextUtils;

public abstract class erm implements erl, kcj, kcm, kcq {
    private final ero f5402a;
    final int f5403b;
    final jcf f5404c;
    private final int f5405d;
    private boolean f5406e = true;
    private boolean f5407f;
    private String f5408g;
    private jcm f5409h = new ern(this);

    public abstract void mo983c();

    public erm(Context context, kbu kbu, int i, int i2) {
        this.f5404c = (jcf) jyn.m25426a(context, jcf.class);
        this.f5402a = (ero) jyn.m25426a(context, ero.class);
        ba.m4577a(this.f5404c.mo3467c(i));
        this.f5403b = i;
        this.f5405d = i2;
        kbu.m25514a((kcq) this);
    }

    public String m7741e() {
        return this.f5408g;
    }

    public void m7738a(String str) {
        if (!TextUtils.equals(this.f5408g, str)) {
            m7742f();
            this.f5408g = str;
            mo983c();
            mo1665d();
        }
    }

    public void T_() {
        this.f5406e = true;
        m7742f();
    }

    public void R_() {
        this.f5406e = false;
        mo1665d();
    }

    private void mo1665d() {
        if (this.f5404c.mo3467c(this.f5403b) && !this.f5407f && !this.f5406e && this.f5408g != null) {
            this.f5402a.m14331a(this.f5403b, this.f5408g, (erl) this, this.f5405d);
            this.f5407f = true;
            mo1664a(true);
            this.f5404c.mo3460a(this.f5409h);
        }
    }

    void m7742f() {
        if (this.f5407f) {
            this.f5402a.m14333a(this);
            this.f5407f = false;
            mo1664a(false);
            this.f5404c.mo3465b(this.f5409h);
        }
    }

    public void mo1664a(boolean z) {
    }
}
