package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

/* renamed from: cmd */
final class cmd implements cmb {
    private IBinder a;

    cmd(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(cly cly, LogEventParcelable logEventParcelable) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            if (cly != null) {
                iBinder = cly.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            if (logEventParcelable != null) {
                obtain.writeInt(1);
                logEventParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}
