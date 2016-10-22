import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.List;

public final class cog implements Creator {
    public static ActivityRecognitionResult a(Parcel parcel) {
        long j = 0;
        Bundle bundle = null;
        int i = 0;
        int b = buf.b(parcel);
        long j2 = 0;
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    list = buf.c(parcel, a, DetectedActivity.CREATOR);
                    break;
                case rq.c /*2*/:
                    j2 = buf.g(parcel, a);
                    break;
                case rl.e /*3*/:
                    j = buf.g(parcel, a);
                    break;
                case rl.f /*4*/:
                    i = buf.e(parcel, a);
                    break;
                case rl.g /*5*/:
                    bundle = buf.m(parcel, a);
                    break;
                case 1000:
                    i2 = buf.e(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityRecognitionResult(i2, list, j2, j, i, bundle);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
