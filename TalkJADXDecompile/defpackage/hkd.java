package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.ClientIdentity;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

/* renamed from: hkd */
public final class hkd implements Creator<LocationRequestInternal> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestInternal[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = gwb.b(parcel);
        boolean z2 = true;
        List list = LocationRequestInternal.a;
        LocationRequest locationRequest = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    locationRequest = (LocationRequest) gwb.a(parcel, a, LocationRequest.CREATOR);
                    break;
                case wi.h /*4*/:
                    z2 = gwb.c(parcel, a);
                    break;
                case wi.p /*5*/:
                    list = gwb.c(parcel, a, ClientIdentity.CREATOR);
                    break;
                case wi.s /*6*/:
                    str = gwb.l(parcel, a);
                    break;
                case wi.q /*7*/:
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
            return new LocationRequestInternal(i, locationRequest, z2, list, str, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
