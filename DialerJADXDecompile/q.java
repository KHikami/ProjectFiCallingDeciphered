import android.support.design.widget.CoordinatorLayout;
import android.view.ViewTreeObserver.OnPreDrawListener;

public final class q implements OnPreDrawListener {
    private /* synthetic */ CoordinatorLayout a;

    public q(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.a.a(false);
        return true;
    }
}
