package defpackage;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationResult;
import java.util.List;

public final class hkw implements Creator<LocationResult> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        List list = LocationResult.a;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    list = gwb.c(parcel, a, Location.CREATOR);
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
            return new LocationResult(i, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
