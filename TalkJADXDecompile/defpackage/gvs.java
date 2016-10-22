package defpackage;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: gvs */
final class gvs extends Handler {
    final /* synthetic */ gvo a;

    public gvs(gvo gvo, Looper looper) {
        this.a = gvo;
        super(looper);
    }

    private static void a(Message message) {
        ((gvt) message.obj).c();
    }

    private static boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 5;
    }

    public void handleMessage(Message message) {
        PendingIntent pendingIntent = null;
        if (this.a.c.get() != message.arg1) {
            if (gvs.b(message)) {
                gvs.a(message);
            }
        } else if ((message.what == 1 || message.what == 5) && !this.a.c()) {
            gvs.a(message);
        } else if (message.what == 3) {
            if (message.obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent) message.obj;
            }
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
            this.a.p.a(connectionResult);
            this.a.a(connectionResult);
        } else if (message.what == 4) {
            this.a.a(4, null);
            if (this.a.u != null) {
                this.a.u.a(message.arg2);
            }
            this.a.a(message.arg2);
            this.a.a(4, 1, null);
        } else if (message.what == 2 && !this.a.b()) {
            gvs.a(message);
        } else if (gvs.b(message)) {
            ((gvt) message.obj).b();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
        }
    }
}
