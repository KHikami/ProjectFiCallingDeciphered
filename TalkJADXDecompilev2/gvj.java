package defpackage;

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
        int b = gwb.b(parcel);
        int i = 0;
        Account account = null;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i2 = gwb.f(parcel, a);
                    break;
                case 2:
                    account = (Account) gwb.a(parcel, a, Account.CREATOR);
                    break;
                case 3:
                    i = gwb.f(parcel, a);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) gwb.a(parcel, a, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ResolveAccountRequest(i2, account, i, googleSignInAccount);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
