package defpackage;

import android.os.IBinder;
import android.os.Parcel;

final class hgz implements hgx {
    private IBinder a;

    hgz(IBinder iBinder) {
        this.a = iBinder;
    }

    public gyj a(gyj gyj, gyj gyj2, gyj gyj3, String str) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.net.ISocketFactoryCreator");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            obtain.writeStrongBinder(gyj2 != null ? gyj2.asBinder() : null);
            if (gyj3 != null) {
                iBinder = gyj3.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj a(gyj gyj, gyj gyj2, gyj gyj3, boolean z) {
        int i = 1;
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.net.ISocketFactoryCreator");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            obtain.writeStrongBinder(gyj2 != null ? gyj2.asBinder() : null);
            if (gyj3 != null) {
                iBinder = gyj3.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            if (!z) {
                i = 0;
            }
            obtain.writeInt(i);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
