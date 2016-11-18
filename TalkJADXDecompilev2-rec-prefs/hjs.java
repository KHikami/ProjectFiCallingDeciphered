package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;

final class hjs implements hjq {
    private IBinder f17045a;

    hjs(IBinder iBinder) {
        this.f17045a = iBinder;
    }

    public void mo2562a(int i, PendingIntent pendingIntent) {
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
            this.f17045a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void mo2563a(int i, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            this.f17045a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17045a;
    }

    public void mo2564b(int i, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            this.f17045a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
