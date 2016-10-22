package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

/* renamed from: hko */
public final class hko implements Creator<GeofencingRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GeofencingRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    list = gwb.c(parcel, a, ParcelableGeofence.CREATOR);
                    break;
                case wi.l /*2*/:
                    i = gwb.f(parcel, a);
                    break;
                case 1000:
                    i2 = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GeofencingRequest(i2, list, i);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
