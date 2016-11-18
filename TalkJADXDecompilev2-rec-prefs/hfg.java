package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class hfg extends Handler {
    final /* synthetic */ hfe f16825a;

    hfg(hfe hfe, Looper looper) {
        this.f16825a = hfe;
        super(looper);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                hfe.m19598b(this.f16825a);
                return;
            case 2:
                hfe.m19596a(this.f16825a);
                return;
            default:
                new StringBuilder(31).append("Unknown message id: ").append(message.what);
                return;
        }
    }
}
