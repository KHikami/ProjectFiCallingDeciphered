import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class dea implements OnTouchListener {
    final /* synthetic */ ddy a;

    dea(ddy ddy) {
        this.a = ddy;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.i.q();
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }
}
