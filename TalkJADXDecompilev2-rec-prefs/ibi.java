package p000;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.AddListenerRequest;

public final class ibi implements Creator<AddListenerRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AddListenerRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        String str2 = null;
        IntentFilter[] intentFilterArr = null;
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
                case 3:
                    intentFilterArr = (IntentFilter[]) gwb.m2067b(parcel, a, IntentFilter.CREATOR);
                    break;
                case 4:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 5:
                    str = gwb.m2288l(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AddListenerRequest(i, iBinder, intentFilterArr, str2, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
