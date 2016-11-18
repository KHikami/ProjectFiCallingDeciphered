package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class dbw implements OnTouchListener {
    final /* synthetic */ dbp a;

    dbw(dbp dbp) {
        this.a = dbp;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.i.removeCallbacks(this.a.h);
            if (this.a.c != null) {
                this.a.c.a();
            }
            this.a.i.postDelayed(this.a.h, 400);
        } else if (action == 1) {
            this.a.i.removeCallbacks(this.a.h);
            view.performClick();
        }
        return false;
    }
}
