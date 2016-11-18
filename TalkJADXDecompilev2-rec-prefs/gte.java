package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;

public final class gte implements Creator<AccountChangeEventsRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEventsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        Account account = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 3:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    account = (Account) gwb.m1578a(parcel, a, Account.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEventsRequest(i2, i, str, account);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
