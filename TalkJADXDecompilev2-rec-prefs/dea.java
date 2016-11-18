package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class dea implements OnTouchListener {
    final /* synthetic */ ddy f9548a;

    dea(ddy ddy) {
        this.f9548a = ddy;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f9548a.f9546i.mo1102q();
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }
}
