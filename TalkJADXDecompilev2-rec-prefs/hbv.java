package p000;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

public final class hbv implements hbt {
    private IBinder f16552a;

    public hbv(IBinder iBinder) {
        this.f16552a = iBinder;
    }

    public void mo2447a(Message message) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            if (message != null) {
                obtain.writeInt(1);
                message.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16552a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16552a;
    }
}
