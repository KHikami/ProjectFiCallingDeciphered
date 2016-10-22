import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;

final class cpe implements cpc {
    private IBinder a;

    cpe(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(int i, PendingIntent pendingIntent) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
            obtain.writeInt(i);
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void a(int i, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final void b(int i, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
