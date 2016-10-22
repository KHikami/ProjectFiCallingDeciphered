import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.ChannelImpl;

public final class ibo implements Creator<ChannelImpl> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ChannelImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int b = gwb.b(parcel);
        String str2 = null;
        int i = 0;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    str2 = gwb.l(parcel, a);
                    break;
                case wi.z /*3*/:
                    str3 = gwb.l(parcel, a);
                    break;
                case wi.h /*4*/:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChannelImpl(i, str2, str3, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
