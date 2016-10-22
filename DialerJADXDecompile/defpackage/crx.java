package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.phenotype.Flag;

/* renamed from: crx */
public final class crx implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int i = 0;
        int b = buf.b(parcel);
        long j = 0;
        double d = 0.0d;
        int i2 = 0;
        String str = null;
        boolean z = false;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i3 = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    str2 = buf.k(parcel, a);
                    break;
                case rl.e /*3*/:
                    j = buf.g(parcel, a);
                    break;
                case rl.f /*4*/:
                    z = buf.c(parcel, a);
                    break;
                case rl.g /*5*/:
                    d = buf.j(parcel, a);
                    break;
                case rl.i /*6*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.h /*7*/:
                    bArr = buf.n(parcel, a);
                    break;
                case rl.j /*8*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rl.l /*9*/:
                    i = buf.e(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Flag(i3, str2, j, z, d, str, bArr, i2, i);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Flag[i];
    }
}
