import android.os.IInterface;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public interface hkq extends IInterface {
    void a(LocationAvailability locationAvailability);

    void a(LocationResult locationResult);
}
