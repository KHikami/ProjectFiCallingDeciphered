package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

public final class hrj implements Creator<StreetViewPanoramaLocation> {
    public /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        LatLng latLng = null;
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) gwb.b(parcel, a, StreetViewPanoramaLink.CREATOR);
                    break;
                case 3:
                    latLng = (LatLng) gwb.a(parcel, a, LatLng.CREATOR);
                    break;
                case 4:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StreetViewPanoramaLocation(i, streetViewPanoramaLinkArr, latLng, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
