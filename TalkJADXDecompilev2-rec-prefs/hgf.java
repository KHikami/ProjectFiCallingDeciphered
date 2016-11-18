package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class hgf extends Handler {
    final /* synthetic */ hge f16902a;

    public hgf(hge hge, Looper looper) {
        this.f16902a = hge;
        super(looper);
    }

    public void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        gwb.m2047b(z);
        this.f16902a.m19730b((hgg) message.obj);
    }
}
