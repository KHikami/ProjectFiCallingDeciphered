package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

public final class ibm implements Creator<CapabilityInfoParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new CapabilityInfoParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 3:
                    list = gwb.m2089c(parcel, a, NodeParcelable.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CapabilityInfoParcelable(i, str, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
