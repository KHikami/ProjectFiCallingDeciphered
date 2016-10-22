import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.GestureRequest;
import java.util.List;

public final class cpx implements Creator {
    public static GestureRequest a(Parcel parcel) {
        int b = buf.b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    list = buf.r(parcel, a);
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
            return new GestureRequest(i, list);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GestureRequest[i];
    }
}
