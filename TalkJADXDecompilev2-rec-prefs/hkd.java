package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.ClientIdentity;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

public final class hkd implements Creator<LocationRequestInternal> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestInternal[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = gwb.m1970b(parcel);
        boolean z2 = true;
        List list = LocationRequestInternal.f7578a;
        LocationRequest locationRequest = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    locationRequest = (LocationRequest) gwb.m1578a(parcel, a, LocationRequest.CREATOR);
                    break;
                case 4:
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 5:
                    list = gwb.m2089c(parcel, a, ClientIdentity.CREATOR);
                    break;
                case 6:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 7:
                    z = gwb.m2114c(parcel, a);
                    break;
                case 1000:
                    i = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationRequestInternal(i, locationRequest, z2, list, str, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
