package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: PG */
/* renamed from: ag */
final class ag implements Callback {
    private /* synthetic */ af a;

    ag(af afVar) {
        this.a = afVar;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case rl.c /*0*/:
                this.a.b((ai) message.obj);
                return true;
            default:
                return false;
        }
    }
}
