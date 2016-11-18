package p000;

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
        int b = gwb.m1970b(parcel);
        long j2 = 0;
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    list = gwb.m2089c(parcel, a, DetectedActivity.CREATOR);
                    break;
                case 2:
                    j2 = gwb.m2227h(parcel, a);
                    break;
                case 3:
                    j = gwb.m2227h(parcel, a);
                    break;
                case 4:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 5:
                    bundle = gwb.m2304n(parcel, a);
                    break;
                case 1000:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityRecognitionResult(i2, list, j2, j, i, bundle);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
