package defpackage;

import android.os.Binder;
import android.os.Parcel;

/* renamed from: gzk */
public abstract class gzk extends Binder implements gzj {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.gcm.INetworkTaskCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
