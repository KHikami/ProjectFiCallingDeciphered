import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import com.google.android.gms.wearable.internal.PutDataResponse;

public final class ial implements Creator<PutDataResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PutDataResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        DataItemParcelable dataItemParcelable = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.z /*3*/:
                    dataItemParcelable = (DataItemParcelable) gwb.a(parcel, a, DataItemParcelable.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PutDataResponse(i2, i, dataItemParcelable);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
