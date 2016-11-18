package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.FileTeleporter;

public final class gyz implements Creator<FileTeleporter> {
    public /* synthetic */ Object[] newArray(int i) {
        return new FileTeleporter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) gwb.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    str = gwb.l(parcel, a);
                    break;
                case 4:
                    str2 = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FileTeleporter(i, parcelFileDescriptor, str, str2);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
