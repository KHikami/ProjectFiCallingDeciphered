package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class dbw implements OnTouchListener {
    final /* synthetic */ dbp f9481a;

    dbw(dbp dbp) {
        this.f9481a = dbp;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9481a.f5436i.removeCallbacks(this.f9481a.f5435h);
            if (this.f9481a.f5430c != null) {
                this.f9481a.f5430c.mo996a();
            }
            this.f9481a.f5436i.postDelayed(this.f9481a.f5435h, 400);
        } else if (action == 1) {
            this.f9481a.f5436i.removeCallbacks(this.f9481a.f5435h);
            view.performClick();
        }
        return false;
    }
}
