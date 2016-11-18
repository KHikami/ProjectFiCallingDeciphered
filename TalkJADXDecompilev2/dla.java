package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class dla implements OnTouchListener {
    final /* synthetic */ dkz a;

    dla(dkz dkz) {
        this.a = dkz;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.setAlpha(0.2f);
        } else if (motionEvent.getAction() == 1) {
            view.setAlpha(1.0f);
            view.performClick();
            return true;
        }
        return false;
    }
}
