package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: bst */
final class bst extends Handler {
    private /* synthetic */ bsq a;

    bst(bsq bsq, Looper looper) {
        this.a = bsq;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                bsq.c(this.a);
            case rq.c /*2*/:
                bsq.b(this.a);
            default:
                Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
        }
    }
}
