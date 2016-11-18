package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class pq extends po {
    WeakHashMap<View, Integer> f34999b = null;

    pq() {
    }

    public void mo4258a(View view, long j) {
        gwb.a(view, j);
    }

    public void mo4262a(pn pnVar, View view, float f) {
        gwb.b(view, f);
    }

    public void mo4266b(pn pnVar, View view, float f) {
        gwb.c(view, f);
    }

    public void mo4267c(pn pnVar, View view, float f) {
        gwb.d(view, f);
    }

    public long mo4257a(View view) {
        return gwb.t(view);
    }

    public void mo4259a(View view, Interpolator interpolator) {
        gwb.a(view, interpolator);
    }

    public void mo4264b(View view, long j) {
        gwb.b(view, j);
    }

    public void mo4261a(pn pnVar, View view) {
        gwb.u(view);
    }

    public void mo4265b(pn pnVar, View view) {
        gwb.v(view);
    }

    public void mo4263a(pn pnVar, View view, py pyVar) {
        view.setTag(2113929216, pyVar);
        gwb.a(view, new pr(pnVar));
    }
}
