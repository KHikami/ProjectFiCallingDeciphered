import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.ChannelImpl;
import com.google.android.gms.wearable.internal.OpenChannelResponse;

public final class iaj implements Creator<OpenChannelResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new OpenChannelResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        ChannelImpl channelImpl = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.z /*3*/:
                    channelImpl = (ChannelImpl) gwb.a(parcel, a, ChannelImpl.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OpenChannelResponse(i2, i, channelImpl);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
