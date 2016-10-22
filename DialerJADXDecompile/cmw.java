import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class cmw extends Binder implements cmv {
    public cmw() {
        attachInterface(this, "com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
    }

    public static cmv a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cmv)) ? new cmx(iBinder) : (cmv) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
                a(parcel.createByteArray());
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
