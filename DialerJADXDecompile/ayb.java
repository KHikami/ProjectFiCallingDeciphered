import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: PG */
final class ayb implements OnTouchListener {
    private /* synthetic */ axw a;

    ayb(axw axw) {
        this.a = axw;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.b.onTouchEvent(motionEvent);
    }
}
