package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class it extends Handler {
    public it() {
        super(Looper.getMainLooper());
    }

    public void handleMessage(Message message) {
        is isVar = (is) message.obj;
        switch (message.what) {
            case 1:
                io ioVar = isVar.f18844a;
                Object obj = isVar.f18845b[0];
                if (ioVar.f17406e.isCancelled()) {
                    ioVar.mo3028b(obj);
                } else {
                    ioVar.mo3027a(obj);
                }
                ioVar.f17407f = iu.f19023c;
                return;
            case 2:
                isVar.f18844a.m21125a();
                return;
            default:
                return;
        }
    }
}
