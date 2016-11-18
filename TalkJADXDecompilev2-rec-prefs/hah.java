package p000;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

public abstract class hah extends Binder implements hag {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                mo2440a(parcel.readInt() != 0 ? (GoogleHelp) GoogleHelp.CREATOR.createFromParcel(parcel) : null, gzx.m19066a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                mo2439a(parcel.readInt() != 0 ? (GoogleHelp) GoogleHelp.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null, gzx.m19066a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                mo2438a(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null, gzx.m19066a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                mo2441a(gzx.m19066a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                mo2443b(gzx.m19066a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                mo2444c(gzx.m19066a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                mo2442a(parcel.readString(), gzx.m19066a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
