package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.List;

public final class hrg implements Creator<PolylineOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = gwb.m1970b(parcel);
        List list = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    list = gwb.m2089c(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    f2 = gwb.m2257j(parcel, a);
                    break;
                case 4:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 5:
                    f = gwb.m2257j(parcel, a);
                    break;
                case 6:
                    z3 = gwb.m2114c(parcel, a);
                    break;
                case 7:
                    z2 = gwb.m2114c(parcel, a);
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
            return new PolylineOptions(i2, list, f2, i, f, z3, z2, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
