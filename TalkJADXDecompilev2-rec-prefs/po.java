package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class po implements pu {
    WeakHashMap<View, Runnable> f34995a = null;

    po() {
    }

    public void mo4258a(View view, long j) {
    }

    public void mo4262a(pn pnVar, View view, float f) {
        m40293d(pnVar, view);
    }

    public void mo4266b(pn pnVar, View view, float f) {
        m40293d(pnVar, view);
    }

    public void mo4267c(pn pnVar, View view, float f) {
        m40293d(pnVar, view);
    }

    public long mo4257a(View view) {
        return 0;
    }

    public void mo4259a(View view, Interpolator interpolator) {
    }

    public void mo4264b(View view, long j) {
    }

    public void mo4261a(pn pnVar, View view) {
        m40293d(pnVar, view);
    }

    public void mo4263a(pn pnVar, View view, py pyVar) {
        view.setTag(2113929216, pyVar);
    }

    public void mo4260a(View view, qa qaVar) {
    }

    void m40304c(pn pnVar, View view) {
        py pyVar;
        Object tag = view.getTag(2113929216);
        if (tag instanceof py) {
            pyVar = (py) tag;
        } else {
            pyVar = null;
        }
        Runnable runnable = pnVar.f34991a;
        Runnable runnable2 = pnVar.f34992b;
        pnVar.f34991a = null;
        pnVar.f34992b = null;
        if (runnable != null) {
            runnable.run();
        }
        if (pyVar != null) {
            pyVar.a(view);
            pyVar.b(view);
        }
        if (runnable2 != null) {
            runnable2.run();
        }
        if (this.f34995a != null) {
            this.f34995a.remove(view);
        }
    }

    private void m40293d(pn pnVar, View view) {
        Runnable runnable = null;
        if (this.f34995a != null) {
            runnable = (Runnable) this.f34995a.get(view);
        }
        if (runnable == null) {
            runnable = new pp(this, pnVar, view);
            if (this.f34995a == null) {
                this.f34995a = new WeakHashMap();
            }
            this.f34995a.put(view, runnable);
        }
        view.removeCallbacks(runnable);
        view.post(runnable);
    }

    public void mo4265b(pn pnVar, View view) {
        if (this.f34995a != null) {
            Runnable runnable = (Runnable) this.f34995a.get(view);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
        }
        m40304c(pnVar, view);
    }
}
