package defpackage;

import android.content.AsyncQueryHandler.WorkerArgs;
import android.content.AsyncQueryHandler.WorkerHandler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* renamed from: bah */
public final class bah extends WorkerHandler {
    public bah(bag bag, Looper looper) {
        super(bag, looper);
    }

    public final void handleMessage(Message message) {
        WorkerArgs workerArgs = (WorkerArgs) message.obj;
        bai bai = (bai) workerArgs.cookie;
        if (bai == null) {
            bdf.a((Object) this, "Unexpected command (CookieWrapper is null): " + message.what + " ignored by CallerInfoWorkerHandler, passing onto parent.");
            super.handleMessage(message);
            return;
        }
        int i = bai.c;
        int i2 = message.arg1;
        int i3 = message.what;
        String valueOf = String.valueOf(bae.a(workerArgs.uri));
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 88).append("Processing event: ").append(i).append(" token (arg1): ").append(i2).append(" command: ").append(i3).append(" query URI: ").append(valueOf).toString());
        switch (bai.c) {
            case rq.b /*1*/:
                super.handleMessage(message);
            case rq.c /*2*/:
            case rl.e /*3*/:
            case rl.f /*4*/:
            case rl.g /*5*/:
                Message obtainMessage = workerArgs.handler.obtainMessage(message.what);
                obtainMessage.obj = workerArgs;
                obtainMessage.arg1 = message.arg1;
                obtainMessage.sendToTarget();
            default:
        }
    }
}
