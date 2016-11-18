package p000;

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
    Location mo2565a();

    ActivityRecognitionResult mo2566a(String str);

    void mo2567a(long j, boolean z, PendingIntent pendingIntent);

    void mo2568a(PendingIntent pendingIntent);

    void mo2569a(PendingIntent pendingIntent, hfu hfu);

    void mo2570a(PendingIntent pendingIntent, hjq hjq, String str);

    void mo2571a(Location location);

    void mo2572a(Location location, int i);

    void mo2573a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, hfu hfu);

    void mo2574a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, hjq hjq);

    void mo2575a(GestureRequest gestureRequest, PendingIntent pendingIntent, hfu hfu);

    void mo2576a(LocationRequest locationRequest, PendingIntent pendingIntent);

    void mo2577a(LocationRequest locationRequest, hkt hkt);

    void mo2578a(LocationRequest locationRequest, hkt hkt, String str);

    void mo2579a(LocationSettingsRequest locationSettingsRequest, hjw hjw, String str);

    void mo2580a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    void mo2581a(LocationRequestInternal locationRequestInternal, hkt hkt);

    void mo2582a(LocationRequestUpdateData locationRequestUpdateData);

    void mo2583a(hjn hjn);

    void mo2584a(hjq hjq, String str);

    void mo2585a(hkt hkt);

    void mo2586a(List<ParcelableGeofence> list, PendingIntent pendingIntent, hjq hjq, String str);

    void mo2587a(boolean z);

    void mo2588a(String[] strArr, hjq hjq, String str);

    Location mo2589b(String str);

    void mo2590b(PendingIntent pendingIntent);

    void mo2591b(PendingIntent pendingIntent, hfu hfu);

    LocationAvailability mo2592c(String str);

    void mo2593c(PendingIntent pendingIntent, hfu hfu);

    void mo2594d(PendingIntent pendingIntent, hfu hfu);

    void mo2595e(PendingIntent pendingIntent, hfu hfu);
}
