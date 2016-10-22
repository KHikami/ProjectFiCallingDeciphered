package defpackage;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: cpo */
final class cpo extends cqc {
    Handler a;

    cpo(com com, Looper looper) {
        if (looper == null) {
            buf.a(Looper.myLooper() != null, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
        }
        this.a = looper == null ? new cpn(com) : new cpn(com, looper);
    }

    public final void a(Location location) {
        if (this.a == null) {
            Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = location;
        this.a.sendMessage(obtain);
    }
}
