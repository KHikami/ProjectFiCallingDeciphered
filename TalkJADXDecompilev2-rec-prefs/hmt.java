package p000;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

final class hmt implements hmr {
    private IBinder f17090a;

    hmt(IBinder iBinder) {
        this.f17090a = iBinder;
    }

    public void mo2771a(Bitmap bitmap) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            if (bitmap != null) {
                obtain.writeInt(1);
                bitmap.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17090a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2772a(gyj gyj) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            this.f17090a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17090a;
    }
}
