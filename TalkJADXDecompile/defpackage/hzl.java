package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;

/* renamed from: hzl */
public final class hzl implements Creator<GetCloudSyncOptInStatusResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GetCloudSyncOptInStatusResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = gwb.b(parcel);
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.z /*3*/:
                    z2 = gwb.c(parcel, a);
                    break;
                case wi.h /*4*/:
                    z = gwb.c(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetCloudSyncOptInStatusResponse(i2, i, z2, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
