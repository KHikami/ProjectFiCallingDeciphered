package p000;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class dkk extends SimpleOnGestureListener {
    final /* synthetic */ dkf f10022a;

    dkk(dkf dkf) {
        this.f10022a = dkf;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f10022a.f10006o = false;
        return false;
    }
}
