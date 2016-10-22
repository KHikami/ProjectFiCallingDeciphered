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
        int b = gwb.b(parcel);
        ChannelImpl channelImpl = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i4 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    channelImpl = (ChannelImpl) gwb.a(parcel, a, ChannelImpl.CREATOR);
                    break;
                case wi.z /*3*/:
                    i3 = gwb.f(parcel, a);
                    break;
                case wi.h /*4*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.p /*5*/:
                    i = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChannelEventParcelable(i4, channelImpl, i3, i2, i);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
