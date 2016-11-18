package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import com.google.android.gms.wearable.internal.GetDataItemResponse;

public final class hzq implements Creator<GetDataItemResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GetDataItemResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.m1970b(parcel);
        DataItemParcelable dataItemParcelable = null;
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
                    dataItemParcelable = (DataItemParcelable) gwb.m1578a(parcel, a, DataItemParcelable.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetDataItemResponse(i2, i, dataItemParcelable);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
