import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
final class lx implements Runnable {
    private WeakReference a;
    private lv b;
    private /* synthetic */ lw c;

    lx(lw lwVar, lv lvVar, View view) {
        this.c = lwVar;
        this.a = new WeakReference(view);
        this.b = lvVar;
    }

    public final void run() {
        View view = (View) this.a.get();
        if (view != null) {
            this.c.c(this.b, view);
        }
    }
}
