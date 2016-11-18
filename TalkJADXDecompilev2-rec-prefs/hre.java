package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;

public final class hre implements Creator<PointOfInterest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PointOfInterest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        String str = null;
        LatLng latLng = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    latLng = (LatLng) gwb.m1578a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PointOfInterest(i, latLng, str, str2);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
