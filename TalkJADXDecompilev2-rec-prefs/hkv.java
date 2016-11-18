package p000;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;

final class hkv implements hkt {
    private IBinder f17060a;

    hkv(IBinder iBinder) {
        this.f17060a = iBinder;
    }

    public void mo2599a(Location location) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
            if (location != null) {
                obtain.writeInt(1);
                location.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17060a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17060a;
    }
}
