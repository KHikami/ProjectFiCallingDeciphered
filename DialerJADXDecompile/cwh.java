import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
final class cwh {
    final AtomicBoolean a;
    final List b;
    private final AtomicBoolean c;

    cwh(List list) {
        this.c = new AtomicBoolean(false);
        this.a = new AtomicBoolean(false);
        buf.B((Object) list);
        this.b = new ArrayList(list);
    }

    final void a() {
        if (this.c.getAndSet(true)) {
            Log.w("OneTimeMetrics", "primesInitialized() was called more than once.");
            return;
        }
        for (cwg k_ : this.b) {
            k_.k_();
        }
    }
}
