package defpackage;

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
        int b = gwb.b(parcel);
        Bundle bundle = null;
        Uri uri = null;
        int i = 0;
        byte[] bArr = null;
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
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DataItemParcelable(i, uri, bundle, bArr);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
