package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class gtn implements Creator<LogEventParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        byte[] bArr = null;
        PlayLoggerContext playLoggerContext = null;
        int i = 0;
        int[] iArr = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    playLoggerContext = (PlayLoggerContext) gwb.m1578a(parcel, a, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr = gwb.m2319o(parcel, a);
                    break;
                case 4:
                    iArr = gwb.m2327p(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LogEventParcelable(i, playLoggerContext, bArr, iArr);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
