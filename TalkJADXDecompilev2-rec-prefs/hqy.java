package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public final class hqy implements Creator<CameraPosition> {
    public /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        float f = 0.0f;
        int b = gwb.m1970b(parcel);
        int i = 0;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
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
                    f3 = gwb.m2257j(parcel, a);
                    break;
                case 4:
                    f2 = gwb.m2257j(parcel, a);
                    break;
                case 5:
                    f = gwb.m2257j(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CameraPosition(i, latLng, f3, f2, f);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
