import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.List;

public interface cpf extends IInterface {
    Location a();

    ActivityRecognitionResult a(String str);

    void a(long j, boolean z, PendingIntent pendingIntent);

    void a(PendingIntent pendingIntent);

    void a(PendingIntent pendingIntent, bte bte);

    void a(PendingIntent pendingIntent, cpc cpc, String str);

    void a(Location location);

    void a(Location location, int i);

    void a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, cpc cpc);

    void a(GestureRequest gestureRequest, PendingIntent pendingIntent, bte bte);

    void a(LocationRequest locationRequest, PendingIntent pendingIntent);

    void a(LocationRequest locationRequest, cqb cqb);

    void a(LocationRequest locationRequest, cqb cqb, String str);

    void a(LocationSettingsRequest locationSettingsRequest, cpi cpi, String str);

    void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    void a(LocationRequestInternal locationRequestInternal, cqb cqb);

    void a(LocationRequestUpdateData locationRequestUpdateData);

    void a(coz coz);

    void a(cpc cpc, String str);

    void a(cqb cqb);

    void a(List list, PendingIntent pendingIntent, cpc cpc, String str);

    void a(boolean z);

    void a(String[] strArr, cpc cpc, String str);

    Location b(String str);

    void b(PendingIntent pendingIntent);

    void b(PendingIntent pendingIntent, bte bte);

    LocationAvailability c(String str);

    void c(PendingIntent pendingIntent, bte bte);

    void d(PendingIntent pendingIntent, bte bte);

    void e(PendingIntent pendingIntent, bte bte);
}
