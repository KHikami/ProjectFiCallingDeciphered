package defpackage;

import android.os.Handler;
import android.os.Message;

final class jwq extends Handler {
    final /* synthetic */ jwp a;

    jwq(jwp jwp) {
        this.a = jwp;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.a.d();
                return;
            default:
                return;
        }
    }
}
