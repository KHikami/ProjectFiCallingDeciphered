import android.app.Activity;
import android.app.Application;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
final class cui implements cuc, cud {
    final List a;
    final List b;
    private final Application c;
    private volatile boolean d;
    private volatile boolean e;
    private int f;

    cui(Application application) {
        this.a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        this.d = false;
        this.e = false;
        this.f = 0;
        this.c = (Application) buf.B((Object) application);
        if (application.getResources() != null) {
            this.f = application.getResources().getConfiguration().orientation;
        }
    }

    public final void a(Activity activity) {
        if (this.e) {
            this.e = a();
        } else {
            c(activity);
        }
    }

    public final void b(Activity activity) {
        this.e = a();
        if (!this.e) {
            c(activity);
        }
    }

    private final boolean a() {
        int i = this.c.getResources().getConfiguration().orientation;
        if (this.f == i) {
            return false;
        }
        this.f = i;
        return true;
    }

    private final void c(Activity activity) {
        if (cwz.b(activity.getApplicationContext())) {
            if (!this.d) {
                this.d = true;
                for (cuf a : this.a) {
                    a.a();
                }
            }
        } else if (this.d) {
            this.d = false;
            for (cue a2 : this.b) {
                a2.a();
            }
        }
    }
}
