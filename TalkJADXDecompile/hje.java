import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.DetectedActivity;

public final class hje implements Creator<DetectedActivity> {
    public /* synthetic */ Object[] newArray(int i) {
        return new DetectedActivity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    i = gwb.f(parcel, a);
                    break;
                case 1000:
                    i3 = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DetectedActivity(i3, i2, i);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
