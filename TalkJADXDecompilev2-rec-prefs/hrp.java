package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class hrp implements Creator<StreetViewPanoramaOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num = null;
        byte b = (byte) 0;
        int b2 = gwb.m1970b(parcel);
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        byte b5 = (byte) 0;
        byte b6 = (byte) 0;
        LatLng latLng = null;
        String str = null;
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) gwb.m1578a(parcel, a, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    latLng = (LatLng) gwb.m1578a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    num = gwb.m2215g(parcel, a);
                    break;
                case 6:
                    b6 = gwb.m2120d(parcel, a);
                    break;
                case 7:
                    b5 = gwb.m2120d(parcel, a);
                    break;
                case 8:
                    b4 = gwb.m2120d(parcel, a);
                    break;
                case 9:
                    b3 = gwb.m2120d(parcel, a);
                    break;
                case 10:
                    b = gwb.m2120d(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b2) {
            return new StreetViewPanoramaOptions(i, streetViewPanoramaCamera, str, latLng, num, b6, b5, b4, b3, b);
        }
        throw new dt("Overread allowed size end=" + b2, parcel);
    }
}
