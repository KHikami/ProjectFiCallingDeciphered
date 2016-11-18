package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

public abstract class gzx extends Binder implements gzw {
    public gzx() {
        attachInterface(this, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    public static gzw a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof gzw)) ? new gzy(iBinder) : (gzw) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        TogglingData togglingData = null;
        switch (i) {
            case 1:
                GoogleHelp googleHelp;
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                if (parcel.readInt() != 0) {
                    googleHelp = (GoogleHelp) GoogleHelp.CREATOR.createFromParcel(parcel);
                }
                a(googleHelp);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                if (parcel.readInt() != 0) {
                    togglingData = (TogglingData) TogglingData.CREATOR.createFromParcel(parcel);
                }
                a(togglingData);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                a();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                b();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                c();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                d();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
