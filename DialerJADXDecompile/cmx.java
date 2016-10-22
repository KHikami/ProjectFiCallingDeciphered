import android.os.IBinder;
import android.os.Parcel;

final class cmx implements cmv {
    private IBinder a;

    cmx(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
            obtain.writeByteArray(bArr);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}
