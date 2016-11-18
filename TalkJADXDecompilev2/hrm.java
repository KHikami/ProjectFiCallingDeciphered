package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.TileOverlayOptions;

public final class hrm implements Creator<TileOverlayOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = gwb.b(parcel);
        IBinder iBinder = null;
        float f = 0.0f;
        boolean z2 = true;
        int i = 0;
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
                    z = gwb.c(parcel, a);
                    break;
                case 4:
                    f = gwb.j(parcel, a);
                    break;
                case 5:
                    z2 = gwb.c(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TileOverlayOptions(i, iBinder, z, f, z2);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
