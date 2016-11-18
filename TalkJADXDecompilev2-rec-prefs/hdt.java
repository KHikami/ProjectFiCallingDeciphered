package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

public abstract class hdt extends Binder implements hds {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                hdp hdp;
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    hdp = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof hdp)) {
                        Object hdr = new hdr(readStrongBinder);
                    } else {
                        hdp = (hdp) queryLocalInterface;
                    }
                }
                mo2465a(hdp, parcel.readInt() != 0 ? (LogEventParcelable) LogEventParcelable.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
