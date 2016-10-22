import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.signin.internal.AuthAccountResult;

public final class crz implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = buf.b(parcel);
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    i = buf.e(parcel, a);
                    break;
                case rl.e /*3*/:
                    intent = (Intent) buf.a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AuthAccountResult(i2, i, intent);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountResult[i];
    }
}
