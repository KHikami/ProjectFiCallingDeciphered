package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hzv implements hzt {
    private IBinder f17491a;

    hzv(IBinder iBinder) {
        this.f17491a = iBinder;
    }

    public void mo3083a(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f17491a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17491a;
    }
}
