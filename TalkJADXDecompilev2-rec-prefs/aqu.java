package p000;

import android.os.Handler;
import android.os.Looper;

final class aqu {
    private boolean f2177a;
    private final Handler f2178b = new Handler(Looper.getMainLooper(), new aqv());

    aqu() {
    }

    public void m3766a(aqr<?> aqr_) {
        baq.m4685a();
        if (this.f2177a) {
            this.f2178b.obtainMessage(1, aqr_).sendToTarget();
            return;
        }
        this.f2177a = true;
        aqr_.mo348e();
        this.f2177a = false;
    }
}
