package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class hwt implements Creator<PlayLoggerContext> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = gwb.m1970b(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i4 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    str4 = gwb.m2288l(parcel, a);
                    break;
                case 3:
                    i3 = gwb.m2189f(parcel, a);
                    break;
                case 4:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 5:
                    str3 = gwb.m2288l(parcel, a);
                    break;
                case 6:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 7:
                    z = gwb.m2114c(parcel, a);
                    break;
                case 8:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 9:
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 10:
                    i = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlayLoggerContext(i4, str4, i3, i2, str3, str2, z, str, z2, i);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
