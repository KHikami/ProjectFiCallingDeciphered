import android.support.design.widget.CoordinatorLayout;
import android.view.View;

final class u implements Runnable {
    private final CoordinatorLayout a;
    private final View b;
    private /* synthetic */ t c;

    u(t tVar, CoordinatorLayout coordinatorLayout, View view) {
        this.c = tVar;
        this.a = coordinatorLayout;
        this.b = view;
    }

    public final void run() {
        if (this.b != null && this.c.b != null) {
            if (this.c.b.g()) {
                this.c.b(this.a, this.b, this.c.b.c());
                kn.a(this.b, (Runnable) this);
                return;
            }
            this.c.a(this.a, this.b);
        }
    }
}
