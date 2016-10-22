package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.location.internal.ParcelableGeofence;

/* renamed from: cpg */
public abstract class cpg extends Binder implements cpf {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        cpi cpi = null;
        Location a;
        con con;
        LocationRequest a2;
        cpr cpr;
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.createTypedArrayList(ParcelableGeofence.CREATOR), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, cpd.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, cpd.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case rl.e /*3*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.createStringArray(), cpd.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case rl.f /*4*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(cpd.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case rl.g /*5*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case rl.i /*6*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case rl.h /*7*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a = a();
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case rl.j /*8*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0) {
                    con = LocationRequest.CREATOR;
                    a2 = con.a(parcel);
                }
                a(a2, cqc.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case rl.l /*9*/:
                LocationRequest a3;
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0) {
                    con = LocationRequest.CREATOR;
                    a3 = con.a(parcel);
                } else {
                    a3 = null;
                }
                a(a3, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case rl.m /*10*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(cqc.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case rl.n /*11*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                b(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case rl.k /*12*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case rk.i /*13*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case rk.h /*20*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0) {
                    con = LocationRequest.CREATOR;
                    a2 = con.a(parcel);
                }
                a(a2, cqc.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case rk.g /*21*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a = b(parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case rk.k /*26*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                LocationAvailability c = c(parcel.readString());
                parcel2.writeNoException();
                if (c != null) {
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 52:
                LocationRequestInternal a4;
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0) {
                    cpr = LocationRequestInternal.CREATOR;
                    a4 = cpr.a(parcel);
                }
                a(a4, cqc.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 53:
                LocationRequestInternal a5;
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0) {
                    cpr = LocationRequestInternal.CREATOR;
                    a5 = cpr.a(parcel);
                } else {
                    a5 = null;
                }
                a(a5, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 57:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (GeofencingRequest) GeofencingRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, cpd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 59:
                LocationRequestUpdateData a6;
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0) {
                    cps cps = LocationRequestUpdateData.CREATOR;
                    a6 = cps.a(parcel);
                }
                a(a6);
                parcel2.writeNoException();
                return true;
            case 60:
                GestureRequest a7;
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0) {
                    cpx cpx = GestureRequest.CREATOR;
                    a7 = cpx.a(parcel);
                } else {
                    a7 = null;
                }
                a(a7, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, btf.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 61:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                c(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, btf.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 63:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                LocationSettingsRequest locationSettingsRequest = parcel.readInt() != 0 ? (LocationSettingsRequest) LocationSettingsRequest.CREATOR.createFromParcel(parcel) : null;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                    cpi = (queryLocalInterface == null || !(queryLocalInterface instanceof cpi)) ? new cpk(readStrongBinder) : (cpi) queryLocalInterface;
                }
                a(locationSettingsRequest, cpi, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 64:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                ActivityRecognitionResult a8 = a(parcel.readString());
                parcel2.writeNoException();
                if (a8 != null) {
                    parcel2.writeInt(1);
                    a8.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 65:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, btf.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 66:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                b(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, btf.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 67:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(cpa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 68:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                d(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, btf.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 69:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                e(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, btf.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
