import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;

public final class cjz implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new DroidGuardResultsRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    bundle = buf.m(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DroidGuardResultsRequest(i, bundle);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }
}
