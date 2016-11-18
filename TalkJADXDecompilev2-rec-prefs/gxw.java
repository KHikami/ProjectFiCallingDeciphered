package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;

public final class gxw implements Creator<ConnectionResult> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        PendingIntent pendingIntent = null;
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
                    pendingIntent = (PendingIntent) gwb.m1578a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 4:
                    str = gwb.m2288l(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConnectionResult(i2, i, pendingIntent, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
