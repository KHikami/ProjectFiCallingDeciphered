package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: adj */
final class adj implements OnTouchListener {
    final /* synthetic */ add a;

    adj(add add) {
        this.a = add;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.a.h != null && this.a.h.isShowing() && x >= 0 && x < this.a.h.getWidth() && y >= 0 && y < this.a.h.getHeight()) {
            this.a.g.postDelayed(this.a.f, 250);
        } else if (action == 1) {
            this.a.g.removeCallbacks(this.a.f);
        }
        return false;
    }
}
