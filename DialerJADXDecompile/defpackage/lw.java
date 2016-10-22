package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: lw */
class lw implements mc {
    private WeakHashMap a;

    lw() {
        this.a = null;
    }

    public void a(View view, long j) {
    }

    public void a(lv lvVar, View view, float f) {
        d(lvVar, view);
    }

    public void b(lv lvVar, View view, float f) {
        d(lvVar, view);
    }

    public void c(lv lvVar, View view, float f) {
        d(lvVar, view);
    }

    public long a(View view) {
        return 0;
    }

    public void a(View view, Interpolator interpolator) {
    }

    public void b(View view, long j) {
    }

    public void a(lv lvVar, View view) {
        d(lvVar, view);
    }

    public void a(lv lvVar, View view, mg mgVar) {
        view.setTag(2113929216, mgVar);
    }

    public void a(View view, mi miVar) {
    }

    final void c(lv lvVar, View view) {
        mg mgVar;
        Object tag = view.getTag(2113929216);
        if (tag instanceof mg) {
            mgVar = (mg) tag;
        } else {
            mgVar = null;
        }
        Runnable runnable = lvVar.b;
        Runnable runnable2 = lvVar.c;
        lvVar.b = null;
        lvVar.c = null;
        if (runnable != null) {
            runnable.run();
        }
        if (mgVar != null) {
            mgVar.a(view);
            mgVar.b(view);
        }
        if (runnable2 != null) {
            runnable2.run();
        }
        if (this.a != null) {
            this.a.remove(view);
        }
    }

    private final void d(lv lvVar, View view) {
        Runnable runnable = null;
        if (this.a != null) {
            runnable = (Runnable) this.a.get(view);
        }
        if (runnable == null) {
            runnable = new lx(this, lvVar, view);
            if (this.a == null) {
                this.a = new WeakHashMap();
            }
            this.a.put(view, runnable);
        }
        view.removeCallbacks(runnable);
        view.post(runnable);
    }

    public void b(lv lvVar, View view) {
        if (this.a != null) {
            Runnable runnable = (Runnable) this.a.get(view);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
        }
        c(lvVar, view);
    }
}
