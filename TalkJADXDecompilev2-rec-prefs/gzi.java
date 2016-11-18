package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class gzi extends Handler {
    final /* synthetic */ gzh f16437a;

    gzi(gzh gzh, Looper looper) {
        this.f16437a = gzh;
        super(looper);
    }

    public void handleMessage(Message message) {
        if (message != null) {
            Object obj = message.obj;
        }
        Intent intent = (Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            this.f16437a.f16436j.add(intent);
        } else if (!gzh.m19026a(this.f16437a, intent)) {
            intent.setPackage(this.f16437a.f16433f.getPackageName());
            this.f16437a.f16433f.sendBroadcast(intent);
        }
    }
}
