import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identity.accounts.api.AccountData;

public final class hbl implements Creator<AccountData> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AccountData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int b = gwb.b(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    str2 = gwb.l(parcel, a);
                    break;
                case wi.l /*2*/:
                    str = gwb.l(parcel, a);
                    break;
                case 1000:
                    i = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountData(i, str2, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
