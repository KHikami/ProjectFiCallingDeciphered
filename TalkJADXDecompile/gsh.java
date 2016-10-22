import android.os.IBinder;
import android.os.Parcel;

final class gsh implements gsf {
    private IBinder a;

    gsh(IBinder iBinder) {
        this.a = iBinder;
    }

    public IBinder asBinder() {
        return this.a;
    }

    public void a(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.tycho.IProxyNumberCallback");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void a(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.tycho.IProxyNumberCallback");
            obtain.writeInt(i);
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
