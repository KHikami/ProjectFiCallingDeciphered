package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: hbs */
final class hbs extends Handler {
    final /* synthetic */ hbr a;

    hbs(hbr hbr, Looper looper) {
        this.a = hbr;
        super(looper);
    }

    public void handleMessage(Message message) {
        this.a.a(message);
    }
}
