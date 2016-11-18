package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

public final class guw implements Creator<Status> {
    public /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
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
                    pendingIntent = (PendingIntent) gwb.m1578a(parcel, a, PendingIntent.CREATOR);
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
            return new Status(i2, i, str, pendingIntent);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
