import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* compiled from: PG */
final class axx extends SimpleOnGestureListener {
    private /* synthetic */ axw a;

    axx(axw axw) {
        this.a = axw;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        axw axw = this.a;
        if (!axw.d()) {
            float y = motionEvent2.getY() - motionEvent.getY();
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > Math.abs(y)) {
                if (Math.abs(x) <= 100.0f) {
                    return true;
                }
                if (x > 0.0f) {
                    bdf.a(axw.a, "onSwipeRight");
                    axw.a(0, axw.getContext());
                    return true;
                }
                bdf.a(axw.a, "onSwipeLeft");
                axw.a(axw.getContext());
                return true;
            } else if (Math.abs(y) > 100.0f) {
                if (y > 0.0f) {
                    bdf.a(axw.a, "onSwipeDown");
                    return true;
                }
                bdf.a(axw.a, "onSwipeUp");
                axw.e();
                return true;
            }
        }
        return false;
    }
}
