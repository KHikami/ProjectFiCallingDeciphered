package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public final class hks implements hkq {
    private IBinder a;

    public hks(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(LocationAvailability locationAvailability) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
            if (locationAvailability != null) {
                obtain.writeInt(1);
                locationAvailability.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void a(LocationResult locationResult) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
            if (locationResult != null) {
                obtain.writeInt(1);
                locationResult.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
