import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class iyl {
    private final AtomicBoolean a;
    private final AtomicBoolean b;
    private final List<iyk> c;

    iyl(List<iyk> list) {
        this.a = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        ba.a((Object) list);
        this.c = new ArrayList(list);
    }

    void a(Application application) {
        iwj.a(application).a(new iwa(this, application));
    }

    void a() {
        if (!this.b.getAndSet(true)) {
            for (iyk d : this.c) {
                d.d();
            }
        }
    }

    void b() {
        if (!this.a.getAndSet(true)) {
            for (iyk c : this.c) {
                c.c();
            }
        }
    }
}
