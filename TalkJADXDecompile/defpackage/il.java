package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: il */
final class il extends Handler {
    final /* synthetic */ ik a;

    il(ik ikVar, Looper looper) {
        this.a = ikVar;
        super(looper);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case wi.j /*1*/:
                this.a.a();
            default:
                super.handleMessage(message);
        }
    }
}
