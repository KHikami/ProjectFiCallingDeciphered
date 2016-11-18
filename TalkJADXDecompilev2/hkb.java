package defpackage;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class hkb extends hku {
    private Handler a;

    public void a(Location location) {
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
