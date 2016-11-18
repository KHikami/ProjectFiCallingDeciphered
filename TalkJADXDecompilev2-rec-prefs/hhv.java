package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hhv implements hht {
    private IBinder f16982a;

    hhv(IBinder iBinder) {
        this.f16982a = iBinder;
    }

    public int mo2545a(gyj gyj, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            obtain.writeString(str);
            this.f16982a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int mo2546a(gyj gyj, String str, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            obtain.writeString(str);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f16982a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
            return i;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2547a(gyj gyj, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f16982a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16982a;
    }
}
