package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class gsj extends Binder implements gsi {
    public static gsi m18467a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tycho.IVoiceService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof gsi)) {
            return new gsk(iBinder);
        }
        return (gsi) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.apps.tycho.IVoiceService");
                int a = mo2326a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.apps.tycho.IVoiceService");
                boolean b = mo2328b();
                parcel2.writeNoException();
                parcel2.writeInt(b ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.apps.tycho.IVoiceService");
                mo2329c();
                return true;
            case 4:
                gsf gsf;
                parcel.enforceInterface("com.google.android.apps.tycho.IVoiceService");
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    gsf = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.tycho.IProxyNumberCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof gsf)) {
                        gsf = new gsh(readStrongBinder);
                    } else {
                        gsf = (gsf) queryLocalInterface;
                    }
                }
                mo2327a(readString, gsf);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.apps.tycho.IVoiceService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
