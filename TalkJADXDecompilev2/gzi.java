package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class gzi extends Handler {
    final /* synthetic */ gzh a;

    gzi(gzh gzh, Looper looper) {
        this.a = gzh;
        super(looper);
    }

    public void handleMessage(Message message) {
        if (message != null) {
            Object obj = message.obj;
        }
        Intent intent = (Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            this.a.j.add(intent);
        } else if (!gzh.a(this.a, intent)) {
            intent.setPackage(this.a.f.getPackageName());
            this.a.f.sendBroadcast(intent);
        }
    }
}
