import android.app.Application;
import android.util.Log;

/* compiled from: PG */
public class ctx implements ctw {
    final /* synthetic */ Application a;
    final /* synthetic */ cwh b;

    public void a() {
        cug.a(this.a).b(this);
        cwh cwh = this.b;
        if (cwh.a.getAndSet(true)) {
            Log.w("OneTimeMetrics", "firstActivityCreated() was called more than once.");
            return;
        }
        for (cwg b : cwh.b) {
            b.b();
        }
    }

    ctx(cwh cwh, Application application) {
        this.b = cwh;
        this.a = application;
    }
}
