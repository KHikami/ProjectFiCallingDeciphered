package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEvent;

public final class gtd implements Creator<AccountChangeEvent> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = gwb.b(parcel);
        long j = 0;
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i3 = gwb.f(parcel, a);
                    break;
                case 2:
                    j = gwb.h(parcel, a);
                    break;
                case 3:
                    str2 = gwb.l(parcel, a);
                    break;
                case 4:
                    i2 = gwb.f(parcel, a);
                    break;
                case 5:
                    i = gwb.f(parcel, a);
                    break;
                case 6:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEvent(i3, j, str2, i2, i, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
