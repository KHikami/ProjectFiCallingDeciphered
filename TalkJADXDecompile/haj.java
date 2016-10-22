import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

public final class haj implements Creator<OverflowMenuItem> {
    public /* synthetic */ Object[] newArray(int i) {
        return new OverflowMenuItem[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intent intent = null;
        int b = gwb.b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
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
                    str = gwb.l(parcel, a);
                    break;
                case wi.h /*4*/:
                    intent = (Intent) gwb.a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OverflowMenuItem(i2, i, str, intent);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
