package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class adj implements OnTouchListener {
    final /* synthetic */ add f339a;

    adj(add add) {
        this.f339a = add;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.f339a.f118h != null && this.f339a.f118h.isShowing() && x >= 0 && x < this.f339a.f118h.getWidth() && y >= 0 && y < this.f339a.f118h.getHeight()) {
            this.f339a.f117g.postDelayed(this.f339a.f116f, 250);
        } else if (action == 1) {
            this.f339a.f117g.removeCallbacks(this.f339a.f116f);
        }
        return false;
    }
}
