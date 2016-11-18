package p000;

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
        int b = gwb.m1970b(parcel);
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
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 2:
                    bundle = gwb.m2304n(parcel, a);
                    break;
                case 3:
                    placeLocalization = (PlaceLocalization) gwb.m1578a(parcel, a, (Creator) PlaceLocalization.CREATOR);
                    break;
                case 4:
                    latLng = (LatLng) gwb.m1578a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    f = gwb.m2257j(parcel, a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) gwb.m1578a(parcel, a, (Creator) LatLngBounds.CREATOR);
                    break;
                case 7:
                    str6 = gwb.m2288l(parcel, a);
                    break;
                case 8:
                    uri = (Uri) gwb.m1578a(parcel, a, Uri.CREATOR);
                    break;
                case 9:
                    z = gwb.m2114c(parcel, a);
                    break;
                case 10:
                    f2 = gwb.m2257j(parcel, a);
                    break;
                case 11:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 12:
                    j = gwb.m2227h(parcel, a);
                    break;
                case 13:
                    list2 = gwb.m2341r(parcel, a);
                    break;
                case 14:
                    str3 = gwb.m2288l(parcel, a);
                    break;
                case 15:
                    str4 = gwb.m2288l(parcel, a);
                    break;
                case 16:
                    str5 = gwb.m2288l(parcel, a);
                    break;
                case wi.dK /*17*/:
                    list3 = gwb.m2347s(parcel, a);
                    break;
                case wi.dL /*19*/:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 20:
                    list = gwb.m2341r(parcel, a);
                    break;
                case 1000:
                    i = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlaceEntity(i, str, list, list2, bundle, str2, str3, str4, str5, list3, latLng, f, latLngBounds, str6, uri, z, f2, i2, j, placeLocalization);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
