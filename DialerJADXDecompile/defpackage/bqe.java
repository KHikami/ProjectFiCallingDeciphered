package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.TokenData;
import java.util.List;

/* renamed from: bqe */
public final class bqe implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        boolean z = false;
        int b = buf.b(parcel);
        boolean z2 = false;
        Long l = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.e /*3*/:
                    l = buf.h(parcel, a);
                    break;
                case rl.f /*4*/:
                    z2 = buf.c(parcel, a);
                    break;
                case rl.g /*5*/:
                    z = buf.c(parcel, a);
                    break;
                case rl.i /*6*/:
                    list = buf.s(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TokenData(i, str, l, z2, z, list);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
