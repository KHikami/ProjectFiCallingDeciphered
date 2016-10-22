import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.List;

public final class hkx implements Creator<LocationSettingsRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = gwb.b(parcel);
        List list = null;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    list = gwb.c(parcel, a, LocationRequest.CREATOR);
                    break;
                case wi.l /*2*/:
                    z2 = gwb.c(parcel, a);
                    break;
                case wi.z /*3*/:
                    z = gwb.c(parcel, a);
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
            return new LocationSettingsRequest(i, list, z2, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
