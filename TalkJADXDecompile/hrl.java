import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.Tile;

public final class hrl implements Creator<Tile> {
    public /* synthetic */ Object[] newArray(int i) {
        return new Tile[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i3 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.z /*3*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.h /*4*/:
                    bArr = gwb.o(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Tile(i3, i2, i, bArr);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
