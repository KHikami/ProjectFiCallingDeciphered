package p000;

import android.os.Handler;
import android.os.Message;

final class jwq extends Handler {
    final /* synthetic */ jwp f21165a;

    jwq(jwp jwp) {
        this.f21165a = jwp;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f21165a.m16203d();
                return;
            default:
                return;
        }
    }
}
