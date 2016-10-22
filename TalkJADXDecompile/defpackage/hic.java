package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

/* renamed from: hic */
public abstract class hic extends Binder implements hib {
    public hic() {
        attachInterface(this, "com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
                a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PredictedNetworkQuality) PredictedNetworkQuality.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
