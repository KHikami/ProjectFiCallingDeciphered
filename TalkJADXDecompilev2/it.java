package defpackage;

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
                io ioVar = isVar.a;
                Object obj = isVar.b[0];
                if (ioVar.e.isCancelled()) {
                    ioVar.b(obj);
                } else {
                    ioVar.a(obj);
                }
                ioVar.f = iu.c;
                return;
            case 2:
                isVar.a.a();
                return;
            default:
                return;
        }
    }
}
