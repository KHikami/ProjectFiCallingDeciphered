package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationAvailability;

public final class hjf implements Creator<LocationAvailability> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 1;
        int b = gwb.m1970b(parcel);
        int i2 = 0;
        int i3 = 1000;
        long j = 0;
        int i4 = 1;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i4 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 3:
                    j = gwb.m2227h(parcel, a);
                    break;
                case 4:
                    i3 = gwb.m2189f(parcel, a);
                    break;
                case 1000:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationAvailability(i2, i3, i4, i, j);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
