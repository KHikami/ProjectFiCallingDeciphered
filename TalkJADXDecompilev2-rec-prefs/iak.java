package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.PackageStorageInfo;

public final class iak implements Creator<PackageStorageInfo> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PackageStorageInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 3:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    j = gwb.m2227h(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PackageStorageInfo(i, str2, str, j);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
