package p000;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

final class hka extends hkr {
    private Handler f17054a;

    private void m19990a(int i, Object obj) {
        if (this.f17054a == null) {
            Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        this.f17054a.sendMessage(obtain);
    }

    public void mo2597a(LocationAvailability locationAvailability) {
        m19990a(1, locationAvailability);
    }

    public void mo2598a(LocationResult locationResult) {
        m19990a(0, locationResult);
    }
}
