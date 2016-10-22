import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationAvailability;

public final class col implements Creator {
    public static LocationAvailability a(Parcel parcel) {
        int i = 1;
        int b = buf.b(parcel);
        int i2 = 0;
        int i3 = 1000;
        long j = 0;
        int i4 = 1;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i4 = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    i = buf.e(parcel, a);
                    break;
                case rl.e /*3*/:
                    j = buf.g(parcel, a);
                    break;
                case rl.f /*4*/:
                    i3 = buf.e(parcel, a);
                    break;
                case 1000:
                    i2 = buf.e(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationAvailability(i2, i3, i4, i, j);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
