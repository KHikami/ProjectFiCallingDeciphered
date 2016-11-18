package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class hfl extends Handler {
    final /* synthetic */ hfj a;

    hfl(hfj hfj, Looper looper) {
        this.a = hfj;
        super(looper);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                hfk hfk = (hfk) message.obj;
                hfj hfj = this.a;
                hfj.a.lock();
                try {
                    if (hfj.g == hfk.d) {
                        hfk.a();
                        hfj.a.unlock();
                        return;
                    }
                    return;
                } finally {
                    hfj.a.unlock();
                }
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                new StringBuilder(31).append("Unknown message id: ").append(message.what);
                return;
        }
    }
}
