package p000;

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
    private static iwp f19277i;
    public final Application f19278a;
    final iyr<ScheduledExecutorService> f19279b;
    final izj f19280c;
    public final iyn f19281d;
    public final boolean f19282e;
    public final AtomicLong f19283f = new AtomicLong();
    public final AtomicBoolean f19284g = new AtomicBoolean();
    ScheduledFuture<?> f19285h;
    private final iwj f19286j;

    private iwp(iyn iyn, Application application, iwj iwj, iyr<ScheduledExecutorService> iyr_java_util_concurrent_ScheduledExecutorService, izj izj, ixb ixb) {
        byte b;
        ba.m4536a((Object) ixb);
        this.f19281d = (iyn) ba.m4536a((Object) iyn);
        this.f19278a = (Application) ba.m4536a((Object) application);
        this.f19286j = (iwj) ba.m4536a((Object) iwj);
        this.f19279b = (iyr) ba.m4536a((Object) iyr_java_util_concurrent_ScheduledExecutorService);
        this.f19280c = (izj) ba.m4536a((Object) izj);
        this.f19280c.m23584a(new izi(this, ixb));
        iyn.m23493a((iyq) this);
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.f19278a.getSystemService("device_policy");
        if (devicePolicyManager == null || devicePolicyManager.getStorageEncryptionStatus() != 3) {
            b = (byte) 0;
        } else {
            b = (byte) 1;
        }
        boolean z = b != (byte) 0 && Build.FINGERPRINT.contains("userdebug") && VERSION.SDK_INT >= 23;
        this.f19282e = z;
    }

    static synchronized iwp m23406a(izw izw, Application application, iwj iwj) {
        iwp iwp;
        synchronized (iwp.class) {
            if (f19277i == null) {
                Application application2 = application;
                iwj iwj2 = iwj;
                f19277i = new iwp(iyn.f19402a, application2, iwj2, ixx.f19383c, new izj(), new ixb(izw, ixe.m23428b(application), ixd.f19324b, Integer.MAX_VALUE));
            }
            iwp = f19277i;
        }
        return iwp;
    }

    public void mo3408a(iyn iyn) {
        m23407c();
    }

    public void m23408a() {
        m23407c();
    }

    private synchronized void m23407c() {
        boolean z = !this.f19281d.m23494a() && this.f19281d.m23496b();
        if (this.f19280c.m23587b() != z) {
            if (this.f19280c.m23587b()) {
                this.f19286j.m23390b(this);
                this.f19280c.m23588c();
                m23411b();
            } else {
                this.f19280c.m23583a();
                this.f19286j.m23389a((ivz) this);
            }
        }
    }

    public void mo3412a(Activity activity) {
        if (!this.f19281d.m23494a() && this.f19281d.m23496b()) {
            this.f19280c.m23585a(activity, activity.getClass().getName());
        }
    }

    void m23411b() {
        if (this.f19285h != null) {
            if (!this.f19285h.isDone()) {
                this.f19285h.cancel(true);
            }
            this.f19285h = null;
        }
    }
}
