import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.ClientIdentity;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

public final class cpr implements Creator {
    public static LocationRequestInternal a(Parcel parcel) {
        String str = null;
        boolean z = true;
        boolean z2 = false;
        int b = buf.b(parcel);
        List list = LocationRequestInternal.a;
        boolean z3 = true;
        boolean z4 = false;
        LocationRequest locationRequest = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    locationRequest = (LocationRequest) buf.a(parcel, a, LocationRequest.CREATOR);
                    break;
                case rq.c /*2*/:
                    z4 = buf.c(parcel, a);
                    break;
                case rl.e /*3*/:
                    z3 = buf.c(parcel, a);
                    break;
                case rl.f /*4*/:
                    z = buf.c(parcel, a);
                    break;
                case rl.g /*5*/:
                    list = buf.c(parcel, a, ClientIdentity.CREATOR);
                    break;
                case rl.i /*6*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.h /*7*/:
                    z2 = buf.c(parcel, a);
                    break;
                case 1000:
                    i = buf.e(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationRequestInternal(i, locationRequest, z4, z3, z, list, str, z2);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestInternal[i];
    }
}
