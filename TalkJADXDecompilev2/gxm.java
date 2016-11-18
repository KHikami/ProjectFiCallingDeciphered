package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

public final class gxm implements Creator<FavaDiagnosticsEntity> {
    public /* synthetic */ Object[] newArray(int i) {
        return new FavaDiagnosticsEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i2 = gwb.f(parcel, a);
                    break;
                case 2:
                    str = gwb.l(parcel, a);
                    break;
                case 3:
                    i = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FavaDiagnosticsEntity(i2, str, i);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
