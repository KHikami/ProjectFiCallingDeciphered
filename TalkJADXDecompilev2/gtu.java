package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class gtu extends Handler {
    private final Context a;

    gtu(Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = context.getApplicationContext();
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                int a = gtt.a(this.a);
                if (gtt.b(a)) {
                    gtt.c(a, this.a);
                    return;
                }
                return;
            default:
                new StringBuilder(50).append("Don't know how to handle this message: ").append(message.what);
                return;
        }
    }
}
