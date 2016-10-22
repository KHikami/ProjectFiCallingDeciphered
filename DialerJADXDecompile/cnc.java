import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

public abstract class cnc extends Binder implements cnb {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DroidGuardResultsRequest droidGuardResultsRequest = null;
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
                a(cmw.a(parcel.readStrongBinder()), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                return true;
            case rq.c /*2*/:
                IBinder asBinder;
                parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
                cmy a = a();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case rl.e /*3*/:
                parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
                int b = b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            case rl.f /*4*/:
                parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
                cmv a2 = cmw.a(parcel.readStrongBinder());
                String readString = parcel.readString();
                Map readHashMap = parcel.readHashMap(getClass().getClassLoader());
                if (parcel.readInt() != 0) {
                    droidGuardResultsRequest = (DroidGuardResultsRequest) DroidGuardResultsRequest.CREATOR.createFromParcel(parcel);
                }
                a(a2, readString, readHashMap, droidGuardResultsRequest);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.droidguard.internal.IDroidGuardService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
