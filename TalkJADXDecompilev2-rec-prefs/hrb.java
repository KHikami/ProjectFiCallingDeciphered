package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class hrb implements Creator<LatLngBounds> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        LatLng latLng = null;
        int i = 0;
        LatLng latLng2 = null;
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
                    latLng2 = (LatLng) gwb.m1578a(parcel, a, LatLng.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LatLngBounds(i, latLng, latLng2);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
