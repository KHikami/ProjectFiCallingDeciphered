package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import java.util.List;

public final class gtf implements Creator<AccountChangeEventsResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEventsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    list = gwb.c(parcel, a, AccountChangeEvent.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEventsResponse(i, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
