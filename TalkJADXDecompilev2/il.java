package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class il extends Handler {
    final /* synthetic */ ik a;

    il(ik ikVar, Looper looper) {
        this.a = ikVar;
        super(looper);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.a.a();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
