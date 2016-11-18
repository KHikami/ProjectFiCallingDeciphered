package p000;

import android.os.SystemClock;

final class bh implements Runnable {
    final /* synthetic */ bg f3338a;

    bh(bg bgVar) {
        this.f3338a = bgVar;
    }

    public void run() {
        bg bgVar = this.f3338a;
        if (bgVar.f3246c) {
            float b = gwb.m1963b(((float) (SystemClock.uptimeMillis() - bgVar.f3245b)) / ((float) bgVar.f3248e), 0.0f, 1.0f);
            if (bgVar.f3249f != null) {
                b = bgVar.f3249f.getInterpolation(b);
            }
            bgVar.f3247d = b;
            bgVar.m5098f();
            if (SystemClock.uptimeMillis() >= bgVar.f3245b + bgVar.f3248e) {
                bgVar.f3246c = false;
                bgVar.m5099g();
            }
        }
        if (bgVar.f3246c) {
            bg.f3244a.postDelayed(bgVar.f3250g, 10);
        }
    }
}
