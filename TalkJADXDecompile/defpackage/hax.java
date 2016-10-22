package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

/* renamed from: hax */
public final class hax implements Creator<PredictedNetworkQuality> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PredictedNetworkQuality[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        int b = gwb.b(parcel);
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i3 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.z /*3*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.h /*4*/:
                    j2 = gwb.h(parcel, a);
                    break;
                case wi.p /*5*/:
                    j = gwb.h(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PredictedNetworkQuality(i3, i2, i, j2, j);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
