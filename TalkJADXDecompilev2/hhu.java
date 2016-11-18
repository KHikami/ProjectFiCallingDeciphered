package defpackage;

import android.os.Binder;
import android.os.Parcel;

public abstract class hhu extends Binder implements hht {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                a = a(gyk.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                gyj a2 = a(gyk.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a2 != null ? a2.asBinder() : null);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                a = a(gyk.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.dynamite.IDynamiteLoader");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
