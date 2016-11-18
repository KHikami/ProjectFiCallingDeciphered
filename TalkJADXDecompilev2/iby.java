package defpackage;

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
        int b = gwb.b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    bArr = gwb.o(parcel, a);
                    break;
                case 3:
                    str = gwb.l(parcel, a);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) gwb.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    uri = (Uri) gwb.a(parcel, a, Uri.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Asset(i, bArr, str, parcelFileDescriptor, uri);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
