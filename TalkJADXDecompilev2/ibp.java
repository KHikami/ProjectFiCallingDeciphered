package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;

public final class ibp implements Creator<ChannelReceiveFileResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ChannelReceiveFileResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
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
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChannelReceiveFileResponse(i2, i);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
