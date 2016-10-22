package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: dck */
final class dck extends Handler {
    private final dcj a;

    public dck(dcj dcj) {
        this.a = dcj;
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            this.a.ak();
        }
    }
}
