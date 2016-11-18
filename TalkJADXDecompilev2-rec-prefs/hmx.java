package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hmx implements hmv {
    private IBinder f17093a;

    hmx(IBinder iBinder) {
        this.f17093a = iBinder;
    }

    public void mo2773a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
            this.f17093a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17093a;
    }

    public void mo2774b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
            this.f17093a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
