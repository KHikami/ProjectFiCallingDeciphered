import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Flag;

public final class crt implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        Flag[] flagArr = null;
        int i = 0;
        int i2 = 0;
        String[] strArr = null;
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
                    flagArr = (Flag[]) buf.b(parcel, a, Flag.CREATOR);
                    break;
                case rl.f /*4*/:
                    strArr = buf.q(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Configuration(i2, i, flagArr, strArr);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }
}
