import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.ConnectionConfiguration;

public final class ibz implements Creator<ConnectionConfiguration> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = gwb.b(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i3 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    str4 = gwb.l(parcel, a);
                    break;
                case wi.z /*3*/:
                    str3 = gwb.l(parcel, a);
                    break;
                case wi.h /*4*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.p /*5*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.s /*6*/:
                    z3 = gwb.c(parcel, a);
                    break;
                case wi.q /*7*/:
                    z2 = gwb.c(parcel, a);
                    break;
                case wi.m /*8*/:
                    str2 = gwb.l(parcel, a);
                    break;
                case wi.n /*9*/:
                    z = gwb.c(parcel, a);
                    break;
                case wi.dr /*10*/:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConnectionConfiguration(i3, str4, str3, i2, i, z3, z2, str2, z, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
