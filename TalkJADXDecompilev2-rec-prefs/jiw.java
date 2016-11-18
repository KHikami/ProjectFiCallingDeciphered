package p000;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class jiw extends Handler {
    private final WeakReference<jiu> f20161a;

    jiw(jiu jiu) {
        this.f20161a = new WeakReference(jiu);
    }

    void m24335a() {
        if (!hasMessages(0)) {
            sendEmptyMessageDelayed(0, 800);
        }
    }

    void m24336b() {
        removeMessages(0);
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            jiu jiu = (jiu) this.f20161a.get();
            if (jiu != null) {
                jiu.m24334c();
            }
        }
    }
}
