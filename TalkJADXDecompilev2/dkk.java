package defpackage;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class dkk extends SimpleOnGestureListener {
    final /* synthetic */ dkf a;

    dkk(dkf dkf) {
        this.a = dkf;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a.o = false;
        return false;
    }
}
