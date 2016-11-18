package p000;

import android.os.IBinder;
import android.os.Parcel;

public final class gwx implements gwv {
    private IBinder f16316a;

    public gwx(IBinder iBinder) {
        this.f16316a = iBinder;
    }

    public gyj mo2361a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ICertData");
            this.f16316a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16316a;
    }

    public int mo2362b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ICertData");
            this.f16316a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
