import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.List;

public final class hrg implements Creator<PolylineOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = gwb.b(parcel);
        List list = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    list = gwb.c(parcel, a, LatLng.CREATOR);
                    break;
                case wi.z /*3*/:
                    f2 = gwb.j(parcel, a);
                    break;
                case wi.h /*4*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.p /*5*/:
                    f = gwb.j(parcel, a);
                    break;
                case wi.s /*6*/:
                    z3 = gwb.c(parcel, a);
                    break;
                case wi.q /*7*/:
                    z2 = gwb.c(parcel, a);
                    break;
                case wi.m /*8*/:
                    z = gwb.c(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PolylineOptions(i2, list, f2, i, f, z3, z2, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
