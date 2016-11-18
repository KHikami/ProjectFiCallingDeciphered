package defpackage;

import android.os.IBinder;
import android.os.Parcel;

final class hzv implements hzt {
    private IBinder a;

    hzv(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
