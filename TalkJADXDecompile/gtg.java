import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.TokenData;
import java.util.List;

public final class gtg implements Creator<TokenData> {
    public /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        boolean z = false;
        int b = gwb.b(parcel);
        boolean z2 = false;
        Long l = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    str = gwb.l(parcel, a);
                    break;
                case wi.z /*3*/:
                    l = gwb.i(parcel, a);
                    break;
                case wi.h /*4*/:
                    z2 = gwb.c(parcel, a);
                    break;
                case wi.p /*5*/:
                    z = gwb.c(parcel, a);
                    break;
                case wi.s /*6*/:
                    list = gwb.s(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TokenData(i, str, l, z2, z, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
