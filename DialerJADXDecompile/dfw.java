import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
final class dfw implements Runnable {
    final dfv a;
    private final Executor b;
    private /* synthetic */ dfr c;

    dfw(dfr dfr, Executor executor, dfv dfv) {
        this.c = dfr;
        this.b = executor;
        this.a = dfv;
    }

    final void a() {
        try {
            this.b.execute(this);
        } catch (Throwable th) {
            dfr.a.log(Level.INFO, "Exception notifying context listener", th);
        }
    }

    public final void run() {
        this.a.a(this.c);
    }
}
