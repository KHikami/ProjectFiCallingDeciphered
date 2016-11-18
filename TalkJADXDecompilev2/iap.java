package defpackage;

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
        int b = gwb.b(parcel);
        long j = 0;
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i2 = gwb.f(parcel, a);
                    break;
                case 2:
                    i = gwb.f(parcel, a);
                    break;
                case 3:
                    j = gwb.h(parcel, a);
                    break;
                case 4:
                    list = gwb.c(parcel, a, PackageStorageInfo.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StorageInfoResponse(i2, i, j, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
