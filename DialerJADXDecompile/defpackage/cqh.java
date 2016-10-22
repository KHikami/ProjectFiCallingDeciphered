package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: cqh */
public final class cqh implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = buf.b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    z6 = buf.c(parcel, a);
                    break;
                case rq.c /*2*/:
                    z5 = buf.c(parcel, a);
                    break;
                case rl.e /*3*/:
                    z4 = buf.c(parcel, a);
                    break;
                case rl.f /*4*/:
                    z3 = buf.c(parcel, a);
                    break;
                case rl.g /*5*/:
                    z2 = buf.c(parcel, a);
                    break;
                case rl.i /*6*/:
                    z = buf.c(parcel, a);
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
            return new LocationSettingsStates(i, z6, z5, z4, z3, z2, z);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
