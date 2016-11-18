package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class po implements pu {
    WeakHashMap<View, Runnable> a = null;

    po() {
    }

    public void a(View view, long j) {
    }

    public void a(pn pnVar, View view, float f) {
        d(pnVar, view);
    }

    public void b(pn pnVar, View view, float f) {
        d(pnVar, view);
    }

    public void c(pn pnVar, View view, float f) {
        d(pnVar, view);
    }

    public long a(View view) {
        return 0;
    }

    public void a(View view, Interpolator interpolator) {
    }

    public void b(View view, long j) {
    }

    public void a(pn pnVar, View view) {
        d(pnVar, view);
    }

    public void a(pn pnVar, View view, py pyVar) {
        view.setTag(2113929216, pyVar);
    }

    public void a(View view, qa qaVar) {
    }

    void c(pn pnVar, View view) {
        py pyVar;
        Object tag = view.getTag(2113929216);
        if (tag instanceof py) {
            pyVar = (py) tag;
        } else {
            pyVar = null;
        }
        Runnable runnable = pnVar.a;
        Runnable runnable2 = pnVar.b;
        pnVar.a = null;
        pnVar.b = null;
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
        if (this.a != null) {
            this.a.remove(view);
        }
    }

    private void d(pn pnVar, View view) {
        Runnable runnable = null;
        if (this.a != null) {
            runnable = (Runnable) this.a.get(view);
        }
        if (runnable == null) {
            runnable = new pp(this, pnVar, view);
            if (this.a == null) {
                this.a = new WeakHashMap();
            }
            this.a.put(view, runnable);
        }
        view.removeCallbacks(runnable);
        view.post(runnable);
    }

    public void b(pn pnVar, View view) {
        if (this.a != null) {
            Runnable runnable = (Runnable) this.a.get(view);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
        }
        c(pnVar, view);
    }
}
