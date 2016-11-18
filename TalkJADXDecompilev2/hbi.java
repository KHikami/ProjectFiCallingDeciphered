package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;

public abstract class hbi extends Binder implements hbh {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.http.IGoogleHttpService");
                Bundle a = a(parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.http.IGoogleHttpService");
                a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.http.IGoogleHttpService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
