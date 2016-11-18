package p000;

import android.os.IBinder;
import android.os.Parcel;

public final class gzl implements gzj {
    private IBinder f16438a;

    public gzl(IBinder iBinder) {
        this.f16438a = iBinder;
    }

    public void mo2428a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            obtain.writeInt(i);
            this.f16438a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16438a;
    }
}
