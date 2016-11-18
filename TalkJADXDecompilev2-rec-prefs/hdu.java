package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

final class hdu implements hds {
    private IBinder f16705a;

    hdu(IBinder iBinder) {
        this.f16705a = iBinder;
    }

    public void mo2465a(hdp hdp, LogEventParcelable logEventParcelable) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            if (hdp != null) {
                iBinder = hdp.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            if (logEventParcelable != null) {
                obtain.writeInt(1);
                logEventParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16705a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16705a;
    }
}
