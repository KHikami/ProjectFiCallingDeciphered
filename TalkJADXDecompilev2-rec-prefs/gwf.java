package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

public final class gwf implements Creator<GetServiceRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        Account account = null;
        int b = gwb.m1970b(parcel);
        long j = 0;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i3 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 3:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 4:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 5:
                    iBinder = gwb.m2296m(parcel, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) gwb.m2067b(parcel, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = gwb.m2304n(parcel, a);
                    break;
                case 8:
                    account = (Account) gwb.m1578a(parcel, a, Account.CREATOR);
                    break;
                case 9:
                    j = gwb.m2227h(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetServiceRequest(i3, i2, i, str, iBinder, scopeArr, bundle, account, j);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
