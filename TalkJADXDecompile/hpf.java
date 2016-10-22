import android.os.IBinder;
import android.os.Parcel;

final class hpf implements hpd {
    private IBinder a;

    hpf(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(hpx hpx) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPolylineClickListener");
            obtain.writeStrongBinder(hpx != null ? hpx.asBinder() : null);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
