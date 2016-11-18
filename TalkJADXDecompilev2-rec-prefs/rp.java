package p000;

import android.os.SystemClock;
import android.view.MotionEvent;

final class rp implements Runnable {
    final /* synthetic */ rn f35079a;

    rp(rn rnVar) {
        this.f35079a = rnVar;
    }

    public void run() {
        if (this.f35079a.f35055e) {
            if (this.f35079a.f35053c) {
                this.f35079a.f35053c = false;
                this.f35079a.f35051a.m40555a();
            }
            ro roVar = this.f35079a.f35051a;
            if (roVar.m40560c() || !this.f35079a.m40544a()) {
                this.f35079a.f35055e = false;
                return;
            }
            if (this.f35079a.f35054d) {
                this.f35079a.f35054d = false;
                rn rnVar = this.f35079a;
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                rnVar.f35052b.onTouchEvent(obtain);
                obtain.recycle();
            }
            roVar.m40561d();
            this.f35079a.mo4377e(roVar.m40564g());
            oa.m37336a(this.f35079a.f35052b, (Runnable) this);
        }
    }
}
