package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class hra implements Creator<GroundOverlayOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    iBinder = gwb.m(parcel, a);
                    break;
                case 3:
                    latLng = (LatLng) gwb.a(parcel, a, LatLng.CREATOR);
                    break;
                case 4:
                    f = gwb.j(parcel, a);
                    break;
                case 5:
                    f2 = gwb.j(parcel, a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) gwb.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = gwb.j(parcel, a);
                    break;
                case 8:
                    f4 = gwb.j(parcel, a);
                    break;
                case 9:
                    z = gwb.c(parcel, a);
                    break;
                case 10:
                    f5 = gwb.j(parcel, a);
                    break;
                case 11:
                    f6 = gwb.j(parcel, a);
                    break;
                case 12:
                    f7 = gwb.j(parcel, a);
                    break;
                case 13:
                    z2 = gwb.c(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GroundOverlayOptions(i, iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
