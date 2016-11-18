package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;

final class cvy extends itg {
    final /* synthetic */ cvx f9220a;

    cvy(cvx cvx) {
        this.f9220a = cvx;
        super('\u0000');
    }

    public void mo1386a(itk itk) {
        boolean z;
        cvx cvx = this.f9220a;
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
    }

    public void mo1385a(int i) {
        this.f9220a.m11142a();
    }
}
