package defpackage;

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
        int b = gwb.b(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    uri = (Uri) gwb.a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    bundle = gwb.n(parcel, a);
                    break;
                case 5:
                    bArr = gwb.o(parcel, a);
                    break;
                case 6:
                    j = gwb.h(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PutDataRequest(i, uri, bundle, bArr, j);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
