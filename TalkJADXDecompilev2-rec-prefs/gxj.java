package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ResolveAccountResponse;

public final class gxj implements gxh {
    private IBinder f16324a;

    public gxj(IBinder iBinder) {
        this.f16324a = iBinder;
    }

    public void mo2411a(ResolveAccountResponse resolveAccountResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            if (resolveAccountResponse != null) {
                obtain.writeInt(1);
                resolveAccountResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16324a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16324a;
    }
}
