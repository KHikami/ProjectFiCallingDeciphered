package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class hfl extends Handler {
    final /* synthetic */ hfj f16842a;

    hfl(hfj hfj, Looper looper) {
        this.f16842a = hfj;
        super(looper);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                hfk hfk = (hfk) message.obj;
                hfj hfj = this.f16842a;
                hfj.f16827a.lock();
                try {
                    if (hfj.f16833g == hfk.f16757d) {
                        hfk.mo2500a();
                        hfj.f16827a.unlock();
                        return;
                    }
                    return;
                } finally {
                    hfj.f16827a.unlock();
                }
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                new StringBuilder(31).append("Unknown message id: ").append(message.what);
                return;
        }
    }
}
