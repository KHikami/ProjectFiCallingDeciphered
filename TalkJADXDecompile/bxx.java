import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bxx implements Creator<bxw> {
    bxx() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new bxw[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bxw(parcel);
    }
}
