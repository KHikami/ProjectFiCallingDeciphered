import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;

public final class gvc implements Creator<BitmapTeleporter> {
    public /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    parcelFileDescriptor = (ParcelFileDescriptor) gwb.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case wi.z /*3*/:
                    i2 = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new BitmapTeleporter(i, parcelFileDescriptor, i2);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
