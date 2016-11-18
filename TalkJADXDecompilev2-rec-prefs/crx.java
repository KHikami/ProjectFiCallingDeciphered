package p000;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class crx extends SimpleOnGestureListener {
    final /* synthetic */ crq f8967a;

    crx(crq crq) {
        this.f8967a = crq;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (crs.f8962a[this.f8967a.f8949d.m10858a() - 1]) {
            case 1:
            case 2:
                this.f8967a.m10837a(csk.f8986b);
                return true;
            case 3:
            case 4:
                this.f8967a.m10837a(csk.f8987c);
                return true;
            default:
                return false;
        }
    }
}
