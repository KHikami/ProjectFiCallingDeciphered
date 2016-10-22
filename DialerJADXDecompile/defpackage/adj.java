package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: adj */
final class adj extends Handler {
    private /* synthetic */ adi a;

    adj(adi adi) {
        this.a = adi;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.a(message.arg1, (aef) message.obj);
        }
    }
}
