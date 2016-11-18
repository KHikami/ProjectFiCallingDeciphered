package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;
import android.view.Window.Callback;

abstract class ut extends us {
    private static boolean q = true;
    private static final boolean r;
    private static final int[] s = new int[]{16842836};
    final Context c;
    final Window d;
    final Callback e = this.d.getCallback();
    final Callback f;
    final ur g;
    tp h;
    MenuInflater i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    CharSequence o;
    boolean p;
    private boolean t;

    abstract wx a(wy wyVar);

    abstract boolean a(int i, KeyEvent keyEvent);

    abstract boolean a(KeyEvent keyEvent);

    abstract void b(CharSequence charSequence);

    abstract void d(int i);

    abstract boolean e(int i);

    abstract void l();

    static {
        boolean z = VERSION.SDK_INT < 21;
        r = z;
        if (z && !q) {
            Thread.setDefaultUncaughtExceptionHandler(new uu(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    ut(Context context, Window window, ur urVar) {
        this.c = context;
        this.d = window;
        this.g = urVar;
        if (this.e instanceof uw) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f = a(this.e);
        this.d.setCallback(this.f);
        afp a = afp.a(context, null, s);
        Drawable b = a.b(0);
        if (b != null) {
            this.d.setBackgroundDrawable(b);
        }
        a.a();
    }

    Callback a(Callback callback) {
        return new uw(this, callback);
    }

    public tp a() {
        l();
        return this.h;
    }

    public MenuInflater b() {
        if (this.i == null) {
            l();
            this.i = new xe(this.h != null ? this.h.f() : this.c);
        }
        return this.i;
    }

    public final tu i() {
        return new uv(this);
    }

    final Context m() {
        Context context = null;
        tp a = a();
        if (a != null) {
            context = a.f();
        }
        if (context == null) {
            return this.c;
        }
        return context;
    }

    public void d() {
        this.t = true;
    }

    public void e() {
        this.t = false;
    }

    public void h() {
        this.p = true;
    }

    public boolean n() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public final void a(CharSequence charSequence) {
        this.o = charSequence;
        b(charSequence);
    }

    public void b(Bundle bundle) {
    }
}
