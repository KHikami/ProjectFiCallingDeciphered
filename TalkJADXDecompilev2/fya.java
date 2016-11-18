package defpackage;

import java.util.TimerTask;

final class fya extends TimerTask {
    fya() {
    }

    public void run() {
        synchronized (fxz.b) {
            if (fxz.b.a <= 0) {
                return;
            }
            try {
                fxz.a(gwb.H());
            } catch (ahz e) {
                fxz.b.b = false;
                String valueOf = String.valueOf(e);
                glk.e("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 46).append("MmsSendReceiveManager.MMS_APN_EXTENSION_TASK: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }
}
