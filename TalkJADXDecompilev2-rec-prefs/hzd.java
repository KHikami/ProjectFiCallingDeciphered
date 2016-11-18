package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.DataItemParcelable;

public final class hzd implements Creator<DataItemParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new DataItemParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        Bundle bundle = null;
        Uri uri = null;
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    uri = (Uri) gwb.m1578a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    bundle = gwb.m2304n(parcel, a);
                    break;
                case 5:
                    bArr = gwb.m2319o(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DataItemParcelable(i, uri, bundle, bArr);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
