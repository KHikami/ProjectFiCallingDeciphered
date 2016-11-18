package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

public final class hky implements Creator<LocationSettingsResult> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        Status status = null;
        int i = 0;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    status = (Status) gwb.m1578a(parcel, a, Status.CREATOR);
                    break;
                case 2:
                    locationSettingsStates = (LocationSettingsStates) gwb.m1578a(parcel, a, LocationSettingsStates.CREATOR);
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
            return new LocationSettingsResult(i, status, locationSettingsStates);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
