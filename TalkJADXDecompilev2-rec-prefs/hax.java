package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

public final class hax implements Creator<PredictedNetworkQuality> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PredictedNetworkQuality[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        int b = gwb.m1970b(parcel);
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i3 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 3:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 4:
                    j2 = gwb.m2227h(parcel, a);
                    break;
                case 5:
                    j = gwb.m2227h(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PredictedNetworkQuality(i3, i2, i, j2, j);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
