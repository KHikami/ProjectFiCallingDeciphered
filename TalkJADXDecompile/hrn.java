import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

public final class hrn implements Creator<VisibleRegion> {
    public /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int b = gwb.b(parcel);
        int i = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    latLng4 = (LatLng) gwb.a(parcel, a, LatLng.CREATOR);
                    break;
                case wi.z /*3*/:
                    latLng3 = (LatLng) gwb.a(parcel, a, LatLng.CREATOR);
                    break;
                case wi.h /*4*/:
                    latLng2 = (LatLng) gwb.a(parcel, a, LatLng.CREATOR);
                    break;
                case wi.p /*5*/:
                    latLng = (LatLng) gwb.a(parcel, a, LatLng.CREATOR);
                    break;
                case wi.s /*6*/:
                    latLngBounds = (LatLngBounds) gwb.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VisibleRegion(i, latLng4, latLng3, latLng2, latLng, latLngBounds);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
