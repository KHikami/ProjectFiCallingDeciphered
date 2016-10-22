import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

public final class coy implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new FusedLocationProviderResult[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    status = (Status) buf.a(parcel, a, Status.CREATOR);
                    break;
                case 1000:
                    i = buf.e(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FusedLocationProviderResult(i, status);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }
}
