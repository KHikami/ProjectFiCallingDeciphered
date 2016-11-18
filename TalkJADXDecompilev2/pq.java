package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class pq extends po {
    WeakHashMap<View, Integer> b = null;

    pq() {
    }

    public void a(View view, long j) {
        gwb.a(view, j);
    }

    public void a(pn pnVar, View view, float f) {
        gwb.b(view, f);
    }

    public void b(pn pnVar, View view, float f) {
        gwb.c(view, f);
    }

    public void c(pn pnVar, View view, float f) {
        gwb.d(view, f);
    }

    public long a(View view) {
        return gwb.t(view);
    }

    public void a(View view, Interpolator interpolator) {
        gwb.a(view, interpolator);
    }

    public void b(View view, long j) {
        gwb.b(view, j);
    }

    public void a(pn pnVar, View view) {
        gwb.u(view);
    }

    public void b(pn pnVar, View view) {
        gwb.v(view);
    }

    public void a(pn pnVar, View view, py pyVar) {
        view.setTag(2113929216, pyVar);
        gwb.a(view, new pr(pnVar));
    }
}
