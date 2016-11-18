package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

final class hfw implements hfu {
    private IBinder f16880a;

    hfw(IBinder iBinder) {
        this.f16880a = iBinder;
    }

    public void mo2527a(Status status) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.api.internal.IStatusCallback");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16880a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16880a;
    }
}
