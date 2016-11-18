package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

public final class hjm implements Creator<FusedLocationProviderResult> {
    public /* synthetic */ Object[] newArray(int i) {
        return new FusedLocationProviderResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    status = (Status) gwb.m1578a(parcel, a, Status.CREATOR);
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
            return new FusedLocationProviderResult(i, status);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
