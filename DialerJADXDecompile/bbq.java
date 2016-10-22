import android.telecom.Call;
import android.telecom.Call.Callback;
import android.util.ArraySet;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
public final class bbq {
    public final Set a;
    final Set b;
    public final Callback c;

    public bbq() {
        this.a = new ArraySet();
        this.b = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.c = new bbr(this);
    }

    public final void a(Call call) {
        if (this.a.contains(call)) {
            this.a.remove(call);
            call.unregisterCallback(this.c);
            c(call);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void a(bbs bbs) {
        this.b.add(bbs);
    }

    public final void b(Call call) {
        for (bbs a : this.b) {
            a.a(call);
        }
    }

    private final void c(Call call) {
        for (bbs b : this.b) {
            b.b(call);
        }
    }
}
