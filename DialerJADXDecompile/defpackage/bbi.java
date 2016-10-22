package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: bbi */
final class bbi extends Handler {
    bbi(bbh bbh) {
    }

    public final void handleMessage(Message message) {
        bbk bbk = (bbk) message.obj;
        switch (message.arg1) {
            case rq.b /*1*/:
                if (bbk.f != null) {
                    String valueOf = String.valueOf(bbk.f.toString());
                    String valueOf2 = String.valueOf(bbk.b);
                    bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length()).append("Notifying listener: ").append(valueOf).append(" image: ").append(valueOf2).append(" completed").toString());
                    bbj bbj = bbk.f;
                    int i = message.what;
                    bbj.a(bbk.c, bbk.d, bbk.e);
                }
            default:
        }
    }
}
