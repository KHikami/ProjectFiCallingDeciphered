package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: gww */
public abstract class gww extends Binder implements gwv {
    public gww() {
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.ICertData");
                gyj a = a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                return true;
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.ICertData");
                int b = b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.ICertData");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
