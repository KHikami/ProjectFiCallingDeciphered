import android.app.Application;
import android.content.Context;

/* compiled from: PG */
public final class bja {
    public final bqg a;
    private final Context b;
    private final bqg c;

    public bja(Application application) {
        this.b = application;
        this.c = new bqg(this.b, "ANDROID_DIALER", null, null);
        this.a = new bqg(this.b, "SCOOBY_EVENTS", null, null);
    }

    public final void a(bqj bqj) {
        this.c.a(bqj).a();
    }

    public final void a(bqj bqj, int i) {
        bqi a = this.c.a(bqj);
        a.a.e = i;
        a.a();
    }
}
