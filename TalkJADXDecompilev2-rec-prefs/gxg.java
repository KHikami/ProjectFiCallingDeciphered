package p000;

import android.os.IBinder;
import android.os.Parcel;

public final class gxg implements gxe {
    private IBinder f16323a;

    public gxg(IBinder iBinder) {
        this.f16323a = iBinder;
    }

    public gyj mo2409a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
            this.f16323a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16323a;
    }

    public gyj mo2410b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
            this.f16323a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
