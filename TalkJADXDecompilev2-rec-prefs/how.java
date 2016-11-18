package p000;

import android.os.IBinder;
import android.os.Parcel;

final class how implements hou {
    private IBinder f17111a;

    how(IBinder iBinder) {
        this.f17111a = iBinder;
    }

    public void mo2801a(gyj gyj) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            this.f17111a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17111a;
    }
}
