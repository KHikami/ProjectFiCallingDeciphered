package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;

public final class hzf implements Creator<DeleteDataItemsResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new DeleteDataItemsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i3 = gwb.f(parcel, a);
                    break;
                case 2:
                    i2 = gwb.f(parcel, a);
                    break;
                case 3:
                    i = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DeleteDataItemsResponse(i3, i2, i);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
