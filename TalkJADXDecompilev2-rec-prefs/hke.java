package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

public final class hke implements Creator<LocationRequestUpdateData> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        int i2 = 1;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        LocationRequestInternal locationRequestInternal = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    locationRequestInternal = (LocationRequestInternal) gwb.m1578a(parcel, a, LocationRequestInternal.CREATOR);
                    break;
                case 3:
                    iBinder3 = gwb.m2296m(parcel, a);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) gwb.m1578a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = gwb.m2296m(parcel, a);
                    break;
                case 6:
                    iBinder = gwb.m2296m(parcel, a);
                    break;
                case 1000:
                    i = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationRequestUpdateData(i, i2, locationRequestInternal, iBinder3, pendingIntent, iBinder2, iBinder);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
