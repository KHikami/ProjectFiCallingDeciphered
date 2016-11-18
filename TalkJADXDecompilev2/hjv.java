package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
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
import java.util.List;

final class hjv implements hjt {
    private IBinder a;

    hjv(IBinder iBinder) {
        this.a = iBinder;
    }

    public Location a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            this.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            Location location = obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return location;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public ActivityRecognitionResult a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeString(str);
            this.a.transact(64, obtain, obtain2, 0);
            obtain2.readException();
            ActivityRecognitionResult activityRecognitionResult = obtain2.readInt() != 0 ? (ActivityRecognitionResult) ActivityRecognitionResult.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return activityRecognitionResult;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(long j, boolean z, PendingIntent pendingIntent) {
        int i = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeLong(j);
            if (!z) {
                i = 0;
            }
            obtain.writeInt(i);
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(PendingIntent pendingIntent) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(PendingIntent pendingIntent, hfu hfu) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hfu != null ? hfu.asBinder() : null);
            this.a.transact(65, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(PendingIntent pendingIntent, hjq hjq, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hjq != null ? hjq.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(Location location) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (location != null) {
                obtain.writeInt(1);
                location.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(Location location, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (location != null) {
                obtain.writeInt(1);
                location.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            this.a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, hfu hfu) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (activityRecognitionRequest != null) {
                obtain.writeInt(1);
                activityRecognitionRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hfu != null ? hfu.asBinder() : null);
            this.a.transact(70, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, hjq hjq) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (geofencingRequest != null) {
                obtain.writeInt(1);
                geofencingRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hjq != null ? hjq.asBinder() : null);
            this.a.transact(57, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(GestureRequest gestureRequest, PendingIntent pendingIntent, hfu hfu) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (gestureRequest != null) {
                obtain.writeInt(1);
                gestureRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hfu != null ? hfu.asBinder() : null);
            this.a.transact(60, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationRequest != null) {
                obtain.writeInt(1);
                locationRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(LocationRequest locationRequest, hkt hkt) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationRequest != null) {
                obtain.writeInt(1);
                locationRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hkt != null ? hkt.asBinder() : null);
            this.a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(LocationRequest locationRequest, hkt hkt, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationRequest != null) {
                obtain.writeInt(1);
                locationRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hkt != null ? hkt.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(20, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(LocationSettingsRequest locationSettingsRequest, hjw hjw, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationSettingsRequest != null) {
                obtain.writeInt(1);
                locationSettingsRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hjw != null ? hjw.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(63, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationRequestInternal != null) {
                obtain.writeInt(1);
                locationRequestInternal.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(53, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(LocationRequestInternal locationRequestInternal, hkt hkt) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationRequestInternal != null) {
                obtain.writeInt(1);
                locationRequestInternal.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hkt != null ? hkt.asBinder() : null);
            this.a.transact(52, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(LocationRequestUpdateData locationRequestUpdateData) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (locationRequestUpdateData != null) {
                obtain.writeInt(1);
                locationRequestUpdateData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(59, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hjn hjn) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeStrongBinder(hjn != null ? hjn.asBinder() : null);
            this.a.transact(67, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hjq hjq, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeStrongBinder(hjq != null ? hjq.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hkt hkt) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeStrongBinder(hkt != null ? hkt.asBinder() : null);
            this.a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(List<ParcelableGeofence> list, PendingIntent pendingIntent, hjq hjq, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeTypedList(list);
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hjq != null ? hjq.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(String[] strArr, hjq hjq, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeStringArray(strArr);
            obtain.writeStrongBinder(hjq != null ? hjq.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }

    public Location b(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeString(str);
            this.a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            Location location = obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return location;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void b(PendingIntent pendingIntent) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void b(PendingIntent pendingIntent, hfu hfu) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hfu != null ? hfu.asBinder() : null);
            this.a.transact(66, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public LocationAvailability c(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            obtain.writeString(str);
            this.a.transact(34, obtain, obtain2, 0);
            obtain2.readException();
            LocationAvailability locationAvailability = obtain2.readInt() != 0 ? (LocationAvailability) LocationAvailability.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return locationAvailability;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void c(PendingIntent pendingIntent, hfu hfu) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hfu != null ? hfu.asBinder() : null);
            this.a.transact(61, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void d(PendingIntent pendingIntent, hfu hfu) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hfu != null ? hfu.asBinder() : null);
            this.a.transact(68, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void e(PendingIntent pendingIntent, hfu hfu) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (pendingIntent != null) {
                obtain.writeInt(1);
                pendingIntent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(hfu != null ? hfu.asBinder() : null);
            this.a.transact(69, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
