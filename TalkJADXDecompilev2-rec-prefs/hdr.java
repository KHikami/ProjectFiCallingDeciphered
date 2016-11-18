package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

final class hdr implements hdp {
    private IBinder f16704a;

    hdr(IBinder iBinder) {
        this.f16704a = iBinder;
    }

    public void mo2464a(Status status) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16704a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16704a;
    }
}
