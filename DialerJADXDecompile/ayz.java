import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
final class ayz implements OnGlobalLayoutListener {
    private /* synthetic */ ViewTreeObserver a;
    private /* synthetic */ ViewGroup b;
    private /* synthetic */ ayv c;

    ayz(ayv ayv, ViewTreeObserver viewTreeObserver, ViewGroup viewGroup) {
        this.c = ayv;
        this.a = viewTreeObserver;
        this.b = viewGroup;
    }

    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = this.b.getViewTreeObserver();
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
        this.c.m.b = this.b.getWidth();
        this.c.i();
    }
}
