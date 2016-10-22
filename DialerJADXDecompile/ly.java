import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: PG */
class ly extends lw {
    ly() {
    }

    public final void a(View view, long j) {
        buf.a(view, j);
    }

    public final void a(lv lvVar, View view, float f) {
        buf.b(view, f);
    }

    public final void b(lv lvVar, View view, float f) {
        buf.c(view, f);
    }

    public final void c(lv lvVar, View view, float f) {
        buf.d(view, f);
    }

    public final long a(View view) {
        return buf.t(view);
    }

    public final void a(View view, Interpolator interpolator) {
        buf.a(view, interpolator);
    }

    public final void b(View view, long j) {
        buf.b(view, j);
    }

    public final void a(lv lvVar, View view) {
        buf.u(view);
    }

    public final void b(lv lvVar, View view) {
        buf.v(view);
    }

    public void a(lv lvVar, View view, mg mgVar) {
        view.setTag(2113929216, mgVar);
        buf.a(view, new lz(lvVar));
    }
}
