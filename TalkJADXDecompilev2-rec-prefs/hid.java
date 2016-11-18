package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

public final class hid implements hib {
    private IBinder f16986a;

    public hid(IBinder iBinder) {
        this.f16986a = iBinder;
    }

    public void mo2551a(Status status, PredictedNetworkQuality predictedNetworkQuality) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (predictedNetworkQuality != null) {
                obtain.writeInt(1);
                predictedNetworkQuality.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16986a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16986a;
    }
}
