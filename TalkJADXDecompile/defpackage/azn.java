package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;

/* renamed from: azn */
public final class azn<R> implements azi, azm, azw, bay {
    public static final ll<azn<?>> a;
    public azj b;
    public amk c;
    public Object d;
    public Class<R> e;
    public azh<?> f;
    public int g;
    public int h;
    public amq i;
    public azx<R> j;
    public azk<R> k;
    public apw l;
    public bad<? super R> m;
    public int n;
    private final String o;
    private final bba p;
    private aqr<R> q;
    private aqb r;
    private long s;
    private Drawable t;
    private Drawable u;
    private Drawable v;
    private int w;
    private int x;

    static {
        a = bas.a(150, new azo());
    }

    public azn() {
        this.o = String.valueOf(hashCode());
        this.p = bba.a();
    }

    public bba j_() {
        return this.p;
    }

    public void i() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = -1;
        this.h = -1;
        this.j = null;
        this.k = null;
        this.b = null;
        this.m = null;
        this.r = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = -1;
        this.x = -1;
        a.a(this);
    }

    public void a() {
        this.p.b();
        this.s = bam.a();
        if (this.d == null) {
            if (baq.a(this.g, this.h)) {
                this.w = this.g;
                this.x = this.h;
            }
            a(new aqm("Received null model"), l() == null ? 5 : 3);
            return;
        }
        this.n = azp.c;
        if (baq.a(this.g, this.h)) {
            a(this.g, this.h);
        } else {
            this.j.a((azw) this);
        }
        if ((this.n == azp.b || this.n == azp.c) && m()) {
            this.j.b(k());
        }
        if (Log.isLoggable("Request", 2)) {
            a("finished run method in " + bam.a(this.s));
        }
    }

    private void j() {
        this.p.b();
        this.n = azp.f;
        if (this.r != null) {
            this.r.a();
            this.r = null;
        }
    }

    public void c() {
        baq.a();
        if (this.n != azp.g) {
            j();
            if (this.q != null) {
                a(this.q);
            }
            if (m()) {
                this.j.d(k());
            }
            this.n = azp.g;
        }
    }

    public void b() {
        c();
        this.n = azp.h;
    }

    public boolean e() {
        return this.n == azp.b || this.n == azp.c;
    }

    public boolean f() {
        return this.n == azp.d;
    }

    public boolean g() {
        return f();
    }

    public boolean h() {
        return this.n == azp.f || this.n == azp.g;
    }

    private Drawable k() {
        if (this.u == null) {
            this.u = this.f.f;
            if (this.u == null && this.f.g > 0) {
                this.u = a(this.f.g);
            }
        }
        return this.u;
    }

    private Drawable l() {
        if (this.v == null) {
            this.v = this.f.n;
            if (this.v == null && this.f.o > 0) {
                this.v = a(this.f.o);
            }
        }
        return this.v;
    }

    private Drawable a(int i) {
        return gwb.a(this.c.getResources(), i, this.f.t);
    }

    public void a(int i, int i2) {
        this.p.b();
        if (Log.isLoggable("Request", 2)) {
            a("Got onSizeReady in " + bam.a(this.s));
        }
        if (this.n == azp.c) {
            this.n = azp.b;
            float f = this.f.a;
            this.w = azn.a(i, f);
            this.x = azn.a(i2, f);
            if (Log.isLoggable("Request", 2)) {
                a("finished setup for calling load in " + bam.a(this.s));
            }
            this.r = this.l.a(this.c, this.d, this.f.k, this.w, this.x, this.f.r, this.e, this.i, this.f.b, this.f.q, this.f.l, this.f.p, this.f.h, this.f.u, this);
            if (Log.isLoggable("Request", 2)) {
                a("finished onSizeReady in " + bam.a(this.s));
            }
        }
    }

    private static int a(int i, float f) {
        return i == nzf.UNSET_ENUM_VALUE ? i : Math.round(((float) i) * f);
    }

    private boolean m() {
        return this.b == null || this.b.b(this);
    }

    private boolean n() {
        return this.b == null || !this.b.d();
    }

    public void a(aqr<?> aqr_, anq anq) {
        this.p.b();
        this.r = null;
        if (aqr_ == null) {
            String valueOf = String.valueOf(this.e);
            a(new aqm(new StringBuilder(String.valueOf(valueOf).length() + 82).append("Expected to receive a Resource<R> with an object of ").append(valueOf).append(" inside, but instead got null.").toString()));
            return;
        }
        Object c = aqr_.c();
        if (c == null || !this.e.isAssignableFrom(c.getClass())) {
            a((aqr) aqr_);
            String valueOf2 = String.valueOf(this.e);
            String valueOf3 = String.valueOf(c != null ? c.getClass() : "");
            String valueOf4 = String.valueOf(c);
            String valueOf5 = String.valueOf(aqr_);
            String str = c != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            a(new aqm(new StringBuilder(((((String.valueOf(valueOf2).length() + 71) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(str).length()).append("Expected to receive an object of ").append(valueOf2).append(" but instead got ").append(valueOf3).append("{").append(valueOf4).append("} inside Resource{").append(valueOf5).append("}.").append(str).toString()));
            return;
        }
        Object obj;
        if (this.b == null || this.b.a(this)) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            a((aqr) aqr_);
            this.n = azp.d;
            return;
        }
        boolean n = n();
        this.n = azp.d;
        this.q = aqr_;
        if (this.c.d() <= 3) {
            str = String.valueOf(c.getClass().getSimpleName());
            String valueOf6 = String.valueOf(anq);
            valueOf2 = String.valueOf(this.d);
            new StringBuilder(((String.valueOf(str).length() + 95) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf2).length()).append("Finished loading ").append(str).append(" from ").append(valueOf6).append(" for ").append(valueOf2).append(" with size [").append(this.w).append("x").append(this.x).append("] in ").append(bam.a(this.s)).append(" ms");
        }
        if (this.k == null || !this.k.a(c, this.d, this.j, anq, n)) {
            this.j.a(c, this.m.a());
        }
        if (this.b != null) {
            this.b.c(this);
        }
    }

    public void a(aqm aqm) {
        a(aqm, 5);
    }

    private void a(aqm aqm, int i) {
        this.p.b();
        int d = this.c.d();
        if (d <= i) {
            String valueOf = String.valueOf(this.d);
            int i2 = this.w;
            new StringBuilder(String.valueOf(valueOf).length() + 52).append("Load failed for ").append(valueOf).append(" with size [").append(i2).append("x").append(this.x).append("]");
            if (d <= 4) {
                aqm.a("Glide");
            }
        }
        this.r = null;
        this.n = azp.e;
        if (this.k != null) {
            azk azk = this.k;
            n();
            if (azk.a(aqm)) {
                return;
            }
        }
        if (m()) {
            Drawable l;
            if (this.d == null) {
                l = l();
            } else {
                if (this.t == null) {
                    this.t = this.f.d;
                    if (this.t == null && this.f.e > 0) {
                        this.t = a(this.f.e);
                    }
                }
                l = this.t;
            }
            if (l == null) {
                l = k();
            }
            this.j.c(l);
        }
    }

    private void a(String str) {
        String str2 = this.o;
        new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length()).append(str).append(" this: ").append(str2);
    }

    private void a(aqr<?> aqr_) {
        baq.a();
        if (aqr_ instanceof aqk) {
            ((aqk) aqr_).g();
            this.q = null;
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}
