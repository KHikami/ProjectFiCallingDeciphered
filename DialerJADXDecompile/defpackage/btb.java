package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: btb */
final class btb extends Handler {
    private /* synthetic */ bsz a;

    btb(bsz bsz, Looper looper) {
        this.a = bsz;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                bta bta = (bta) message.obj;
                bsz bsz = this.a;
                bsz.a.lock();
                try {
                    if (bsz.k == bta.a) {
                        bta.a();
                        bsz.a.unlock();
                    }
                } finally {
                    bsz.a.unlock();
                }
            case rq.c /*2*/:
                throw ((RuntimeException) message.obj);
            default:
                Log.w("GACStateManager", "Unknown message id: " + message.what);
        }
    }
}
