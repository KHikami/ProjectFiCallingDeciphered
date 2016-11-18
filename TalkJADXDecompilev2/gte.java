package defpackage;

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
        int b = gwb.b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i2 = gwb.f(parcel, a);
                    break;
                case 2:
                    i = gwb.f(parcel, a);
                    break;
                case 3:
                    str = gwb.l(parcel, a);
                    break;
                case 4:
                    account = (Account) gwb.a(parcel, a, Account.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEventsRequest(i2, i, str, account);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
