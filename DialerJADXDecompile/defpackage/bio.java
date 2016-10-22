package defpackage;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.dialer.incallui.InCallUiControllerService;

/* compiled from: PG */
/* renamed from: bio */
public final class bio extends Handler {
    public bio(InCallUiControllerService inCallUiControllerService, Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                bip bip = new bip(bcj.b(), (PendingIntent) message.obj);
                InCallUiControllerService.a.add(bip);
                bip.a();
            default:
        }
    }
}
