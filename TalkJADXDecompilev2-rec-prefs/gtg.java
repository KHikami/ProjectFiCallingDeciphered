package p000;

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
        int b = gwb.m1970b(parcel);
        boolean z2 = false;
        Long l = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 3:
                    l = gwb.m2246i(parcel, a);
                    break;
                case 4:
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 5:
                    z = gwb.m2114c(parcel, a);
                    break;
                case 6:
                    list = gwb.m2347s(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TokenData(i, str, l, z2, z, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
