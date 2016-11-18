package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;

public final class huc implements Creator<ParcelableListOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ParcelableListOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle = null;
        boolean z = false;
        int b = gwb.m1970b(parcel);
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    z3 = gwb.m2114c(parcel, a);
                    break;
                case 2:
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 3:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    z = gwb.m2114c(parcel, a);
                    break;
                case 5:
                    bundle = gwb.m2304n(parcel, a);
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
            return new ParcelableListOptions(i, z3, z2, z, str, bundle);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
