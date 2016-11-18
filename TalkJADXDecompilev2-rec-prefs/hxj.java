package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

public final class hxj implements Creator<SignInResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new SignInResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    connectionResult = (ConnectionResult) gwb.m1578a(parcel, a, ConnectionResult.CREATOR);
                    break;
                case 3:
                    resolveAccountResponse = (ResolveAccountResponse) gwb.m1578a(parcel, a, ResolveAccountResponse.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SignInResponse(i, connectionResult, resolveAccountResponse);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
