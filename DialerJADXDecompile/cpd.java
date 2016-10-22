import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class cpd extends Binder implements cpc {
    public static cpc a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cpc)) ? new cpe(iBinder) : (cpc) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                a(parcel.readInt(), parcel.createStringArray());
                return true;
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                b(parcel.readInt(), parcel.createStringArray());
                return true;
            case rl.e /*3*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
