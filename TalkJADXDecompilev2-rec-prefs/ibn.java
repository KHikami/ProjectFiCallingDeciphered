package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;

public final class ibn implements Creator<ChannelEventParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ChannelEventParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.m1970b(parcel);
        ChannelImpl channelImpl = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i4 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    channelImpl = (ChannelImpl) gwb.m1578a(parcel, a, ChannelImpl.CREATOR);
                    break;
                case 3:
                    i3 = gwb.m2189f(parcel, a);
                    break;
                case 4:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 5:
                    i = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChannelEventParcelable(i4, channelImpl, i3, i2, i);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
