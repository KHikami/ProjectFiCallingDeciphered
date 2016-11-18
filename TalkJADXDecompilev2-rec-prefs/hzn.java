package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.GetConfigResponse;

public final class hzn implements Creator<GetConfigResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GetConfigResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.m1970b(parcel);
        ConnectionConfiguration connectionConfiguration = null;
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
                    connectionConfiguration = (ConnectionConfiguration) gwb.m1578a(parcel, a, ConnectionConfiguration.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetConfigResponse(i2, i, connectionConfiguration);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
