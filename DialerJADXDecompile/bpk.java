import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.analytics.internal.Command;

public abstract class bpk extends Binder implements bpj {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                a(parcel.readHashMap(getClass().getClassLoader()), parcel.readLong(), parcel.readString(), parcel.createTypedArrayList(Command.CREATOR));
                parcel2.writeNoException();
                return true;
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                a();
                parcel2.writeNoException();
                return true;
            case rl.e /*3*/:
                parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
