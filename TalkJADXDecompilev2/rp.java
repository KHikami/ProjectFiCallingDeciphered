package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;

final class rp implements Runnable {
    final /* synthetic */ rn a;

    rp(rn rnVar) {
        this.a = rnVar;
    }

    public void run() {
        if (this.a.e) {
            if (this.a.c) {
                this.a.c = false;
                this.a.a.a();
            }
            ro roVar = this.a.a;
            if (roVar.c() || !this.a.a()) {
                this.a.e = false;
                return;
            }
            if (this.a.d) {
                this.a.d = false;
                rn rnVar = this.a;
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                rnVar.b.onTouchEvent(obtain);
                obtain.recycle();
            }
            roVar.d();
            this.a.e(roVar.g());
            oa.a(this.a.b, (Runnable) this);
        }
    }
}
