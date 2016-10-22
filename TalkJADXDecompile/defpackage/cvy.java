package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;

/* renamed from: cvy */
final class cvy extends itg {
    final /* synthetic */ cvx a;

    cvy(cvx cvx) {
        this.a = cvx;
        super('\u0000');
    }

    public void a(itk itk) {
        boolean z;
        cvx cvx = this.a;
        Context context = cvx.a;
        if (VERSION.SDK_INT < 21 || gwb.a(context, "babel_proximity_wakelock_blacklist", false)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !cvx.c()) {
            cvx.a();
        } else if (cvx.b != null) {
            glk.a("Babel_explane", "WakeLock already held.", new Object[0]);
        } else {
            PowerManager powerManager = (PowerManager) cvx.a.getApplicationContext().getSystemService("power");
            if (gwb.I() || powerManager.isWakeLockLevelSupported(32)) {
                cvx.b = powerManager.newWakeLock(32, "Babel_explane");
                cvx.b.acquire();
            }
        }
    }

    public void a(int i) {
        this.a.a();
    }
}
