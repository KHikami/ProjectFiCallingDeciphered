import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public final class cwj {
    public static final cwj a;
    volatile boolean b;
    volatile boolean c;
    volatile boolean d;
    final AtomicBoolean e;
    private final List f;

    static {
        a = new cwj();
    }

    private cwj() {
        this.f = new ArrayList();
        this.b = true;
        this.e = new AtomicBoolean(false);
    }

    public final synchronized void a() {
        if (!this.c) {
            this.c = true;
            for (cwl a : this.f) {
                a.a(this);
            }
            this.f.clear();
        }
    }

    final void a(Context context) {
        Object obj = null;
        if (!this.c && this.b) {
            if (a(context, "primes::shutdown_primes", false)) {
                a();
                return;
            }
            String packageName = context.getPackageName();
            String valueOf = String.valueOf("primes:");
            String valueOf2 = String.valueOf(":enable_leak_detection");
            boolean a = a(context, new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(packageName).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(packageName).append(valueOf2).toString(), false);
            if (this.d != a) {
                this.d = a;
                obj = 1;
            }
            if (obj != null) {
                for (cwl a2 : this.f) {
                    a2.a(this);
                }
            }
        }
    }

    final boolean a(Context context, String str, boolean z) {
        boolean z2 = false;
        if (this.b) {
            try {
                z2 = csn.a(context.getContentResolver(), str, false);
            } catch (Throwable e) {
                if (Log.isLoggable("PrimesGservices", 5)) {
                    Log.w("PrimesGservices", "Fail to read GServices.", e);
                }
                this.b = z2;
            }
        }
        return z2;
    }

    public final synchronized void a(cwl cwl) {
        if (!this.c) {
            this.f.add((cwl) buf.B((Object) cwl));
        }
    }
}
