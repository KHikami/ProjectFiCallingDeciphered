package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: acq */
final class acq implements Runnable {
    final /* synthetic */ acm a;

    acq(acm acm) {
        this.a = acm;
    }

    public void run() {
        acm acm = this.a;
        acm.d();
        View view = acm.c;
        if (view.isEnabled() && !view.isLongClickable() && acm.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            acm.e = true;
        }
    }
}
