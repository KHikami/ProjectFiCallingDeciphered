package p000;

import android.os.Handler;
import android.os.Message;

final class dx extends Handler {
    final /* synthetic */ dw f10688a;

    dx(dw dwVar) {
        this.f10688a = dwVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.f10688a.f635g) {
                    this.f10688a.m1093a(false);
                    return;
                }
                return;
            case 2:
                this.f10688a.f_();
                this.f10688a.f632d.m13434o();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
