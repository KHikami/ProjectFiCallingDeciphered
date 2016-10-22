import android.app.Activity;
import android.app.Application;
import android.app.admin.DevicePolicyManager;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class iwp implements iwb, iyq {
    private static iwp i;
    public final Application a;
    final iyr<ScheduledExecutorService> b;
    final izj c;
    public final iyn d;
    public final boolean e;
    public final AtomicLong f;
    public final AtomicBoolean g;
    ScheduledFuture<?> h;
    private final iwj j;

    private iwp(iyn iyn, Application application, iwj iwj, iyr<ScheduledExecutorService> iyr_java_util_concurrent_ScheduledExecutorService, izj izj, ixb ixb) {
        Object obj;
        this.f = new AtomicLong();
        this.g = new AtomicBoolean();
        ba.a((Object) ixb);
        this.d = (iyn) ba.a((Object) iyn);
        this.a = (Application) ba.a((Object) application);
        this.j = (iwj) ba.a((Object) iwj);
        this.b = (iyr) ba.a((Object) iyr_java_util_concurrent_ScheduledExecutorService);
        this.c = (izj) ba.a((Object) izj);
        this.c.a(new izi(ixb, (byte) 0));
        iyn.a((iyq) this);
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.a.getSystemService("device_policy");
        if (devicePolicyManager == null || devicePolicyManager.getStorageEncryptionStatus() != 3) {
            obj = (byte) 0;
        } else {
            obj = 1;
        }
        boolean z = obj != null && Build.FINGERPRINT.contains("userdebug") && VERSION.SDK_INT >= 23;
        this.e = z;
    }

    static synchronized iwp a(izw izw, Application application, iwj iwj) {
        iwp iwp;
        synchronized (iwp.class) {
            if (i == null) {
                Application application2 = application;
                iwj iwj2 = iwj;
                i = new iwp(iyn.a, application2, iwj2, ixx.c, new izj(), new ixb(izw, ixe.b(application), ixd.b, Integer.MAX_VALUE));
            }
            iwp = i;
        }
        return iwp;
    }

    public void a(iyn iyn) {
        c();
    }

    public void a() {
        c();
    }

    private synchronized void c() {
        boolean z = !this.d.a() && this.d.b();
        if (this.c.b() != z) {
            if (this.c.b()) {
                this.j.b(this);
                this.c.c();
                b();
            } else {
                this.c.a();
                this.j.a((ivz) this);
            }
        }
    }

    public void a(Activity activity) {
        if (!this.d.a() && this.d.b()) {
            this.c.a(activity, activity.getClass().getName());
        }
    }

    void b() {
        if (this.h != null) {
            if (!this.h.isDone()) {
                this.h.cancel(true);
            }
            this.h = null;
        }
    }
}
