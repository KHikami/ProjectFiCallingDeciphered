package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.ResolveAccountRequest;

public final class gvj implements Creator<ResolveAccountRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        int i = 0;
        Account account = null;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    account = (Account) gwb.m1578a(parcel, a, Account.CREATOR);
                    break;
                case 3:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) gwb.m1578a(parcel, a, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ResolveAccountRequest(i2, account, i, googleSignInAccount);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}