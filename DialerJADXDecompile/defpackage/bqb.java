package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEvent;

/* renamed from: bqb */
public final class bqb implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = buf.b(parcel);
        long j = 0;
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i3 = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    j = buf.g(parcel, a);
                    break;
                case rl.e /*3*/:
                    str2 = buf.k(parcel, a);
                    break;
                case rl.f /*4*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rl.g /*5*/:
                    i = buf.e(parcel, a);
                    break;
                case rl.i /*6*/:
                    str = buf.k(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEvent(i3, j, str2, i2, i, str);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
