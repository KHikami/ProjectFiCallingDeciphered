package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import java.util.List;

public final class hwz implements Creator<CheckServerAuthResult> {
    public /* synthetic */ Object[] newArray(int i) {
        return new CheckServerAuthResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = gwb.b(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    z = gwb.c(parcel, a);
                    break;
                case 3:
                    list = gwb.c(parcel, a, Scope.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CheckServerAuthResult(i, z, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
