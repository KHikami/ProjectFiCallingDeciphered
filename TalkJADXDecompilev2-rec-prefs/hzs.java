package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class hzs implements Creator<GetLocalNodeResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GetLocalNodeResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.m1970b(parcel);
        NodeParcelable nodeParcelable = null;
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
                    nodeParcelable = (NodeParcelable) gwb.m1578a(parcel, a, NodeParcelable.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetLocalNodeResponse(i2, i, nodeParcelable);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}