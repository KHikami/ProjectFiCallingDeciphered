package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class hbs extends Handler {
    final /* synthetic */ hbr f16551a;

    hbs(hbr hbr, Looper looper) {
        this.f16551a = hbr;
        super(looper);
    }

    public void handleMessage(Message message) {
        this.f16551a.m19172a(message);
    }
}
