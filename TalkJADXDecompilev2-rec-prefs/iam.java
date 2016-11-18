package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

public final class iam implements Creator<RemoveListenerRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new RemoveListenerRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    iBinder = gwb.m2296m(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RemoveListenerRequest(i, iBinder);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
