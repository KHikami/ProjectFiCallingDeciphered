package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class ddz implements OnTouchListener {
    final /* synthetic */ ddy a;

    ddz(ddy ddy) {
        this.a = ddy;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.i.r();
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return false;
    }
}
