package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* renamed from: afg */
final class afg extends Handler {
    private /* synthetic */ afc a;

    afg(afc afc, Looper looper) {
        this.a = afc;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rl.c /*0*/:
                this.a.c();
            case rq.b /*1*/:
                afc afc = this.a;
                Object obj = message.obj;
                afc.d.sendEmptyMessage(0);
            default:
        }
    }
}
