package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: ark */
final class ark extends Handler {
    private /* synthetic */ arj a;

    ark(arj arj) {
        this.a = arj;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                this.a.a.setSummary((CharSequence) message.obj);
            default:
        }
    }
}
