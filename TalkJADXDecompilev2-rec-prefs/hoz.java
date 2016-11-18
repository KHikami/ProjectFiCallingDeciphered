package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.PointOfInterest;

final class hoz implements hox {
    private IBinder f17112a;

    hoz(IBinder iBinder) {
        this.f17112a = iBinder;
    }

    public void mo2802a(PointOfInterest pointOfInterest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPoiClickListener");
            if (pointOfInterest != null) {
                obtain.writeInt(1);
                pointOfInterest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17112a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17112a;
    }
}
