import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class iah implements Creator<MessageEventParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new MessageEventParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = gwb.b(parcel);
        byte[] bArr = null;
        String str2 = null;
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
                    str2 = gwb.l(parcel, a);
                    break;
                case wi.h /*4*/:
                    bArr = gwb.o(parcel, a);
                    break;
                case wi.p /*5*/:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MessageEventParcelable(i2, i, str2, bArr, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
