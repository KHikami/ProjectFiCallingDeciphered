package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class ilh extends Handler {
    final /* synthetic */ ilg a;

    ilh(ilg ilg) {
        this.a = ilg;
    }

    public void handleMessage(Message message) {
        if (!this.a.b) {
            switch (message.what) {
                case 1:
                    this.a.a.removeMessages(1, message.obj);
                    if (!(message.obj instanceof iny) || this.a.b()) {
                        iok iok = (iok) message.obj;
                        if (iok.e() && this.a.c.a.containsKey(iok)) {
                            ((ilj) this.a.c.a.get(iok)).b();
                            return;
                        }
                        return;
                    }
                    gwb.V("eglMakeCurrent failed");
                    return;
                case 2:
                    itx.a(4, "vclib", "GlThread notified to quit, shutting down.");
                    this.a.b = true;
                    this.a.a.removeMessages(1);
                    Looper.myQueue().addIdleHandler(new ili(this));
                    return;
                default:
                    return;
            }
        }
    }
}
