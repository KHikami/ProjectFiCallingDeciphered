package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import java.util.Set;

final class cvz extends cuz {
    final /* synthetic */ cvx f9221a;

    cvz(cvx cvx) {
        this.f9221a = cvx;
    }

    public void mo1383a(isr isr, Set<isq> set) {
        boolean z;
        this.f9221a.f9209c = isr;
        cvx cvx = this.f9221a;
        Context context = cvx.f9207a;
        if (VERSION.SDK_INT < 21 || gwb.m1906a(context, "babel_proximity_wakelock_blacklist", false)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !cvx.m11147c()) {
            cvx.m11142a();
        } else if (cvx.f9208b != null) {
            glk.m17970a("Babel_explane", "WakeLock already held.", new Object[0]);
        } else {
            PowerManager powerManager = (PowerManager) cvx.f9207a.getApplicationContext().getSystemService("power");
            if (gwb.m1406I() || powerManager.isWakeLockLevelSupported(32)) {
                cvx.f9208b = powerManager.newWakeLock(32, "Babel_explane");
                cvx.f9208b.acquire();
            }
        }
        if (this.f9221a.f9210d && this.f9221a.m11147c()) {
            this.f9221a.m11144a(true);
        }
    }
}
