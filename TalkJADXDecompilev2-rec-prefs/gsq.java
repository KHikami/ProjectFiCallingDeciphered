package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;

public final class gsq implements gso {
    private IBinder f16023a;

    public gsq(IBinder iBinder) {
        this.f16023a = iBinder;
    }

    public IBinder asBinder() {
        return this.f16023a;
    }

    public int mo2330a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.dialer.incallui.IInCallUiControllerService");
            this.f16023a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2331a(PendingIntent pendingIntent) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.dialer.incallui.IInCallUiControllerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16023a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
