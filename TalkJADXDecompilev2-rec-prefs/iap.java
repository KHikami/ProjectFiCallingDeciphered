package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.PackageStorageInfo;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import java.util.List;

public final class iap implements Creator<StorageInfoResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new StorageInfoResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.m1970b(parcel);
        long j = 0;
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 3:
                    j = gwb.m2227h(parcel, a);
                    break;
                case 4:
                    list = gwb.m2089c(parcel, a, PackageStorageInfo.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StorageInfoResponse(i2, i, j, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
