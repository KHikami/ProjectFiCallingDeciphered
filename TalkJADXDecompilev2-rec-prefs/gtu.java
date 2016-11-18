package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class gtu extends Handler {
    private final Context f16146a;

    gtu(Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f16146a = context.getApplicationContext();
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                int a = gtt.m18579a(this.f16146a);
                if (gtt.m18590b(a)) {
                    gtt.m18592c(a, this.f16146a);
                    return;
                }
                return;
            default:
                new StringBuilder(50).append("Don't know how to handle this message: ").append(message.what);
                return;
        }
    }
}
