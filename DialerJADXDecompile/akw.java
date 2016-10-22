import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.android.dialer.app.DialtactsActivity;

/* compiled from: PG */
public final class akw implements OnGlobalLayoutListener {
    private /* synthetic */ View a;
    private /* synthetic */ DialtactsActivity b;

    public akw(DialtactsActivity dialtactsActivity, View view) {
        this.b = dialtactsActivity;
        this.a = view;
    }

    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            this.b.t.b = this.b.h.getWidth();
            this.b.t.a(this.b.y(), false);
        }
    }
}
