package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* renamed from: brx */
public final class brx extends Handler {
    public brx() {
        this(Looper.getMainLooper());
    }

    public brx(Looper looper) {
        super(looper);
    }

    public final void a(brm brm, brl brl) {
        sendMessage(obtainMessage(1, new Pair(brm, brl)));
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                Pair pair = (Pair) message.obj;
                brm brm = (brm) pair.first;
                brl brl = (brl) pair.second;
                try {
                    brm.a(brl);
                } catch (RuntimeException e) {
                    brw.b(brl);
                    throw e;
                }
            case rq.c /*2*/:
                ((brw) message.obj).b(Status.d);
            default:
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
        }
    }
}
