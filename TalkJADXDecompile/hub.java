import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;

public final class hub implements Creator<ParcelableGetOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ParcelableGetOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle = null;
        boolean z = false;
        int b = gwb.b(parcel);
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    z3 = gwb.c(parcel, a);
                    break;
                case wi.l /*2*/:
                    z2 = gwb.c(parcel, a);
                    break;
                case wi.z /*3*/:
                    str = gwb.l(parcel, a);
                    break;
                case wi.h /*4*/:
                    z = gwb.c(parcel, a);
                    break;
                case wi.p /*5*/:
                    bundle = gwb.n(parcel, a);
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
            return new ParcelableGetOptions(i, z3, z2, z, str, bundle);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
