package p000;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;

final class asp extends Thread {
    final /* synthetic */ aso f2294a;

    asp(aso aso, Runnable runnable, String str) {
        this.f2294a = aso;
        super(runnable, str);
    }

    public void run() {
        Process.setThreadPriority(9);
        if (this.f2294a.f2291b) {
            StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        } catch (Throwable th) {
            this.f2294a.f2290a.mo376a(th);
        }
    }
}
