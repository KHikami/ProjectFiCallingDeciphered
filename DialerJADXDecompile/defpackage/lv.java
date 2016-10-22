package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: lv */
public final class lv {
    public static final mc e;
    public WeakReference a;
    Runnable b;
    Runnable c;
    int d;

    lv(View view) {
        this.b = null;
        this.c = null;
        this.d = -1;
        this.a = new WeakReference(view);
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            e = new mb((byte) 0);
        } else if (i >= 19) {
            e = new mb();
        } else if (i >= 18) {
            e = new ma((byte) 0);
        } else if (i >= 16) {
            e = new ma();
        } else if (i >= 14) {
            e = new ly();
        } else {
            e = new lw();
        }
    }

    public final lv a(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            e.a(view, j);
        }
        return this;
    }

    public final lv a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            e.a(this, view, f);
        }
        return this;
    }

    public final lv b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            e.b(this, view, f);
        }
        return this;
    }

    public final lv c(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            e.c(this, view, f);
        }
        return this;
    }

    public final lv a(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            e.a(view, interpolator);
        }
        return this;
    }

    public final lv b(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            e.b(view, j);
        }
        return this;
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            e.a(this, view);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            e.b(this, view);
        }
    }

    public final lv a(mg mgVar) {
        View view = (View) this.a.get();
        if (view != null) {
            e.a(this, view, mgVar);
        }
        return this;
    }

    public final lv a(mi miVar) {
        View view = (View) this.a.get();
        if (view != null) {
            e.a(view, miVar);
        }
        return this;
    }
}
