package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

/* renamed from: cna */
final class cna implements cmy {
    private IBinder a;

    cna(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void a(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            obtain.writeString(str);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final byte[] a(Map map) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            obtain.writeMap(map);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            byte[] createByteArray = obtain2.createByteArray();
            return createByteArray;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}
