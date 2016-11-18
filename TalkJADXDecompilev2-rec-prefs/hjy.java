package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

final class hjy implements hjw {
    private IBinder f17047a;

    hjy(IBinder iBinder) {
        this.f17047a = iBinder;
    }

    public void mo2596a(LocationSettingsResult locationSettingsResult) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.ISettingsCallbacks");
            if (locationSettingsResult != null) {
                obtain.writeInt(1);
                locationSettingsResult.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17047a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17047a;
    }
}
