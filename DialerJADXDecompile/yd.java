import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: PG */
final class yd implements OnTouchListener {
    private /* synthetic */ xx a;

    yd(xx xxVar) {
        this.a = xxVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.a.q != null && this.a.q.isShowing() && x >= 0 && x < this.a.q.getWidth() && y >= 0 && y < this.a.q.getHeight()) {
            this.a.n.postDelayed(this.a.m, 250);
        } else if (action == 1) {
            this.a.n.removeCallbacks(this.a.m);
        }
        return false;
    }
}
