import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

public final class hke implements Creator<LocationRequestUpdateData> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int b = gwb.b(parcel);
        int i = 0;
        int i2 = 1;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        LocationRequestInternal locationRequestInternal = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    locationRequestInternal = (LocationRequestInternal) gwb.a(parcel, a, LocationRequestInternal.CREATOR);
                    break;
                case wi.z /*3*/:
                    iBinder3 = gwb.m(parcel, a);
                    break;
                case wi.h /*4*/:
                    pendingIntent = (PendingIntent) gwb.a(parcel, a, PendingIntent.CREATOR);
                    break;
                case wi.p /*5*/:
                    iBinder2 = gwb.m(parcel, a);
                    break;
                case wi.s /*6*/:
                    iBinder = gwb.m(parcel, a);
                    break;
                case 1000:
                    i = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LocationRequestUpdateData(i, i2, locationRequestInternal, iBinder3, pendingIntent, iBinder2, iBinder);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
