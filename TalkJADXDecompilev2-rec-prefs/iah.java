package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class iah implements Creator<MessageEventParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new MessageEventParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = gwb.m1970b(parcel);
        byte[] bArr = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 3:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    bArr = gwb.m2319o(parcel, a);
                    break;
                case 5:
                    str = gwb.m2288l(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MessageEventParcelable(i2, i, str2, bArr, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
