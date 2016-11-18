package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.Asset;

public final class iby implements Creator<Asset> {
    public /* synthetic */ Object[] newArray(int i) {
        return new Asset[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        Uri uri = null;
        int b = gwb.m1970b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    bArr = gwb.m2319o(parcel, a);
                    break;
                case 3:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) gwb.m1578a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    uri = (Uri) gwb.m1578a(parcel, a, Uri.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Asset(i, bArr, str, parcelFileDescriptor, uri);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
