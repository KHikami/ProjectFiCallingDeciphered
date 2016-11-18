package p000;

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class iyn {
    static volatile iyn f19402a = new iyn();
    private final List<iyq> f19403b = new ArrayList();
    private volatile boolean f19404c = true;
    private volatile boolean f19405d;
    private volatile boolean f19406e;
    private volatile boolean f19407f;
    private volatile boolean f19408g;
    private final AtomicBoolean f19409h = new AtomicBoolean(false);

    private iyn() {
    }

    void m23492a(Context context) {
        if (this.f19409h.compareAndSet(false, true) && !m23494a() && m23491a(context, "primes::shutdown_primes", false)) {
            m23500e();
        }
    }

    public boolean m23494a() {
        return this.f19405d;
    }

    public boolean m23496b() {
        return this.f19406e || this.f19407f;
    }

    public boolean m23498c() {
        return this.f19407f;
    }

    public boolean m23499d() {
        return this.f19408g;
    }

    synchronized void m23500e() {
        if (!this.f19405d) {
            this.f19405d = true;
            for (iyq a : this.f19403b) {
                a.mo3408a(this);
            }
            this.f19403b.clear();
        }
    }

    void m23495b(Context context) {
        if (!m23494a() && this.f19404c) {
            m23497c(context);
            context.registerReceiver(new iyo(), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
        }
    }

    void m23497c(Context context) {
        Object obj = 1;
        Object obj2 = null;
        if (!m23494a() && this.f19404c) {
            if (m23491a(context, "primes::shutdown_primes", false)) {
                m23500e();
                return;
            }
            String packageName = context.getPackageName();
            String valueOf = String.valueOf("primes:");
            String valueOf2 = String.valueOf(":enable_leak_detection_v2");
            boolean a = m23491a(context, new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(packageName).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(packageName).append(valueOf2).toString(), false);
            if (this.f19407f != a) {
                this.f19407f = a;
                obj2 = 1;
            }
            valueOf = String.valueOf("primes:");
            valueOf2 = String.valueOf(":enable_leak_detection");
            boolean a2 = m23491a(context, new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(packageName).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(packageName).append(valueOf2).toString(), false);
            if (this.f19406e != a2) {
                this.f19406e = a2;
                obj2 = 1;
            }
            a2 = m23491a(context, "primes:disable_memory_summary_metrics", false);
            if (this.f19408g != a2) {
                this.f19408g = a2;
            } else {
                obj = obj2;
            }
            if (obj != null) {
                for (iyq a3 : this.f19403b) {
                    a3.mo3408a(this);
                }
            }
        }
    }

    private boolean m23491a(Context context, String str, boolean z) {
        boolean z2 = false;
        if (this.f19404c) {
            try {
                z2 = icb.m21567a(context.getContentResolver(), str, false);
            } catch (SecurityException e) {
                this.f19404c = z2;
            }
        }
        return z2;
    }

    public synchronized void m23493a(iyq iyq) {
        if (!this.f19405d) {
            this.f19403b.add((iyq) ba.m4536a((Object) iyq));
        }
    }
}
