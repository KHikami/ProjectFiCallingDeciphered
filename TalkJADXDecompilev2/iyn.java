package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class iyn {
    static volatile iyn a = new iyn();
    private final List<iyq> b = new ArrayList();
    private volatile boolean c = true;
    private volatile boolean d;
    private volatile boolean e;
    private volatile boolean f;
    private volatile boolean g;
    private final AtomicBoolean h = new AtomicBoolean(false);

    private iyn() {
    }

    void a(Context context) {
        if (this.h.compareAndSet(false, true) && !a() && a(context, "primes::shutdown_primes", false)) {
            e();
        }
    }

    public boolean a() {
        return this.d;
    }

    public boolean b() {
        return this.e || this.f;
    }

    public boolean c() {
        return this.f;
    }

    public boolean d() {
        return this.g;
    }

    synchronized void e() {
        if (!this.d) {
            this.d = true;
            for (iyq a : this.b) {
                a.a(this);
            }
            this.b.clear();
        }
    }

    void b(Context context) {
        if (!a() && this.c) {
            c(context);
            context.registerReceiver(new iyo(), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
        }
    }

    void c(Context context) {
        Object obj = 1;
        Object obj2 = null;
        if (!a() && this.c) {
            if (a(context, "primes::shutdown_primes", false)) {
                e();
                return;
            }
            String packageName = context.getPackageName();
            String valueOf = String.valueOf("primes:");
            String valueOf2 = String.valueOf(":enable_leak_detection_v2");
            boolean a = a(context, new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(packageName).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(packageName).append(valueOf2).toString(), false);
            if (this.f != a) {
                this.f = a;
                obj2 = 1;
            }
            valueOf = String.valueOf("primes:");
            valueOf2 = String.valueOf(":enable_leak_detection");
            boolean a2 = a(context, new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(packageName).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(packageName).append(valueOf2).toString(), false);
            if (this.e != a2) {
                this.e = a2;
                obj2 = 1;
            }
            a2 = a(context, "primes:disable_memory_summary_metrics", false);
            if (this.g != a2) {
                this.g = a2;
            } else {
                obj = obj2;
            }
            if (obj != null) {
                for (iyq a3 : this.b) {
                    a3.a(this);
                }
            }
        }
    }

    private boolean a(Context context, String str, boolean z) {
        boolean z2 = false;
        if (this.c) {
            try {
                z2 = icb.a(context.getContentResolver(), str, false);
            } catch (SecurityException e) {
                this.c = z2;
            }
        }
        return z2;
    }

    public synchronized void a(iyq iyq) {
        if (!this.d) {
            this.b.add((iyq) ba.a((Object) iyq));
        }
    }
}
