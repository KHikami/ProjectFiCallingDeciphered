package defpackage;

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
        int b = gwb.b(parcel);
        DataItemParcelable dataItemParcelable = null;
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
                    dataItemParcelable = (DataItemParcelable) gwb.a(parcel, a, DataItemParcelable.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetDataItemResponse(i2, i, dataItemParcelable);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
