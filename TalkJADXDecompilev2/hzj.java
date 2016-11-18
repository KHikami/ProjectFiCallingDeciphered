package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;

public final class hzj implements Creator<GetChannelOutputStreamResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GetChannelOutputStreamResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i2 = gwb.f(parcel, a);
                    break;
                case 2:
                    i = gwb.f(parcel, a);
                    break;
                case 3:
                    parcelFileDescriptor = (ParcelFileDescriptor) gwb.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetChannelOutputStreamResponse(i2, i, parcelFileDescriptor);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
