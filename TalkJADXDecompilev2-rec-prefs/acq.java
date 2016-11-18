package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

final class acq implements Runnable {
    final /* synthetic */ acm f250a;

    acq(acm acm) {
        this.f250a = acm;
    }

    public void run() {
        acm acm = this.f250a;
        acm.m127d();
        View view = acm.f88c;
        if (view.isEnabled() && !view.isLongClickable() && acm.mo11b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            acm.f90e = true;
        }
    }
}
