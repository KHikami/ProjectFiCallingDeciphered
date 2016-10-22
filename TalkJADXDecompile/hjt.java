import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

public interface hjt extends IInterface {
    Location a();

    ActivityRecognitionResult a(String str);

    void a(long j, boolean z, PendingIntent pendingIntent);

    void a(PendingIntent pendingIntent);

    void a(PendingIntent pendingIntent, hfu hfu);

    void a(PendingIntent pendingIntent, hjq hjq, String str);

    void a(Location location);

    void a(Location location, int i);

    void a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, hfu hfu);

    void a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, hjq hjq);

    void a(GestureRequest gestureRequest, PendingIntent pendingIntent, hfu hfu);

    void a(LocationRequest locationRequest, PendingIntent pendingIntent);

    void a(LocationRequest locationRequest, hkt hkt);

    void a(LocationRequest locationRequest, hkt hkt, String str);

    void a(LocationSettingsRequest locationSettingsRequest, hjw hjw, String str);

    void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    void a(LocationRequestInternal locationRequestInternal, hkt hkt);

    void a(LocationRequestUpdateData locationRequestUpdateData);

    void a(hjn hjn);

    void a(hjq hjq, String str);

    void a(hkt hkt);

    void a(List<ParcelableGeofence> list, PendingIntent pendingIntent, hjq hjq, String str);

    void a(boolean z);

    void a(String[] strArr, hjq hjq, String str);

    Location b(String str);

    void b(PendingIntent pendingIntent);

    void b(PendingIntent pendingIntent, hfu hfu);

    LocationAvailability c(String str);

    void c(PendingIntent pendingIntent, hfu hfu);

    void d(PendingIntent pendingIntent, hfu hfu);

    void e(PendingIntent pendingIntent, hfu hfu);
}
