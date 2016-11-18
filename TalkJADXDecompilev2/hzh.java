package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;

public final class hzh implements Creator<GetCapabilityResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GetCapabilityResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        CapabilityInfoParcelable capabilityInfoParcelable = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i2 = gwb.f(parcel, a);
                    break;
                case 2:
                    i = gwb.f(parcel, a);
                    break;
                case 3:
                    capabilityInfoParcelable = (CapabilityInfoParcelable) gwb.a(parcel, a, CapabilityInfoParcelable.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetCapabilityResponse(i2, i, capabilityInfoParcelable);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
