package p000;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class hkb extends hku {
    private Handler f17055a;

    public void mo2599a(Location location) {
        if (this.f17055a == null) {
            Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = location;
        this.f17055a.sendMessage(obtain);
    }
}
