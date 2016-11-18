package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.List;

public final class hkx implements Creator<LocationSettingsRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = gwb.m1970b(parcel);
        List list = null;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    list = gwb.m2089c(parcel, a, LocationRequest.CREATOR);
                    break;
                case 2:
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 3:
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
            return new LocationSettingsRequest(i, list, z2, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
