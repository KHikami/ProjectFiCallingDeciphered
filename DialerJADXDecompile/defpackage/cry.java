package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

/* renamed from: cry */
public final class cry implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = buf.b(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i4 = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    str4 = buf.k(parcel, a);
                    break;
                case rl.e /*3*/:
                    i3 = buf.e(parcel, a);
                    break;
                case rl.f /*4*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rl.g /*5*/:
                    str3 = buf.k(parcel, a);
                    break;
                case rl.i /*6*/:
                    str2 = buf.k(parcel, a);
                    break;
                case rl.h /*7*/:
                    z = buf.c(parcel, a);
                    break;
                case rl.j /*8*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.l /*9*/:
                    z2 = buf.c(parcel, a);
                    break;
                case rl.m /*10*/:
                    i = buf.e(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlayLoggerContext(i4, str4, i3, i2, str3, str2, z, str, z2, i);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }
}
