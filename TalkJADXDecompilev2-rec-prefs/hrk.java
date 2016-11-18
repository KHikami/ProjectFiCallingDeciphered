package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public final class hrk implements Creator<StreetViewPanoramaOrientation> {
    public /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOrientation[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        float f = 0.0f;
        int b = gwb.m1970b(parcel);
        int i = 0;
        float f2 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    f2 = gwb.m2257j(parcel, a);
                    break;
                case 3:
                    f = gwb.m2257j(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StreetViewPanoramaOrientation(i, f2, f);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
