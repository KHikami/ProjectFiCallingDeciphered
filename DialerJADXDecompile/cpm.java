import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

final class cpm extends cpz {
    private final void a(int i, Object obj) {
        Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
    }

    public final void a(LocationAvailability locationAvailability) {
        a(1, locationAvailability);
    }

    public final void a(LocationResult locationResult) {
        a(0, locationResult);
    }
}
