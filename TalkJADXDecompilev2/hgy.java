package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class hgy extends Binder implements hgx {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        gyj a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.common.net.ISocketFactoryCreator");
                a = a(gyk.a(parcel.readStrongBinder()), gyk.a(parcel.readStrongBinder()), gyk.a(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.common.net.ISocketFactoryCreator");
                a = a(gyk.a(parcel.readStrongBinder()), gyk.a(parcel.readStrongBinder()), gyk.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.net.ISocketFactoryCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
