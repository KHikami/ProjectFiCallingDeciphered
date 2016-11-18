package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class jiw extends Handler {
    private final WeakReference<jiu> a;

    jiw(jiu jiu) {
        this.a = new WeakReference(jiu);
    }

    void a() {
        if (!hasMessages(0)) {
            sendEmptyMessageDelayed(0, 800);
        }
    }

    void b() {
        removeMessages(0);
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            jiu jiu = (jiu) this.a.get();
            if (jiu != null) {
                jiu.c();
            }
        }
    }
}
