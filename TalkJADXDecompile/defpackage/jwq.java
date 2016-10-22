package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: jwq */
final class jwq extends Handler {
    final /* synthetic */ jwp a;

    jwq(jwp jwp) {
        this.a = jwp;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case wi.j /*1*/:
                this.a.d();
            default:
        }
    }
}
