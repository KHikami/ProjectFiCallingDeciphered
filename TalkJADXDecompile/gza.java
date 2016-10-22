import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.LogOptions;

public final class gza implements Creator<LogOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LogOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = gwb.b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    str = gwb.l(parcel, a);
                    break;
                case wi.z /*3*/:
                    z = gwb.c(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LogOptions(i, str, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
