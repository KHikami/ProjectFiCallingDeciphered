import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

public final class cps implements Creator {
    public static LocationRequestUpdateData a(Parcel parcel) {
        IBinder iBinder = null;
        int b = buf.b(parcel);
        int i = 0;
        int i2 = 1;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        LocationRequestInternal locationRequestInternal = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    locationRequestInternal = (LocationRequestInternal) buf.a(parcel, a, LocationRequestInternal.CREATOR);
                    break;
                case rl.e /*3*/:
                    iBinder3 = buf.l(parcel, a);
                    break;
                case rl.f /*4*/:
                    pendingIntent = (PendingIntent) buf.a(parcel, a, PendingIntent.CREATOR);
                    break;
                case rl.g /*5*/:
                    iBinder2 = buf.l(parcel, a);
                    break;
                case rl.i /*6*/:
                    iBinder = buf.l(parcel, a);
                    break;
                case 1000:
                    i = buf.e(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationRequestUpdateData(i, i2, locationRequestInternal, iBinder3, pendingIntent, iBinder2, iBinder);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }
}
