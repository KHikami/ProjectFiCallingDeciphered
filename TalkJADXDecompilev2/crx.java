package defpackage;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class crx extends SimpleOnGestureListener {
    final /* synthetic */ crq a;

    crx(crq crq) {
        this.a = crq;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (crs.a[this.a.d.a() - 1]) {
            case 1:
            case 2:
                this.a.a(csk.b);
                return true;
            case 3:
            case 4:
                this.a.a(csk.c);
                return true;
            default:
                return false;
        }
    }
}
