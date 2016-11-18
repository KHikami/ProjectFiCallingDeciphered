package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.location.internal.ParcelableGeofence;

public abstract class hju extends Binder implements hjt {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        hjw hjw = null;
        Location a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.createTypedArrayList(ParcelableGeofence.CREATOR), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hjr.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hjr.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.createStringArray(), hjr.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(hjr.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 7:
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
            case 8:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, hku.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(hku.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                b(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, hku.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
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
            case wi.dx /*26*/:
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
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (LocationRequestInternal) LocationRequestInternal.CREATOR.createFromParcel(parcel) : null, hku.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 53:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (LocationRequestInternal) LocationRequestInternal.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 57:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (GeofencingRequest) GeofencingRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hjr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 59:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (LocationRequestUpdateData) LocationRequestUpdateData.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 60:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (GestureRequest) GestureRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 61:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                c(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 63:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                LocationSettingsRequest locationSettingsRequest = parcel.readInt() != 0 ? (LocationSettingsRequest) LocationSettingsRequest.CREATOR.createFromParcel(parcel) : null;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                    hjw = (queryLocalInterface == null || !(queryLocalInterface instanceof hjw)) ? new hjy(readStrongBinder) : (hjw) queryLocalInterface;
                }
                a(locationSettingsRequest, hjw, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 64:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                ActivityRecognitionResult a2 = a(parcel.readString());
                parcel2.writeNoException();
                if (a2 != null) {
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 65:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 66:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                b(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 67:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(hjo.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 68:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                d(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 69:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                e(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 70:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a(parcel.readInt() != 0 ? (ActivityRecognitionRequest) ActivityRecognitionRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.a(parcel.readStrongBinder()));
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
