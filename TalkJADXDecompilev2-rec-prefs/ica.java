package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.PutDataRequest;

public final class ica implements Creator<PutDataRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PutDataRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        Uri uri = null;
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
                case 6:
                    j = gwb.m2227h(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PutDataRequest(i, uri, bundle, bArr, j);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
