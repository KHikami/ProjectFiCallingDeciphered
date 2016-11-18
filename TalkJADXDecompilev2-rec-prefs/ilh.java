package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class ilh extends Handler {
    final /* synthetic */ ilg f17983a;

    ilh(ilg ilg) {
        this.f17983a = ilg;
    }

    public void handleMessage(Message message) {
        if (!this.f17983a.f17979b) {
            switch (message.what) {
                case 1:
                    this.f17983a.f17978a.removeMessages(1, message.obj);
                    if (!(message.obj instanceof iny) || this.f17983a.m22238b()) {
                        iok iok = (iok) message.obj;
                        if (iok.mo3276e() && this.f17983a.f17980c.f17971a.containsKey(iok)) {
                            ((ilj) this.f17983a.f17980c.f17971a.get(iok)).m22243b();
                            return;
                        }
                        return;
                    }
                    gwb.m1457V("eglMakeCurrent failed");
                    return;
                case 2:
                    itx.m23277a(4, "vclib", "GlThread notified to quit, shutting down.");
                    this.f17983a.f17979b = true;
                    this.f17983a.f17978a.removeMessages(1);
                    Looper.myQueue().addIdleHandler(new ili(this));
                    return;
                default:
                    return;
            }
        }
    }
}
