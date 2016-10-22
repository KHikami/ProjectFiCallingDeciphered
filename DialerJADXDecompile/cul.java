import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: PG */
final class cul implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler a;
    private /* synthetic */ cuj b;

    cul(cuj cuj, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = cuj;
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            if (this.b.a != null && this.b.a.a()) {
                dku dku = new dku();
                dku.a = Boolean.valueOf(true);
                dln dln = new dln();
                dln.f = dku;
                try {
                    dln.f.b = new dlk();
                    dln.f.b.a = buf.X(this.b.c);
                } catch (Throwable e) {
                    Log.w("CrashMetricService", "Failed to get process stats.", e);
                }
                this.b.a.a(dln);
            }
            if (this.a != null) {
                this.a.uncaughtException(thread, th);
            }
        } catch (Throwable e2) {
            Log.w("CrashMetricService", "Failed to record crash.", e2);
            if (this.a != null) {
                this.a.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.a != null) {
                this.a.uncaughtException(thread, th);
            }
        }
    }
}
