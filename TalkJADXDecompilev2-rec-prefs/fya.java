package p000;

import java.util.TimerTask;

final class fya extends TimerTask {
    fya() {
    }

    public void run() {
        synchronized (fxz.f14346b) {
            if (fxz.f14346b.f14349a <= 0) {
                return;
            }
            try {
                fxz.m16555a(gwb.m1400H());
            } catch (ahz e) {
                fxz.f14346b.f14350b = false;
                String valueOf = String.valueOf(e);
                glk.m17982e("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 46).append("MmsSendReceiveManager.MMS_APN_EXTENSION_TASK: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }
}
