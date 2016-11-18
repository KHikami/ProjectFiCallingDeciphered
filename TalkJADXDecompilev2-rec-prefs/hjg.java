package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;

public final class hjg implements Creator<LocationRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        int i = 0;
        int i2 = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    j = gwb.m2227h(parcel, a);
                    break;
                case 3:
                    j2 = gwb.m2227h(parcel, a);
                    break;
                case 4:
                    z = gwb.m2114c(parcel, a);
                    break;
                case 5:
                    j3 = gwb.m2227h(parcel, a);
                    break;
                case 6:
                    i3 = gwb.m2189f(parcel, a);
                    break;
                case 7:
                    f = gwb.m2257j(parcel, a);
                    break;
                case 8:
                    j4 = gwb.m2227h(parcel, a);
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
            return new LocationRequest(i, i2, j, j2, z, j3, i3, f, j4);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
