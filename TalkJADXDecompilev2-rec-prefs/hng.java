package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;

final class hng implements hne {
    private IBinder f17096a;

    hng(IBinder iBinder) {
        this.f17096a = iBinder;
    }

    public void mo2785a(CameraPosition cameraPosition) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnCameraChangeListener");
            if (cameraPosition != null) {
                obtain.writeInt(1);
                cameraPosition.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17096a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17096a;
    }
}
