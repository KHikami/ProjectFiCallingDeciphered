package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

public final class haj implements Creator<OverflowMenuItem> {
    public /* synthetic */ Object[] newArray(int i) {
        return new OverflowMenuItem[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intent intent = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
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
                    str = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    intent = (Intent) gwb.m1578a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OverflowMenuItem(i2, i, str, intent);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
