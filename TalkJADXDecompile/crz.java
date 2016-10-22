import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class crz extends SimpleOnGestureListener {
    final /* synthetic */ crq a;

    crz(crq crq) {
        this.a = crq;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null || f2 <= 0.0f || Math.abs(motionEvent.getY() - motionEvent2.getY()) <= Math.abs(motionEvent.getX() - motionEvent2.getX())) {
            return false;
        }
        this.a.a(csk.d);
        return true;
    }
}
