import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLocalization;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public final class hki implements Creator<PlaceEntity> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PlaceEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list3 = null;
        LatLng latLng = null;
        float f = 0.0f;
        LatLngBounds latLngBounds = null;
        String str6 = null;
        Uri uri = null;
        boolean z = false;
        float f2 = 0.0f;
        int i2 = 0;
        long j = 0;
        PlaceLocalization placeLocalization = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    str = gwb.l(parcel, a);
                    break;
                case wi.l /*2*/:
                    bundle = gwb.n(parcel, a);
                    break;
                case wi.z /*3*/:
                    placeLocalization = (PlaceLocalization) gwb.a(parcel, a, PlaceLocalization.CREATOR);
                    break;
                case wi.h /*4*/:
                    latLng = (LatLng) gwb.a(parcel, a, LatLng.CREATOR);
                    break;
                case wi.p /*5*/:
                    f = gwb.j(parcel, a);
                    break;
                case wi.s /*6*/:
                    latLngBounds = (LatLngBounds) gwb.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                case wi.q /*7*/:
                    str6 = gwb.l(parcel, a);
                    break;
                case wi.m /*8*/:
                    uri = (Uri) gwb.a(parcel, a, Uri.CREATOR);
                    break;
                case wi.n /*9*/:
                    z = gwb.c(parcel, a);
                    break;
                case wi.dr /*10*/:
                    f2 = gwb.j(parcel, a);
                    break;
                case wi.dB /*11*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.dM /*12*/:
                    j = gwb.h(parcel, a);
                    break;
                case wi.dD /*13*/:
                    list2 = gwb.r(parcel, a);
                    break;
                case wi.g /*14*/:
                    str3 = gwb.l(parcel, a);
                    break;
                case wi.dJ /*15*/:
                    str4 = gwb.l(parcel, a);
                    break;
                case wi.dI /*16*/:
                    str5 = gwb.l(parcel, a);
                    break;
                case wi.dK /*17*/:
                    list3 = gwb.s(parcel, a);
                    break;
                case wi.dL /*19*/:
                    str2 = gwb.l(parcel, a);
                    break;
                case wi.k /*20*/:
                    list = gwb.r(parcel, a);
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
            return new PlaceEntity(i, str, list, list2, bundle, str2, str3, str4, str5, list3, latLng, f, latLngBounds, str6, uri, z, f2, i2, j, placeLocalization);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
