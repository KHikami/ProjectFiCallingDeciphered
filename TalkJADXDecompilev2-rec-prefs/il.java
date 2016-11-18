package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class il extends Handler {
    final /* synthetic */ ik f17969a;

    il(ik ikVar, Looper looper) {
        this.f17969a = ikVar;
        super(looper);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f17969a.m22098a();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
