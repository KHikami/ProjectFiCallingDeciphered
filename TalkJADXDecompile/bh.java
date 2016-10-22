import android.os.SystemClock;

final class bh implements Runnable {
    final /* synthetic */ bg a;

    bh(bg bgVar) {
        this.a = bgVar;
    }

    public void run() {
        bg bgVar = this.a;
        if (bgVar.c) {
            float b = gwb.b(((float) (SystemClock.uptimeMillis() - bgVar.b)) / ((float) bgVar.e), 0.0f, 1.0f);
            if (bgVar.f != null) {
                b = bgVar.f.getInterpolation(b);
            }
            bgVar.d = b;
            bgVar.f();
            if (SystemClock.uptimeMillis() >= bgVar.b + bgVar.e) {
                bgVar.c = false;
                bgVar.g();
            }
        }
        if (bgVar.c) {
            bg.a.postDelayed(bgVar.g, 10);
        }
    }
}
