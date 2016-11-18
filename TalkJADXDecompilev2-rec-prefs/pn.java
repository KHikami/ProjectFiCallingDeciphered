package p000;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class pn {
    static final pu f34990d;
    Runnable f34991a = null;
    Runnable f34992b = null;
    int f34993c = -1;
    private WeakReference<View> f34994e;

    pn(View view) {
        this.f34994e = new WeakReference(view);
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f34990d = new pt((byte) 0);
        } else if (i >= 19) {
            f34990d = new pt();
        } else if (i >= 18) {
            f34990d = new ps((byte) 0);
        } else if (i >= 16) {
            f34990d = new ps();
        } else if (i >= 14) {
            f34990d = new pq();
        } else {
            f34990d = new po();
        }
    }

    public pn m40273a(long j) {
        View view = (View) this.f34994e.get();
        if (view != null) {
            f34990d.mo4258a(view, j);
        }
        return this;
    }

    public pn m40272a(float f) {
        View view = (View) this.f34994e.get();
        if (view != null) {
            f34990d.mo4262a(this, view, f);
        }
        return this;
    }

    public pn m40277b(float f) {
        View view = (View) this.f34994e.get();
        if (view != null) {
            f34990d.mo4266b(this, view, f);
        }
        return this;
    }

    public pn m40280c(float f) {
        View view = (View) this.f34994e.get();
        if (view != null) {
            f34990d.mo4267c(this, view, f);
        }
        return this;
    }

    public long m40271a() {
        View view = (View) this.f34994e.get();
        if (view != null) {
            return f34990d.mo4257a(view);
        }
        return 0;
    }

    public pn m40274a(Interpolator interpolator) {
        View view = (View) this.f34994e.get();
        if (view != null) {
            f34990d.mo4259a(view, interpolator);
        }
        return this;
    }

    public pn m40278b(long j) {
        View view = (View) this.f34994e.get();
        if (view != null) {
            f34990d.mo4264b(view, j);
        }
        return this;
    }

    public void m40279b() {
        View view = (View) this.f34994e.get();
        if (view != null) {
            f34990d.mo4261a(this, view);
        }
    }

    public void m40281c() {
        View view = (View) this.f34994e.get();
        if (view != null) {
            f34990d.mo4265b(this, view);
        }
    }

    public pn m40275a(py pyVar) {
        View view = (View) this.f34994e.get();
        if (view != null) {
            f34990d.mo4263a(this, view, pyVar);
        }
        return this;
    }

    public pn m40276a(qa qaVar) {
        View view = (View) this.f34994e.get();
        if (view != null) {
            f34990d.mo4260a(view, qaVar);
        }
        return this;
    }
}
