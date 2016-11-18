package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class iai implements Creator<NodeParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new NodeParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = gwb.m1970b(parcel);
        int i = 0;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 3:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    i = gwb.m2189f(parcel, a);
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
            return new NodeParcelable(i2, str2, str, i, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
