package defpackage;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

/* renamed from: hif */
public abstract class hif extends Binder implements hie {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
                a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(PredictedNetworkQuality.CREATOR));
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
