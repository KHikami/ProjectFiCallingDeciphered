import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;

public final class btp implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num = null;
        int b = buf.b(parcel);
        int i = 0;
        Integer num2 = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    iBinder = buf.l(parcel, a);
                    break;
                case rl.e /*3*/:
                    scopeArr = (Scope[]) buf.b(parcel, a, Scope.CREATOR);
                    break;
                case rl.f /*4*/:
                    num2 = buf.f(parcel, a);
                    break;
                case rl.g /*5*/:
                    num = buf.f(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AuthAccountRequest(i, iBinder, scopeArr, num2, num);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }
}
