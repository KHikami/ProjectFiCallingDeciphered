package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ValidateAccountRequest;

public final class gvm implements Creator<ValidateAccountRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ValidateAccountRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = gwb.m1970b(parcel);
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        int i2 = 0;
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
                    iBinder = gwb.m2296m(parcel, a);
                    break;
                case 4:
                    scopeArr = (Scope[]) gwb.m2067b(parcel, a, Scope.CREATOR);
                    break;
                case 5:
                    bundle = gwb.m2304n(parcel, a);
                    break;
                case 6:
                    str = gwb.m2288l(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ValidateAccountRequest(i2, i, iBinder, scopeArr, bundle, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
