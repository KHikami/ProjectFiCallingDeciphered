package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;

public final class gvc implements Creator<BitmapTeleporter> {
    public /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) gwb.m1578a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new BitmapTeleporter(i, parcelFileDescriptor, i2);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
