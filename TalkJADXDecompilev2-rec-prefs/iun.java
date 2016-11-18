package p000;

import android.os.Handler;
import android.os.Looper;

final class iun extends iui {
    private Handler f19048a;

    public iun(Looper looper) {
        this.f19048a = new Handler(looper);
    }

    public void mo3400a(iuk iuk) {
        this.f19048a.postDelayed(iuk.m23309b(), 0);
    }

    public void mo3401b(iuk iuk) {
        this.f19048a.removeCallbacks(iuk.m23309b());
    }
}
