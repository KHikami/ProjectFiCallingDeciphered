package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.Set;

public final class dkr extends itg {
    private Context a;
    private WakeLock b;
    private isr c;

    public dkr(Context context) {
        super('\u0000');
        this.a = context;
        glk.a("Babel_Proximity", "Created", new Object[0]);
    }

    public static boolean a(Context context) {
        if (VERSION.SDK_INT < 21 || gwb.a(context, "babel_proximity_wakelock_blacklist", false)) {
            return false;
        }
        return true;
    }

    private void l() {
        if (!dkr.a(this.a) || (this.c != null && this.c != isr.EARPIECE_ON)) {
            m();
        } else if (this.b != null) {
            glk.a("Babel_Proximity", "WakeLock already held.", new Object[0]);
        } else {
            PowerManager powerManager = (PowerManager) this.a.getApplicationContext().getSystemService("power");
            if (gwb.I() || powerManager.isWakeLockLevelSupported(32)) {
                this.b = powerManager.newWakeLock(32, "Babel_Proximity");
                this.b.acquire();
                glk.a("Babel_Proximity", "WakeLock acquired", new Object[0]);
                return;
            }
            glk.a("Babel_Proximity", "Proximity WakeLock not supported.", new Object[0]);
        }
    }

    private void m() {
        if (this.b != null) {
            glk.a("Babel_Proximity", "WakeLock released", new Object[0]);
            this.b.release();
            this.b = null;
        }
    }

    protected void finalize() {
        super.finalize();
        if (this.b != null) {
            m();
            iil.a("Leak found.");
        }
    }

    public void a(isr isr, Set<isq> set) {
        String valueOf = String.valueOf(isr);
        glk.a("Babel_Proximity", new StringBuilder(String.valueOf(valueOf).length() + 17).append("audioDeviceState:").append(valueOf).toString(), new Object[0]);
        this.c = isr;
        l();
    }

    public void a(itk itk) {
        glk.a("Babel_Proximity", "onCallJoin", new Object[0]);
        l();
    }

    public void a(int i) {
        glk.a("Babel_Proximity", "onCallEnd", new Object[0]);
        m();
    }
}
