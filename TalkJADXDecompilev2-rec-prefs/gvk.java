package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

public final class gvk implements Creator<ResolveAccountResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        ConnectionResult connectionResult = null;
        boolean z = false;
        int b = gwb.m1970b(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    iBinder = gwb.m2296m(parcel, a);
                    break;
                case 3:
                    connectionResult = (ConnectionResult) gwb.m1578a(parcel, a, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 5:
                    z = gwb.m2114c(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ResolveAccountResponse(i, iBinder, connectionResult, z2, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
