package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

final class hoh implements hof {
    private IBinder f17106a;

    hoh(IBinder iBinder) {
        this.f17106a = iBinder;
    }

    public void mo2795a(LatLng latLng) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17106a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17106a;
    }
}
