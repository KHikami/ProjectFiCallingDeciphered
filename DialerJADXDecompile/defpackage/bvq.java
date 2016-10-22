package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.stats.ConnectionEvent;

/* renamed from: bvq */
public final class bvq implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    j = buf.g(parcel, a);
                    break;
                case rl.f /*4*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.g /*5*/:
                    str2 = buf.k(parcel, a);
                    break;
                case rl.i /*6*/:
                    str3 = buf.k(parcel, a);
                    break;
                case rl.h /*7*/:
                    str4 = buf.k(parcel, a);
                    break;
                case rl.j /*8*/:
                    str5 = buf.k(parcel, a);
                    break;
                case rl.m /*10*/:
                    j2 = buf.g(parcel, a);
                    break;
                case rl.n /*11*/:
                    j3 = buf.g(parcel, a);
                    break;
                case rl.k /*12*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rk.i /*13*/:
                    str6 = buf.k(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConnectionEvent(i, j, i2, str, str2, str3, str4, str5, str6, j2, j3);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }
}
