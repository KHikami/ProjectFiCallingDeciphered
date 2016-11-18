package p000;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class gvs extends Handler {
    final /* synthetic */ gvo f16250a;

    public gvs(gvo gvo, Looper looper) {
        this.f16250a = gvo;
        super(looper);
    }

    private static void m18735a(Message message) {
        ((gvt) message.obj).m18726c();
    }

    private static boolean m18736b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 5;
    }

    public void handleMessage(Message message) {
        PendingIntent pendingIntent = null;
        if (this.f16250a.f16217c.get() != message.arg1) {
            if (gvs.m18736b(message)) {
                gvs.m18735a(message);
            }
        } else if ((message.what == 1 || message.what == 5) && !this.f16250a.m18703c()) {
            gvs.m18735a(message);
        } else if (message.what == 3) {
            if (message.obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent) message.obj;
            }
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
            this.f16250a.f16229p.mo2352a(connectionResult);
            this.f16250a.m18697a(connectionResult);
        } else if (message.what == 4) {
            this.f16250a.m18683a(4, null);
            if (this.f16250a.f16234u != null) {
                this.f16250a.f16234u.m18732a(message.arg2);
            }
            this.f16250a.m18694a(message.arg2);
            this.f16250a.m18685a(4, 1, null);
        } else if (message.what == 2 && !this.f16250a.m18702b()) {
            gvs.m18735a(message);
        } else if (gvs.m18736b(message)) {
            ((gvt) message.obj).m18725b();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
        }
    }
}
