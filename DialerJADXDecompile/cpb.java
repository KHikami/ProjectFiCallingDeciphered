import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

final class cpb implements coz {
    private IBinder a;

    cpb(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(FusedLocationProviderResult fusedLocationProviderResult) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (fusedLocationProviderResult != null) {
                obtain.writeInt(1);
                fusedLocationProviderResult.writeToParcel(obtain, 0);
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
