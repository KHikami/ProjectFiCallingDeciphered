package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.io.File;

public class amu implements ayo {
    private static final azl b;
    private static final azl c;
    private static final azl d = ((azl) ((azl) azl.b(apq.c).a(amq.LOW)).a(true));
    final ayn a;
    private final ami e;
    private final ayt f;
    private final ayo g;
    private final ayw h;
    private final Runnable i;
    private final Handler j;
    private final ayo k;
    private azh<?> l;
    private azh<?> m;

    static {
        azh b = azl.b(Bitmap.class);
        b.s = true;
        b = (azl) b;
        b = azl.b(axo.class);
        b.s = true;
        c = (azl) b;
    }

    public amu(ami ami, ayn ayn, ayo ayo) {
        this(ami, ayn, ayo, new ayt(), ami.d());
    }

    private amu(ami ami, ayn ayn, ayo ayo, ayt ayt, ayj ayj) {
        this.h = new ayw();
        this.i = new amv(this);
        this.j = new Handler(Looper.getMainLooper());
        this.e = ami;
        this.a = ayn;
        this.g = ayo;
        this.f = ayt;
        this.k = ayj.a(ami.e().getBaseContext(), new ayi(ayt));
        if (baq.c()) {
            this.j.post(this.i);
        } else {
            ayn.a(this);
        }
        ayn.a(this.k);
        this.l = ami.e().a();
        this.m = this.l;
        ami.a(this);
    }

    public void a(int i) {
        this.e.e().onTrimMemory(i);
    }

    public void a() {
        this.e.e().onLowMemory();
    }

    public void b() {
        baq.a();
        this.f.a();
    }

    public void c() {
        baq.a();
        this.f.b();
    }

    public void d() {
        c();
        this.h.d();
    }

    public void h_() {
        b();
        this.h.h_();
    }

    public void f() {
        this.h.f();
        for (azx a : this.h.a()) {
            a(a);
        }
        this.h.b();
        this.f.c();
        this.a.b(this);
        this.a.b(this.k);
        this.j.removeCallbacks(this.i);
        this.e.b(this);
    }

    public ams<Bitmap> g() {
        return a(Bitmap.class).a(new amy((byte) 0)).a(b);
    }

    public ams<Drawable> h() {
        return a(Drawable.class).a(new amy('\u0000'));
    }

    public ams<File> i() {
        return a(File.class).a(d);
    }

    public <ResourceType> ams<ResourceType> a(Class<ResourceType> cls) {
        return new ams(this.e.e(), this, cls);
    }

    public void a(View view) {
        a(new amx(view));
    }

    public void a(azx<?> azx_) {
        if (azx_ != null) {
            if (!baq.b()) {
                this.j.post(new amw(this, azx_));
            } else if (!b(azx_)) {
                this.e.a((azx) azx_);
            }
        }
    }

    boolean b(azx<?> azx_) {
        azi b = azx_.b();
        if (b == null) {
            return true;
        }
        if (!this.f.b(b)) {
            return false;
        }
        this.h.b(azx_);
        azx_.a(null);
        return true;
    }

    void a(azx<?> azx_, azi azi) {
        this.h.a(azx_);
        this.f.a(azi);
    }

    azh<?> j() {
        return this.m;
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        return new StringBuilder(((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append("{tracker=").append(valueOf2).append(", treeNode=").append(valueOf3).append("}").toString();
    }
}
