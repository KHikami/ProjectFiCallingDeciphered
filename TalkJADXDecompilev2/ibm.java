package defpackage;

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
        int b = gwb.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    str = gwb.l(parcel, a);
                    break;
                case 3:
                    list = gwb.c(parcel, a, NodeParcelable.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CapabilityInfoParcelable(i, str, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
