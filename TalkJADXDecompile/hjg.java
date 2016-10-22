import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;

public final class hjg implements Creator<LocationRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        int i2 = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    j = gwb.h(parcel, a);
                    break;
                case wi.z /*3*/:
                    j2 = gwb.h(parcel, a);
                    break;
                case wi.h /*4*/:
                    z = gwb.c(parcel, a);
                    break;
                case wi.p /*5*/:
                    j3 = gwb.h(parcel, a);
                    break;
                case wi.s /*6*/:
                    i3 = gwb.f(parcel, a);
                    break;
                case wi.q /*7*/:
                    f = gwb.j(parcel, a);
                    break;
                case wi.m /*8*/:
                    j4 = gwb.h(parcel, a);
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
            return new LocationRequest(i, i2, j, j2, z, j3, i3, f, j4);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
