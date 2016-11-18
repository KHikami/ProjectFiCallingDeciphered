package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class hbj implements hbh {
    private IBinder f16516a;

    hbj(IBinder iBinder) {
        this.f16516a = iBinder;
    }

    public Bundle mo2445a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.http.IGoogleHttpService");
            obtain.writeString(str);
            this.f16516a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2446a(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.http.IGoogleHttpService");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f16516a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16516a;
    }
}
