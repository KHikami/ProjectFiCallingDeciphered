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
        int b = gwb.b(parcel);
        int i = 0;
        String str2 = null;
        IntentFilter[] intentFilterArr = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    iBinder = gwb.m(parcel, a);
                    break;
                case wi.z /*3*/:
                    intentFilterArr = (IntentFilter[]) gwb.b(parcel, a, IntentFilter.CREATOR);
                    break;
                case wi.h /*4*/:
                    str2 = gwb.l(parcel, a);
                    break;
                case wi.p /*5*/:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AddListenerRequest(i, iBinder, intentFilterArr, str2, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
