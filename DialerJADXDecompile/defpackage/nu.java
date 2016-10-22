package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* renamed from: nu */
final class nu implements Runnable {
    private /* synthetic */ ns a;

    nu(ns nsVar) {
        this.a = nsVar;
    }

    public final void run() {
        if (this.a.e) {
            boolean z;
            if (this.a.c) {
                this.a.c = false;
                nt ntVar = this.a.a;
                ntVar.e = AnimationUtils.currentAnimationTimeMillis();
                ntVar.i = -1;
                ntVar.f = ntVar.e;
                ntVar.j = 0.5f;
                ntVar.g = 0;
                ntVar.h = 0;
            }
            nt ntVar2 = this.a.a;
            if (ntVar2.i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= ntVar2.i + ((long) ntVar2.k)) {
                z = false;
            } else {
                z = true;
            }
            if (z || !this.a.a()) {
                this.a.e = false;
                return;
            }
            long uptimeMillis;
            if (this.a.d) {
                this.a.d = false;
                ns nsVar = this.a;
                uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                nsVar.b.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (ntVar2.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            uptimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = ntVar2.a(uptimeMillis);
            a = (a * 4.0f) + ((-4.0f * a) * a);
            long j = uptimeMillis - ntVar2.f;
            ntVar2.f = uptimeMillis;
            ntVar2.g = (int) ((((float) j) * a) * ntVar2.c);
            ntVar2.h = (int) ((((float) j) * a) * ntVar2.d);
            this.a.a(ntVar2.h);
            kn.a(this.a.b, (Runnable) this);
        }
    }
}
