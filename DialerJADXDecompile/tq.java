import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
final class tq implements OnGlobalLayoutListener {
    private /* synthetic */ tp a;

    tq(tp tpVar) {
        this.a = tpVar;
    }

    public final void onGlobalLayout() {
        if (this.a.d() && !this.a.a.p) {
            View view = this.a.b;
            if (view == null || !view.isShown()) {
                this.a.c();
            } else {
                this.a.a.b();
            }
        }
    }
}
