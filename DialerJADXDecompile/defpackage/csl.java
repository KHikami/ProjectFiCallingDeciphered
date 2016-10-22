package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: csl */
public final class csl implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    connectionResult = (ConnectionResult) buf.a(parcel, a, ConnectionResult.CREATOR);
                    break;
                case rl.e /*3*/:
                    resolveAccountResponse = (ResolveAccountResponse) buf.a(parcel, a, ResolveAccountResponse.CREATOR);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SignInResponse(i, connectionResult, resolveAccountResponse);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInResponse[i];
    }
}
