import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;

public final class bvy implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        List list = null;
        String str2 = null;
        long j2 = 0;
        int i4 = 0;
        String str3 = null;
        String str4 = null;
        float f = 0.0f;
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
                    i3 = buf.e(parcel, a);
                    break;
                case rl.i /*6*/:
                    list = buf.s(parcel, a);
                    break;
                case rl.j /*8*/:
                    j2 = buf.g(parcel, a);
                    break;
                case rl.m /*10*/:
                    str3 = buf.k(parcel, a);
                    break;
                case rl.n /*11*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rl.k /*12*/:
                    str2 = buf.k(parcel, a);
                    break;
                case rk.i /*13*/:
                    str4 = buf.k(parcel, a);
                    break;
                case rk.bV /*14*/:
                    i4 = buf.e(parcel, a);
                    break;
                case rk.bY /*15*/:
                    f = buf.i(parcel, a);
                    break;
                case rk.bX /*16*/:
                    j3 = buf.g(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }
}
