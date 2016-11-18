package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.LogOptions;

public final class gza implements Creator<LogOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LogOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = gwb.m1970b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 3:
                    z = gwb.m2114c(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LogOptions(i, str, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
