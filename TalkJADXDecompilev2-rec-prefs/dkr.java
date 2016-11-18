package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.Set;

public final class dkr extends itg {
    private Context f10026a;
    private WakeLock f10027b;
    private isr f10028c;

    public dkr(Context context) {
        super('\u0000');
        this.f10026a = context;
        glk.m17970a("Babel_Proximity", "Created", new Object[0]);
    }

    public static boolean m12131a(Context context) {
        if (VERSION.SDK_INT < 21 || gwb.m1906a(context, "babel_proximity_wakelock_blacklist", false)) {
            return false;
        }
        return true;
    }

    private void m12132l() {
        if (!dkr.m12131a(this.f10026a) || (this.f10028c != null && this.f10028c != isr.EARPIECE_ON)) {
            m12133m();
        } else if (this.f10027b != null) {
            glk.m17970a("Babel_Proximity", "WakeLock already held.", new Object[0]);
        } else {
            PowerManager powerManager = (PowerManager) this.f10026a.getApplicationContext().getSystemService("power");
            if (gwb.m1406I() || powerManager.isWakeLockLevelSupported(32)) {
                this.f10027b = powerManager.newWakeLock(32, "Babel_Proximity");
                this.f10027b.acquire();
                glk.m17970a("Babel_Proximity", "WakeLock acquired", new Object[0]);
                return;
            }
            glk.m17970a("Babel_Proximity", "Proximity WakeLock not supported.", new Object[0]);
        }
    }

    private void m12133m() {
        if (this.f10027b != null) {
            glk.m17970a("Babel_Proximity", "WakeLock released", new Object[0]);
            this.f10027b.release();
            this.f10027b = null;
        }
    }

    protected void finalize() {
        super.finalize();
        if (this.f10027b != null) {
            m12133m();
            iil.m21870a("Leak found.");
        }
    }

    public void mo1568a(isr isr, Set<isq> set) {
        String valueOf = String.valueOf(isr);
        glk.m17970a("Babel_Proximity", new StringBuilder(String.valueOf(valueOf).length() + 17).append("audioDeviceState:").append(valueOf).toString(), new Object[0]);
        this.f10028c = isr;
        m12132l();
    }

    public void mo1386a(itk itk) {
        glk.m17970a("Babel_Proximity", "onCallJoin", new Object[0]);
        m12132l();
    }

    public void mo1385a(int i) {
        glk.m17970a("Babel_Proximity", "onCallEnd", new Object[0]);
        m12133m();
    }
}
