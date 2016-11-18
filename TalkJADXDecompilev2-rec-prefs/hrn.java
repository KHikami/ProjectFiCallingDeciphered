package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

public final class hrn implements Creator<VisibleRegion> {
    public /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    latLng4 = (LatLng) gwb.m1578a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    latLng3 = (LatLng) gwb.m1578a(parcel, a, LatLng.CREATOR);
                    break;
                case 4:
                    latLng2 = (LatLng) gwb.m1578a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    latLng = (LatLng) gwb.m1578a(parcel, a, LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) gwb.m1578a(parcel, a, LatLngBounds.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VisibleRegion(i, latLng4, latLng3, latLng2, latLng, latLngBounds);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
