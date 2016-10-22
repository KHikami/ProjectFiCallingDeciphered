import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public final class hrd implements Creator<MarkerOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    latLng = (LatLng) gwb.a(parcel, a, LatLng.CREATOR);
                    break;
                case wi.z /*3*/:
                    str = gwb.l(parcel, a);
                    break;
                case wi.h /*4*/:
                    str2 = gwb.l(parcel, a);
                    break;
                case wi.p /*5*/:
                    iBinder = gwb.m(parcel, a);
                    break;
                case wi.s /*6*/:
                    f = gwb.j(parcel, a);
                    break;
                case wi.q /*7*/:
                    f2 = gwb.j(parcel, a);
                    break;
                case wi.m /*8*/:
                    z = gwb.c(parcel, a);
                    break;
                case wi.n /*9*/:
                    z2 = gwb.c(parcel, a);
                    break;
                case wi.dr /*10*/:
                    z3 = gwb.c(parcel, a);
                    break;
                case wi.dB /*11*/:
                    f3 = gwb.j(parcel, a);
                    break;
                case wi.dM /*12*/:
                    f4 = gwb.j(parcel, a);
                    break;
                case wi.dD /*13*/:
                    f5 = gwb.j(parcel, a);
                    break;
                case wi.g /*14*/:
                    f6 = gwb.j(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MarkerOptions(i, latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
