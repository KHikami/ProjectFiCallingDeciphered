package defpackage;

import android.os.IBinder;
import android.os.Parcel;

final class gwu implements gws {
    private IBinder a;

    gwu(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ICancelToken");
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
