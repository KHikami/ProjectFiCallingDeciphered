package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

public final class hei<R extends gup> extends Handler {
    public hei() {
        this(Looper.getMainLooper());
    }

    public hei(Looper looper) {
        super(looper);
    }

    public void m19479a() {
        removeMessages(2);
    }

    public void m19480a(guq<? super R> guq__super_R, R r) {
        sendMessage(obtainMessage(1, new Pair(guq__super_R, r)));
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Pair pair = (Pair) message.obj;
                guq guq = (guq) pair.first;
                gup gup = (gup) pair.second;
                try {
                    guq.mo1538a(gup);
                    return;
                } catch (RuntimeException e) {
                    heg.m18970b(gup);
                    throw e;
                }
            case 2:
                ((heg) message.obj).m18980d(Status.f7267d);
                return;
            default:
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
                return;
        }
    }
}