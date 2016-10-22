package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: df */
final class df extends Handler {
    private /* synthetic */ de a;

    df(de deVar) {
        this.a = deVar;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                if (this.a.d) {
                    this.a.a(false);
                }
            case rq.c /*2*/:
                this.a.b();
                this.a.c.b();
            default:
                super.handleMessage(message);
        }
    }
}
