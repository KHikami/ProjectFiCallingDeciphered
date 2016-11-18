package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;

public final class hzl implements Creator<GetCloudSyncOptInStatusResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GetCloudSyncOptInStatusResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = gwb.m1970b(parcel);
        boolean z2 = false;
        int i = 0;
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
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 4:
                    z = gwb.m2114c(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetCloudSyncOptInStatusResponse(i2, i, z2, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
