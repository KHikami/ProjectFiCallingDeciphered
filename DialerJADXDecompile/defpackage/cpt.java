package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.ParcelableGeofence;

/* renamed from: cpt */
public final class cpt implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableGeofence[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
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
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    str = buf.k(parcel, a);
                    break;
                case rq.c /*2*/:
                    j = buf.g(parcel, a);
                    break;
                case rl.e /*3*/:
                    s = buf.d(parcel, a);
                    break;
                case rl.f /*4*/:
                    d = buf.j(parcel, a);
                    break;
                case rl.g /*5*/:
                    d2 = buf.j(parcel, a);
                    break;
                case rl.i /*6*/:
                    f = buf.i(parcel, a);
                    break;
                case rl.h /*7*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rl.j /*8*/:
                    i3 = buf.e(parcel, a);
                    break;
                case rl.l /*9*/:
                    i4 = buf.e(parcel, a);
                    break;
                case 1000:
                    i = buf.e(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableGeofence(i, str, i2, s, d, d2, f, j, i3, i4);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }
}
