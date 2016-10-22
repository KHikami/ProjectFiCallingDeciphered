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
            case wi.j /*1*/:
            case wi.l /*2*/:
                this.a.a(csk.b);
                return true;
            case wi.z /*3*/:
            case wi.h /*4*/:
                this.a.a(csk.c);
                return true;
            default:
                return false;
        }
    }
}
