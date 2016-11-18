package p000;

import android.util.Log;
import java.util.logging.Level;

final class lgw implements Runnable {
    final /* synthetic */ Runnable f24984a;
    final /* synthetic */ lgv f24985b;

    lgw(lgv lgv, Runnable runnable) {
        this.f24985b = lgv;
        this.f24984a = runnable;
    }

    public void run() {
        try {
            this.f24984a.run();
        } catch (Throwable th) {
            lgu.f24982a.log(Level.SEVERE, "Uncaught exception from runnable", th);
            Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th);
        }
    }
}
