package defpackage;

import android.os.Binder;
import android.os.Parcel;

/* renamed from: cmz */
public abstract class cmz extends Binder implements cmy {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
                a(parcel.readString());
                return true;
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
                byte[] a = a(parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeByteArray(a);
                return true;
            case rl.e /*3*/:
                parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
                a();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
