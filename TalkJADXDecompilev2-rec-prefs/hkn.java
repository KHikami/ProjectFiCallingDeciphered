package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.location.ActivityRecognitionRequest;

public final class hkn implements Creator<ActivityRecognitionRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = gwb.m1970b(parcel);
        long j = 0;
        int[] iArr = null;
        String str2 = null;
        WorkSource workSource = null;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    j = gwb.m2227h(parcel, a);
                    break;
                case 2:
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 3:
                    workSource = (WorkSource) gwb.m1578a(parcel, a, WorkSource.CREATOR);
                    break;
                case 4:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 5:
                    iArr = gwb.m2327p(parcel, a);
                    break;
                case 6:
                    z = gwb.m2114c(parcel, a);
                    break;
                case 7:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 1000:
                    i = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityRecognitionRequest(i, j, z2, workSource, str2, iArr, z, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
