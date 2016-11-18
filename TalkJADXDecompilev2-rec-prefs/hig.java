package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import java.util.List;

public final class hig implements hie {
    private IBinder f16987a;

    public hig(IBinder iBinder) {
        this.f16987a = iBinder;
    }

    public void mo2552a(Status status, List<PredictedNetworkQuality> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeTypedList(list);
            this.f16987a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16987a;
    }
}
