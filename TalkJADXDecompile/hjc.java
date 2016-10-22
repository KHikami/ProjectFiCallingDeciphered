import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.List;

public final class hjc implements Creator<ActivityRecognitionResult> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        Bundle bundle = null;
        int i = 0;
        int b = gwb.b(parcel);
        long j2 = 0;
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    list = gwb.c(parcel, a, DetectedActivity.CREATOR);
                    break;
                case wi.l /*2*/:
                    j2 = gwb.h(parcel, a);
                    break;
                case wi.z /*3*/:
                    j = gwb.h(parcel, a);
                    break;
                case wi.h /*4*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.p /*5*/:
                    bundle = gwb.n(parcel, a);
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
            return new ActivityRecognitionResult(i2, list, j2, j, i, bundle);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
