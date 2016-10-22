package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;

/* renamed from: hre */
public final class hre implements Creator<PointOfInterest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PointOfInterest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        String str = null;
        LatLng latLng = null;
        int i = 0;
        String str2 = null;
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
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PointOfInterest(i, latLng, str, str2);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
