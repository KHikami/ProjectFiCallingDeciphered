package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: amp */
final class amp extends Handler {
    private /* synthetic */ amo a;

    amp(amo amo) {
        this.a = amo;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                this.a.b();
                this.a.d();
            default:
        }
    }
}
