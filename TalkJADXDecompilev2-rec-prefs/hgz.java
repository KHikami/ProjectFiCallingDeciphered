package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hgz implements hgx {
    private IBinder f16941a;

    hgz(IBinder iBinder) {
        this.f16941a = iBinder;
    }

    public gyj mo2539a(gyj gyj, gyj gyj2, gyj gyj3, String str) {
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
            this.f16941a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2540a(gyj gyj, gyj gyj2, gyj gyj3, boolean z) {
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
            this.f16941a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16941a;
    }
}
