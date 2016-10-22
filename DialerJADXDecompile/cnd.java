import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

final class cnd implements cnb {
    private IBinder a;

    cnd(IBinder iBinder) {
        this.a = iBinder;
    }

    public final cmy a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            cmy cmy;
            obtain.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardService");
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder == null) {
                cmy = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
                cmy = (queryLocalInterface == null || !(queryLocalInterface instanceof cmy)) ? new cna(readStrongBinder) : (cmy) queryLocalInterface;
            }
            obtain2.recycle();
            obtain.recycle();
            return cmy;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void a(cmv cmv, String str, Map map) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardService");
            if (cmv != null) {
                iBinder = cmv.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            obtain.writeMap(map);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void a(cmv cmv, String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardService");
            if (cmv != null) {
                iBinder = cmv.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            obtain.writeMap(map);
            if (droidGuardResultsRequest != null) {
                obtain.writeInt(1);
                droidGuardResultsRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final int b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardService");
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
