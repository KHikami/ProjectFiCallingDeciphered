package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;

/* renamed from: asp */
final class asp extends Thread {
    final /* synthetic */ aso a;

    asp(aso aso, Runnable runnable, String str) {
        this.a = aso;
        super(runnable, str);
    }

    public void run() {
        Process.setThreadPriority(9);
        if (this.a.b) {
            StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        } catch (Throwable th) {
            this.a.a.a(th);
        }
    }
}
