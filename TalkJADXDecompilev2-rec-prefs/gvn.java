package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;

public final class gvn implements Creator<AuthAccountRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        Integer num2 = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
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
                    scopeArr = (Scope[]) gwb.m2067b(parcel, a, Scope.CREATOR);
                    break;
                case 4:
                    num2 = gwb.m2215g(parcel, a);
                    break;
                case 5:
                    num = gwb.m2215g(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AuthAccountRequest(i, iBinder, scopeArr, num2, num);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
