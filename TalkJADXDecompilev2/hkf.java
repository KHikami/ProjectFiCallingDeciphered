package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.ParcelableGeofence;

public final class hkf implements Creator<ParcelableGeofence> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ParcelableGeofence[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        short s = (short) 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i3 = 0;
        int i4 = -1;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    str = gwb.l(parcel, a);
                    break;
                case 2:
                    j = gwb.h(parcel, a);
                    break;
                case 3:
                    s = gwb.e(parcel, a);
                    break;
                case 4:
                    d = gwb.k(parcel, a);
                    break;
                case 5:
                    d2 = gwb.k(parcel, a);
                    break;
                case 6:
                    f = gwb.j(parcel, a);
                    break;
                case 7:
                    i2 = gwb.f(parcel, a);
                    break;
                case 8:
                    i3 = gwb.f(parcel, a);
                    break;
                case 9:
                    i4 = gwb.f(parcel, a);
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
            return new ParcelableGeofence(i, str, i2, s, d, d2, f, j, i3, i4);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
