package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationSettingsStates;

public final class hkz implements Creator<LocationSettingsStates> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = gwb.b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    z6 = gwb.c(parcel, a);
                    break;
                case 2:
                    z5 = gwb.c(parcel, a);
                    break;
                case 3:
                    z4 = gwb.c(parcel, a);
                    break;
                case 4:
                    z3 = gwb.c(parcel, a);
                    break;
                case 5:
                    z2 = gwb.c(parcel, a);
                    break;
                case 6:
                    z = gwb.c(parcel, a);
                    break;
                case 1000:
                    i = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationSettingsStates(i, z6, z5, z4, z3, z2, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
