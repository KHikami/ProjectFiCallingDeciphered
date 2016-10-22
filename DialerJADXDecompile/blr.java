import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
public abstract class blr extends Binder implements blq {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
                int a = a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
                Bundle a2 = a(parcel.readString());
                parcel2.writeNoException();
                if (a2 != null) {
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.apps.hangouts.telephony.ITeleHangoutsService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
