package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: hkv */
final class hkv implements hkt {
    private IBinder a;

    hkv(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(Location location) {
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

    public IBinder asBinder() {
        return this.a;
    }
}
