package p000;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

final class mi implements mf {
    private final GestureDetector f27763a;

    public mi(Context context, OnGestureListener onGestureListener, Handler handler) {
        this.f27763a = new GestureDetector(context, onGestureListener, handler);
    }

    public boolean mo3745a(MotionEvent motionEvent) {
        return this.f27763a.onTouchEvent(motionEvent);
    }
}
