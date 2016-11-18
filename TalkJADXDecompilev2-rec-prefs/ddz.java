package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class ddz implements OnTouchListener {
    final /* synthetic */ ddy f9547a;

    ddz(ddy ddy) {
        this.f9547a = ddy;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f9547a.f9546i.mo1103r();
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return false;
    }
}
