import android.app.Application;
import android.content.Context;
import android.os.Trace;

/* compiled from: PG */
public final class bhm {
    public bmx a;
    private final Context b;
    private bmo c;

    public bhm(Application application) {
        this.b = application;
        application.registerActivityLifecycleCallbacks(new bhj());
    }

    public final void a() {
        if (this.c == null) {
            Trace.beginSection("DialerAnalytics initialization");
            this.c = bmo.a(this.b.getApplicationContext());
            Trace.endSection();
        }
        if (this.a == null) {
            this.a = this.c.a(buf.lY);
            this.a.a = true;
        }
    }
}
