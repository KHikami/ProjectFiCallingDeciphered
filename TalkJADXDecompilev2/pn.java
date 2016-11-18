package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class pn {
    static final pu d;
    Runnable a = null;
    Runnable b = null;
    int c = -1;
    private WeakReference<View> e;

    pn(View view) {
        this.e = new WeakReference(view);
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            d = new pt((byte) 0);
        } else if (i >= 19) {
            d = new pt();
        } else if (i >= 18) {
            d = new ps((byte) 0);
        } else if (i >= 16) {
            d = new ps();
        } else if (i >= 14) {
            d = new pq();
        } else {
            d = new po();
        }
    }

    public pn a(long j) {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(view, j);
        }
        return this;
    }

    public pn a(float f) {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(this, view, f);
        }
        return this;
    }

    public pn b(float f) {
        View view = (View) this.e.get();
        if (view != null) {
            d.b(this, view, f);
        }
        return this;
    }

    public pn c(float f) {
        View view = (View) this.e.get();
        if (view != null) {
            d.c(this, view, f);
        }
        return this;
    }

    public long a() {
        View view = (View) this.e.get();
        if (view != null) {
            return d.a(view);
        }
        return 0;
    }

    public pn a(Interpolator interpolator) {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(view, interpolator);
        }
        return this;
    }

    public pn b(long j) {
        View view = (View) this.e.get();
        if (view != null) {
            d.b(view, j);
        }
        return this;
    }

    public void b() {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(this, view);
        }
    }

    public void c() {
        View view = (View) this.e.get();
        if (view != null) {
            d.b(this, view);
        }
    }

    public pn a(py pyVar) {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(this, view, pyVar);
        }
        return this;
    }

    public pn a(qa qaVar) {
        View view = (View) this.e.get();
        if (view != null) {
            d.a(view, qaVar);
        }
        return this;
    }
}
