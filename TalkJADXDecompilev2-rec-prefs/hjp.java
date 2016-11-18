package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

final class hjp implements hjn {
    private IBinder f17044a;

    hjp(IBinder iBinder) {
        this.f17044a = iBinder;
    }

    public void mo2561a(FusedLocationProviderResult fusedLocationProviderResult) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (fusedLocationProviderResult != null) {
                obtain.writeInt(1);
                fusedLocationProviderResult.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17044a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17044a;
    }
}
