package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.internal.PlaceLocalization;
import java.util.List;

public final class hkj implements Creator<PlaceLocalization> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PlaceLocalization[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    str4 = gwb.m2288l(parcel, a);
                    break;
                case 2:
                    str3 = gwb.m2288l(parcel, a);
                    break;
                case 3:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 5:
                    list = gwb.m2347s(parcel, a);
                    break;
                case 1000:
                    i = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlaceLocalization(i, str4, str3, str2, str, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
