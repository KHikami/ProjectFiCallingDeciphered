package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;

public final class ibk implements Creator<AmsEntityUpdateParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AmsEntityUpdateParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte b = (byte) 0;
        int b2 = gwb.m1970b(parcel);
        String str = null;
        byte b3 = (byte) 0;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    b3 = gwb.m2120d(parcel, a);
                    break;
                case 3:
                    b = gwb.m2120d(parcel, a);
                    break;
                case 4:
                    str = gwb.m2288l(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b2) {
            return new AmsEntityUpdateParcelable(i, b3, b, str);
        }
        throw new dt("Overread allowed size end=" + b2, parcel);
    }
}
