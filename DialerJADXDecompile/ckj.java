import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.FileTeleporter;

public final class ckj implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    parcelFileDescriptor = (ParcelFileDescriptor) buf.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case rl.e /*3*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.f /*4*/:
                    str2 = buf.k(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FileTeleporter(i, parcelFileDescriptor, str, str2);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FileTeleporter[i];
    }
}
