package defpackage;

import java.util.Timer;

public final class fyc {
    public int a = 0;
    public boolean b = false;
    public Timer c = null;
    public fzo d = null;
    public ahz e = null;

    private void c() {
        if (this.c != null) {
            this.c.cancel();
        }
        this.c = new Timer("mms_apn_extension_timer", true);
        try {
            this.c.schedule(new fya(), gwb.a(gwb.H(), "babel_apn_extension_wait_in_millis", 30000));
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            glk.e("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 60).append("MmsSendReceiveManager.SendingStatus.startApnExtensionTimer: ").append(valueOf).toString(), new Object[0]);
        }
    }

    public void a() {
        if (this.c != null) {
            this.c.cancel();
        }
        this.c = null;
    }

    public void b() {
        fyc.a(true, null);
    }

    public static void a(boolean z, ahz ahz) {
        fxz.b.b = z;
        fxz.b.e = ahz;
        fxz.b.notifyAll();
        if (z && fxz.b.c == null) {
            fxz.b.c();
        }
    }
}