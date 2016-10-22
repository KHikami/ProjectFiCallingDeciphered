import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;

public final class cru implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        Configuration[] configurationArr = null;
        int b = buf.b(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    str2 = buf.k(parcel, a);
                    break;
                case rl.e /*3*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.f /*4*/:
                    configurationArr = (Configuration[]) buf.b(parcel, a, Configuration.CREATOR);
                    break;
                case rl.g /*5*/:
                    z = buf.c(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Configurations(i, str2, str, configurationArr, z);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Configurations[i];
    }
}
