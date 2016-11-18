package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.identity.internal.AccountToken;

public final class htx implements Creator<AccountToken> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AccountToken[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int b = gwb.b(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    str2 = gwb.l(parcel, a);
                    break;
                case 2:
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
            return new AccountToken(i, str2, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
