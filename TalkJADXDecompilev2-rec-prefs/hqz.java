package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

public final class hqz implements Creator<CircleOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = gwb.m1970b(parcel);
        LatLng latLng = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i3 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    latLng = (LatLng) gwb.m1578a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    d = gwb.m2272k(parcel, a);
                    break;
                case 4:
                    f2 = gwb.m2257j(parcel, a);
                    break;
                case 5:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 6:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 7:
                    f = gwb.m2257j(parcel, a);
                    break;
                case 8:
                    z = gwb.m2114c(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CircleOptions(i3, latLng, d, f2, i2, i, f, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
