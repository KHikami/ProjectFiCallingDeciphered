package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class hrr extends Binder implements hrq {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        hie hie = null;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
                a(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                hib hid;
                parcel.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
                    hid = (queryLocalInterface == null || !(queryLocalInterface instanceof hib)) ? new hid(readStrongBinder) : (hib) queryLocalInterface;
                }
                a(hid);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
                    hie = (queryLocalInterface == null || !(queryLocalInterface instanceof hie)) ? new hig(readStrongBinder) : (hie) queryLocalInterface;
                }
                a(hie);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.mdm.internal.INetworkQualityService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
