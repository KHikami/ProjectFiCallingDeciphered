package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;
import java.util.List;

public final class hrf implements Creator<PolygonOptions> {
    private PolygonOptions m20726a(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = gwb.m1970b(parcel);
        List list = null;
        List arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i3 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    list = gwb.m2089c(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    gwb.m1776a(parcel, a, arrayList, getClass().getClassLoader());
                    break;
                case 4:
                    f2 = gwb.m2257j(parcel, a);
                    break;
                case 5:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 6:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 7:
                    f = gwb.m2257j(parcel, a);
                    break;
                case 8:
                    z3 = gwb.m2114c(parcel, a);
                    break;
                case 9:
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 10:
                    z = gwb.m2114c(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PolygonOptions(i3, list, arrayList, f2, i2, i, f, z3, z2, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m20726a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
