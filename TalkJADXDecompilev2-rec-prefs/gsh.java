package p000;

import android.os.IBinder;
import android.os.Parcel;

final class gsh implements gsf {
    private IBinder f16010a;

    gsh(IBinder iBinder) {
        this.f16010a = iBinder;
    }

    public IBinder asBinder() {
        return this.f16010a;
    }

    public void mo2262a(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.tycho.IProxyNumberCallback");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f16010a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void mo2261a(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.tycho.IProxyNumberCallback");
            obtain.writeInt(i);
            this.f16010a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
