package defpackage;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: cpn */
final class cpn extends Handler {
    private final com a;

    public cpn(com com) {
        this.a = com;
    }

    public cpn(com com, Looper looper) {
        super(looper);
        this.a = com;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case rq.b /*1*/:
                this.a.a(new Location((Location) message.obj));
            default:
                Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
        }
    }
}
