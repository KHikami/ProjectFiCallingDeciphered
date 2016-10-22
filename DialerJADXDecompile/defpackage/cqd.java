package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: cqd */
final class cqd implements cqb {
    private IBinder a;

    cqd(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(Location location) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
            if (location != null) {
                obtain.writeInt(1);
                location.writeToParcel(obtain, 0);
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
