import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
final class we implements OnGlobalLayoutListener {
    private /* synthetic */ wc a;

    we(wc wcVar) {
        this.a = wcVar;
    }

    public final void onGlobalLayout() {
        Object obj;
        wc wcVar = this.a;
        View view = this.a.d;
        if (kn.r(view) && view.getGlobalVisibleRect(wcVar.c)) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            this.a.c();
            return;
        }
        this.a.a();
        super.b();
    }
}
