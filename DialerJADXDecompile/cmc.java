import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

public abstract class cmc extends Binder implements cmb {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        LogEventParcelable logEventParcelable = null;
        switch (i) {
            case rq.b /*1*/:
                cly cly;
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    cly = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    cly = (queryLocalInterface == null || !(queryLocalInterface instanceof cly)) ? new cma(readStrongBinder) : (cly) queryLocalInterface;
                }
                if (parcel.readInt() != 0) {
                    bqm bqm = LogEventParcelable.CREATOR;
                    logEventParcelable = bqm.a(parcel);
                }
                a(cly, logEventParcelable);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
