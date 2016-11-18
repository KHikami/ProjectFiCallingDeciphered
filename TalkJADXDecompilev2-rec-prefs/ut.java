package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;
import android.view.Window.Callback;

abstract class ut extends us {
    private static boolean f35303q = true;
    private static final boolean f35304r;
    private static final int[] f35305s = new int[]{16842836};
    final Context f35306c;
    final Window f35307d;
    final Callback f35308e = this.f35307d.getCallback();
    final Callback f35309f;
    final ur f35310g;
    tp f35311h;
    MenuInflater f35312i;
    boolean f35313j;
    boolean f35314k;
    boolean f35315l;
    boolean f35316m;
    boolean f35317n;
    CharSequence f35318o;
    boolean f35319p;
    private boolean f35320t;

    abstract wx mo4411a(wy wyVar);

    abstract boolean mo4418a(int i, KeyEvent keyEvent);

    abstract boolean mo4419a(KeyEvent keyEvent);

    abstract void mo4423b(CharSequence charSequence);

    abstract void mo4426d(int i);

    abstract boolean mo4427e(int i);

    abstract void mo4431l();

    static {
        boolean z = VERSION.SDK_INT < 21;
        f35304r = z;
        if (z && !f35303q) {
            Thread.setDefaultUncaughtExceptionHandler(new uu(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    ut(Context context, Window window, ur urVar) {
        this.f35306c = context;
        this.f35307d = window;
        this.f35310g = urVar;
        if (this.f35308e instanceof uw) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f35309f = mo4433a(this.f35308e);
        this.f35307d.setCallback(this.f35309f);
        afp a = afp.a(context, null, f35305s);
        Drawable b = a.b(0);
        if (b != null) {
            this.f35307d.setBackgroundDrawable(b);
        }
        a.a();
    }

    Callback mo4433a(Callback callback) {
        return new uw(this, callback);
    }

    public tp mo4394a() {
        mo4431l();
        return this.f35311h;
    }

    public MenuInflater mo4396b() {
        if (this.f35312i == null) {
            mo4431l();
            this.f35312i = new xe(this.f35311h != null ? this.f35311h.mo4470f() : this.f35306c);
        }
        return this.f35312i;
    }

    public final tu mo4401i() {
        return new uv(this);
    }

    final Context m40960m() {
        Context context = null;
        tp a = mo4394a();
        if (a != null) {
            context = a.mo4470f();
        }
        if (context == null) {
            return this.f35306c;
        }
        return context;
    }

    public void mo4398d() {
        this.f35320t = true;
    }

    public void mo4399e() {
        this.f35320t = false;
    }

    public void mo4400h() {
        this.f35319p = true;
    }

    public boolean mo4435n() {
        return false;
    }

    public boolean mo4402k() {
        return false;
    }

    public final void mo4395a(CharSequence charSequence) {
        this.f35318o = charSequence;
        mo4423b(charSequence);
    }

    public void mo4397b(Bundle bundle) {
    }
}
