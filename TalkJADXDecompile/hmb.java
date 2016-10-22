import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

final class hmb implements hlz {
    private IBinder a;

    hmb(IBinder iBinder) {
        this.a = iBinder;
    }

    public LatLng a(gyj gyj) {
        LatLng latLng = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                latLng = (LatLng) LatLng.CREATOR.createFromParcel(obtain2);
            }
            obtain2.recycle();
            obtain.recycle();
            return latLng;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public VisibleRegion a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            VisibleRegion visibleRegion = obtain2.readInt() != 0 ? (VisibleRegion) VisibleRegion.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return visibleRegion;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj a(LatLng latLng) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
