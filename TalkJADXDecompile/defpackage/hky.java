package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: hky */
public final class hky implements Creator<LocationSettingsResult> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        Status status = null;
        int i = 0;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    status = (Status) gwb.a(parcel, a, Status.CREATOR);
                    break;
                case wi.l /*2*/:
                    locationSettingsStates = (LocationSettingsStates) gwb.a(parcel, a, LocationSettingsStates.CREATOR);
                    break;
                case 1000:
                    i = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationSettingsResult(i, status, locationSettingsStates);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
