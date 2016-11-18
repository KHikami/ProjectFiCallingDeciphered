package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.ConnectionConfiguration;

public final class ibz implements Creator<ConnectionConfiguration> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = gwb.m1970b(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i3 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    str4 = gwb.m2288l(parcel, a);
                    break;
                case 3:
                    str3 = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 5:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 6:
                    z3 = gwb.m2114c(parcel, a);
                    break;
                case 7:
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 8:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 9:
                    z = gwb.m2114c(parcel, a);
                    break;
                case 10:
                    str = gwb.m2288l(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConnectionConfiguration(i3, str4, str3, i2, i, z3, z2, str2, z, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
