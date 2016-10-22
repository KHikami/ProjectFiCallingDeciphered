import android.util.Log;
import java.util.logging.Level;

final class lgw implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ lgv b;

    lgw(lgv lgv, Runnable runnable) {
        this.b = lgv;
        this.a = runnable;
    }

    public void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            lgu.a.log(Level.SEVERE, "Uncaught exception from runnable", th);
            Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th);
        }
    }
}
