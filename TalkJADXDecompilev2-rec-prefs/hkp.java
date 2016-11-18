package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.GestureRequest;
import java.util.List;

public final class hkp implements Creator<GestureRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GestureRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    list = gwb.m2341r(parcel, a);
                    break;
                case 1000:
                    i = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GestureRequest(i, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
