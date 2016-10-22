package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: aof */
final class aof extends Handler {
    private /* synthetic */ aoe a;

    aof(aoe aoe) {
        this.a = aoe;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                this.a.d.a();
            case rq.c /*2*/:
                this.a.a();
            default:
        }
    }
}
