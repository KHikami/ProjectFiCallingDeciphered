package p000;

import android.os.IBinder;
import android.os.Parcel;

final class gwu implements gws {
    private IBinder f16315a;

    gwu(IBinder iBinder) {
        this.f16315a = iBinder;
    }

    public void mo2360a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ICancelToken");
            this.f16315a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16315a;
    }
}
