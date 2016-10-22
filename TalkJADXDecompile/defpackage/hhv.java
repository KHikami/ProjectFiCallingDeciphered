package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: hhv */
final class hhv implements hht {
    private IBinder a;

    hhv(IBinder iBinder) {
        this.a = iBinder;
    }

    public int a(gyj gyj, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int a(gyj gyj, String str, boolean z) {
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
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            i = obtain2.readInt();
            return i;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj a(gyj gyj, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
