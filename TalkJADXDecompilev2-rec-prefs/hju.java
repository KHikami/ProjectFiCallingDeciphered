package p000;

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
                mo2586a(parcel.createTypedArrayList(ParcelableGeofence.CREATOR), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hjr.m19916a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2570a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hjr.m19916a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2588a(parcel.createStringArray(), hjr.m19916a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2584a(hjr.m19916a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2567a(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2568a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a = mo2565a();
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
                mo2577a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, hku.m19994a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2576a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2585a(hku.m19994a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2590b(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2587a(z);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2571a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2578a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, hku.m19994a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                a = mo2589b(parcel.readString());
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
                mo2572a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                LocationAvailability c = mo2592c(parcel.readString());
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
                mo2581a(parcel.readInt() != 0 ? (LocationRequestInternal) LocationRequestInternal.CREATOR.createFromParcel(parcel) : null, hku.m19994a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 53:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2580a(parcel.readInt() != 0 ? (LocationRequestInternal) LocationRequestInternal.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 57:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2574a(parcel.readInt() != 0 ? (GeofencingRequest) GeofencingRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hjr.m19916a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 59:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2582a(parcel.readInt() != 0 ? (LocationRequestUpdateData) LocationRequestUpdateData.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 60:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2575a(parcel.readInt() != 0 ? (GestureRequest) GestureRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.m19692a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 61:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2593c(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.m19692a(parcel.readStrongBinder()));
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
                mo2579a(locationSettingsRequest, hjw, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 64:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                ActivityRecognitionResult a2 = mo2566a(parcel.readString());
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
                mo2569a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.m19692a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 66:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2591b(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.m19692a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 67:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2583a(hjo.m19911a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 68:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2594d(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.m19692a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 69:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2595e(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.m19692a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 70:
                parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                mo2573a(parcel.readInt() != 0 ? (ActivityRecognitionRequest) ActivityRecognitionRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, hfv.m19692a(parcel.readStrongBinder()));
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
