package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.model.AvatarReference;

public final class hws implements Creator<AvatarReference> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AvatarReference[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.m1970b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 1000:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AvatarReference(i2, i, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
