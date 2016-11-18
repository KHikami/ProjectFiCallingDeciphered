package p000;

import java.util.Timer;

public final class fyc {
    public int f14349a = 0;
    public boolean f14350b = false;
    public Timer f14351c = null;
    public fzo f14352d = null;
    public ahz f14353e = null;

    private void m16564c() {
        if (this.f14351c != null) {
            this.f14351c.cancel();
        }
        this.f14351c = new Timer("mms_apn_extension_timer", true);
        try {
            this.f14351c.schedule(new fya(), gwb.m1519a(gwb.m1400H(), "babel_apn_extension_wait_in_millis", 30000));
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            glk.m17982e("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 60).append("MmsSendReceiveManager.SendingStatus.startApnExtensionTimer: ").append(valueOf).toString(), new Object[0]);
        }
    }

    public void m16565a() {
        if (this.f14351c != null) {
            this.f14351c.cancel();
        }
        this.f14351c = null;
    }

    public void m16566b() {
        fyc.m16563a(true, null);
    }

    public static void m16563a(boolean z, ahz ahz) {
        fxz.f14346b.f14350b = z;
        fxz.f14346b.f14353e = ahz;
        fxz.f14346b.notifyAll();
        if (z && fxz.f14346b.f14351c == null) {
            fxz.f14346b.m16564c();
        }
    }
}
