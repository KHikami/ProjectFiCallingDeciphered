import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

final class btg implements bte {
    private IBinder a;

    btg(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(Status status) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.api.internal.IStatusCallback");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}
